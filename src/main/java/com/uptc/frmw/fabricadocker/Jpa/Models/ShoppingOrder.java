package com.uptc.frmw.fabricadocker.Jpa.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Orden_Compra")
public class ShoppingOrder {
    @Id
    @Column(name = "numero_orden")
    private Integer numberOrder;
    @Column(name = "fecha_compra")
    private Date shoppingDate;
    @Column(name = "fecha_entrada_esperada")
    private Date expetedDeliveryDate;
    @Column(name = "fecha_entrega_real")
    private Date realDeliveryDate;
    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Client client;

    public ShoppingOrder() {
    }

    public Integer getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(Integer numberOrder) {
        this.numberOrder = numberOrder;
    }

    public Date getShoppingDate() {
        return shoppingDate;
    }

    public void setShoppingDate(Date shoppingDate) {
        this.shoppingDate = shoppingDate;
    }

    public Date getExpetedDeliveryDate() {
        return expetedDeliveryDate;
    }

    public void setExpetedDeliveryDate(Date expetedDeliveryDate) {
        this.expetedDeliveryDate = expetedDeliveryDate;
    }

    public Date getRealDeliveryDate() {
        return realDeliveryDate;
    }

    public void setRealDeliveryDate(Date realDeliveryDate) {
        this.realDeliveryDate = realDeliveryDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "ShoppingOrder{" +
                "numberOrder=" + numberOrder +
                ", shoppingDate=" + shoppingDate +
                ", expetedDeliveryDate=" + expetedDeliveryDate +
                ", realDeliveryDate=" + realDeliveryDate +
                '}';
    }
}
