package com.uptc.frmw.fabricadocker.Jpa.Repositories;

import com.uptc.frmw.fabricadocker.Jpa.Models.ShoppingOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingOrderRepository extends JpaRepository<ShoppingOrder, Integer> {
}
