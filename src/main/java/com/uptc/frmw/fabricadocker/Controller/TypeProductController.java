package com.uptc.frmw.fabricadocker.Controller;
import com.uptc.frmw.fabricadocker.Jpa.Models.ProductType;
import com.uptc.frmw.fabricadocker.Services.TypeProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/TipoProducto")
public class TypeProductController {

    @Autowired
    private TypeProductService typeProductService;

    @GetMapping
    public List<ProductType> getAllProductTypes() {

        return typeProductService.getAllProductTypes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductType> getProductTypeById(@PathVariable int id) {
        return typeProductService.getProductTypeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ProductType createProductType(@RequestBody ProductType productType) {
        return typeProductService.createProductType(productType);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductType> updateProductType(@PathVariable int id, @RequestBody ProductType productType) {
        if (!typeProductService.getProductTypeById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        productType.setProductTypeId(id);
        return ResponseEntity.ok(typeProductService.updateProductType(productType));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductType(@PathVariable int id) {
        if (!typeProductService.getProductTypeById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        typeProductService.deleteProductType(id);
        return ResponseEntity.noContent().build();
    }
}
