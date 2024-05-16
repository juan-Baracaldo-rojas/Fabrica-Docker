package com.uptc.frmw.fabricadocker.Jpa.Repositories;
import com.uptc.frmw.fabricadocker.Jpa.Models.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface TypeProductRepository extends JpaRepository <ProductType, Integer> {
    }

