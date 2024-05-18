package com.uptc.frmw.fabricadocker.Services;


import com.uptc.frmw.fabricadocker.Jpa.Models.Material;
import com.uptc.frmw.fabricadocker.Jpa.Models.ProductType;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.MaterialRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MaterialService {


    @Autowired
        private MaterialRepository materialRepository;

        @Autowired
        private EntityManager entityManager;

        @Transactional
        public void insertMaterial(Material material) {
            entityManager.persist(material);
        }

        public Optional<Material> getMaterialById(int materialId) {
            return materialRepository.findById(materialId);
        }

        public List<ProductType> getProductTypesByMaterial(int materialId) {
            Optional<Material> material = materialRepository.findById(materialId);
            return material.map(Material::getProductTypes).orElse(null);
        }

        public List<Material> getAllMaterials() {
            return materialRepository.findAll();
        }

        public Material updateMaterial(Material material) {
            return materialRepository.save(material);
        }

        public void deleteMaterial(int materialId) {
            materialRepository.deleteById(materialId);
        }
    }


