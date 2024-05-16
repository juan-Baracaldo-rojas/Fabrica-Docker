package com.uptc.frmw.fabricadocker.Jpa.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "OrdenCompra")
public class ShoppingOrder {
    @Id
    @Column(name = "numeroOrden")
    private Integer numberOrder;
    @Column(name = "fechaCompra")
    private Date shoppingDate;
    @Column(name = "fechaEntradaEsperada")
    private Date expetedDeliveryDate;
    @Column(name = "fechaEntregaReal")
    private Date realDeliveryDate;
    @ManyToOne
    @JoinColumn(name = "idClinet", nullable = false)
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
