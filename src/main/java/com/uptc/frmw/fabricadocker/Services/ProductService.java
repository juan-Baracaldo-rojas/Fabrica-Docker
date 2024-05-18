package com.uptc.frmw.fabricadocker.Services;

import com.uptc.frmw.fabricadocker.Jpa.Models.Product;

import com.uptc.frmw.fabricadocker.Jpa.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
    public class ProductService {

        @Autowired
        private ProductRepository productRepository;

        public List<Product> getAllProducts() {
            return productRepository.findAll();
        }

        public Optional<Product> getProductById(int productId) {
            return productRepository.findById(productId);
        }

        public Product createProduct(Product product) {
            return productRepository.save(product);
        }

        public Product updateProduct(Product product) {
            return productRepository.save(product);
        }

        public void deleteProduct(int idProduct) {
            productRepository.deleteById(idProduct);
        }
    }

