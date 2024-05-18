package com.uptc.frmw.fabricadocker.Controller;
import com.uptc.frmw.fabricadocker.Jpa.Models.Product;
import com.uptc.frmw.fabricadocker.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/products")
    public class ProductController {

        @Autowired
        private ProductService productService;

        @GetMapping
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Product> getProductById(@PathVariable int id) {
            return productService.getProductById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        }

        @PostMapping
        public Product createProduct(@RequestBody Product product) {
            return productService.createProduct(product);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product product) {
            if (!productService.getProductById(id).isPresent()) {
                return ResponseEntity.notFound().build();
            }
            product.setProductId(id);
            return ResponseEntity.ok(productService.updateProduct(product));
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
            if (!productService.getProductById(id).isPresent()) {
                return ResponseEntity.notFound().build();
            }
            productService.deleteProduct(id);
            return ResponseEntity.noContent().build();
        }
    }


