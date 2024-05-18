package com.uptc.frmw.fabricadocker.Jpa.Repositories;

import com.uptc.frmw.fabricadocker.Jpa.Models.ShoppingOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShoppingOrderRepository extends JpaRepository<ShoppingOrder, Integer> {

    @Query("select b from ShoppingOrder b where b.client.idClient =:idClient")
    List<ShoppingOrder> findByClient(Integer idClient);
}
