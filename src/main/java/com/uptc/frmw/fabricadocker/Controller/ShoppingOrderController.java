package com.uptc.frmw.fabricadocker.Controller;

import com.uptc.frmw.fabricadocker.Jpa.Models.ShoppingOrder;
import com.uptc.frmw.fabricadocker.Services.ShoppingOrderService;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{idShopping}")
    public ShoppingOrder getShoppingById (@PathVariable Integer idShopping) {
        return shoppingOrderService.findBiIdShopping(idShopping);
    }

    @DeleteMapping("/{idShopping}")
    public void deleteShopping (@PathVariable Integer idShopping) {
        shoppingOrderService.deleteShopping(idShopping);
    }

    @PostMapping
    public ShoppingOrder saveShopping (@RequestBody ShoppingOrder shoppingOrder) {
        return shoppingOrderService.saveShopping(shoppingOrder);
    }

    @PutMapping("/{idShopping}")
    public  ShoppingOrder updateShoppingOrder (@PathVariable Integer idShopping, @RequestBody ShoppingOrder shoppingOrder) {
        return shoppingOrderService.updateShopping(idShopping, shoppingOrder);
    }
}
