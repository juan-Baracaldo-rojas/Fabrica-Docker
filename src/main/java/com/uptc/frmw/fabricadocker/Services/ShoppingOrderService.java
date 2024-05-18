package com.uptc.frmw.fabricadocker.Services;

import com.uptc.frmw.fabricadocker.Jpa.Models.Client;
import com.uptc.frmw.fabricadocker.Jpa.Models.ShoppingOrder;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.ClientRepository;
import com.uptc.frmw.fabricadocker.Jpa.Repositories.ShoppingOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShoppingOrderService {
    @Autowired
    private ShoppingOrderRepository shoppingOrderRepository;
    @Autowired
    private ClientService clientService;

    public List<ShoppingOrder> findAllShoppingOrder () {
        return shoppingOrderRepository.findAll();
    }

    public ShoppingOrder findBiIdShopping (Integer idShopping) {
        Optional<ShoppingOrder> shopping = shoppingOrderRepository.findById(idShopping);
        return shopping.orElse(null);
    }

    public void deleteShopping (Integer idShopping) {
        shoppingOrderRepository.deleteById(idShopping);
    }

    public ShoppingOrder saveShopping (ShoppingOrder shoppingOrder) {
        Client client = clientService.findByIdClient(shoppingOrder.getClient().getIdClient());
        shoppingOrder.setClient(client);
        return shoppingOrderRepository.save(shoppingOrder);
    }

    public ShoppingOrder updateShopping (Integer idShopping, ShoppingOrder shoppingOrder) {
        ShoppingOrder shoppingOrderBd = findBiIdShopping(idShopping);
        if (shoppingOrderBd != null) {
            shoppingOrderBd.setClient(shoppingOrder.getClient());
            shoppingOrderBd.setShoppingDate(shoppingOrder.getShoppingDate());
            shoppingOrderBd.setNumberOrder(shoppingOrder.getNumberOrder());
            shoppingOrderBd.setExpetedDeliveryDate(shoppingOrder.getExpetedDeliveryDate());
            shoppingOrderBd.setRealDeliveryDate(shoppingOrder.getRealDeliveryDate());
            return saveShopping(shoppingOrderBd);
        }
        throw new RuntimeException("Orden de compra no encontrado");
    }

}
