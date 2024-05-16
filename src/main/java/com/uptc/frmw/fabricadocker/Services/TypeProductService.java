package com.uptc.frmw.fabricadocker.Services;

import com.uptc.frmw.fabricadocker.Jpa.Models.ProductType;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.TypeProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeProductService {

    @Autowired
    private TypeProductRepository typeProductRepository;

    public List<ProductType> getAllProductTypes() {
        return typeProductRepository.findAll();
    }


    public Optional<ProductType> getProductTypeById(int productTypeId) {
        return typeProductRepository.findById(productTypeId);
    }

    public ProductType createProductType(ProductType productType) {
        return typeProductRepository.save(productType);
    }

    public ProductType updateProductType(ProductType productType) {
        return typeProductRepository.save(productType);
    }

    public void deleteProductType(int productTypeId) {
        typeProductRepository.deleteById(productTypeId);
    }
}