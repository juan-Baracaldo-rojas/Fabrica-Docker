package com.uptc.frmw.fabricadocker.Controller;

import com.uptc.frmw.fabricadocker.Jpa.Models.ShoppingOrder;
import com.uptc.frmw.fabricadocker.Services.ShoppingOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shopping")
public class ShoppingOrderController {
    @Autowired
    private ShoppingOrderService shoppingOrderService;

    @GetMapping
    public List<ShoppingOrder> getAllShoppingOrder() {
        return shoppingOrderService.findAllShoppingOrder();
    }
}
