package com.uptc.frmw.fabricadocker.Controller;

import com.uptc.frmw.fabricadocker.Jpa.Models.Material;
import com.uptc.frmw.fabricadocker.Jpa.Models.ProductType;
import com.uptc.frmw.fabricadocker.Services.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Material")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @GetMapping
    public List<Material> getAllMaterials() {
        return materialService.getAllMaterials();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Material> getMaterialById(@PathVariable int id) {
        return materialService.getMaterialById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public void createMaterial(@RequestBody Material material) {
        materialService.insertMaterial(material);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Material> updateMaterial(@PathVariable int id, @RequestBody Material material) {
        if (!materialService.getMaterialById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        material.setSerialNumber(id);
        return ResponseEntity.ok(materialService.updateMaterial(material));
    }

               @DeleteMapping("/{id}")
            public ResponseEntity<Void> deleteMaterial(@PathVariable int id) {
                if (!materialService.getMaterialById(id).isPresent()) {
                    return ResponseEntity.notFound().build();
                }
                materialService.deleteMaterial(id);
                return ResponseEntity.noContent().build();
            }

            @GetMapping("/{id}/productTypes")
            public ResponseEntity<List<ProductType>> getProductTypesByMaterial(@PathVariable int id) {
                List<ProductType> productTypes = materialService.getProductTypesByMaterial(id);
                if (productTypes == null) {
                    return ResponseEntity.notFound().build();
                }
                return ResponseEntity.ok(productTypes);
            }
        }
