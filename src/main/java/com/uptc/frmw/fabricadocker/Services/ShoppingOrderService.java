package com.uptc.frmw.fabricadocker.Services;

import com.uptc.frmw.fabricadocker.Jpa.Models.ShoppingOrder;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.ShoppingOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingOrderService {
    @Autowired
    private ShoppingOrderRepository shoppingOrderRepository;

    public List<ShoppingOrder> findAllShoppingOrder () {
        return shoppingOrderRepository.findAll();
    }
}
