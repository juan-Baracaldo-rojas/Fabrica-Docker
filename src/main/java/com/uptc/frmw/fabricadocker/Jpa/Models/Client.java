package com.uptc.frmw.fabricadocker.Jpa.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Cliente")
public class Client {
    @Id
    @Column(name = "idClient")
    private Integer idClient;
    @Column(name = "direccion")
    private String address;
    @Column(name = "numeroTelefonico")
    private String numberPhone;
    @Column(name = "nombreContacto")
    private String contactName;
    @OneToMany(mappedBy = "client")
    private List<ShoppingOrder> shoppingOrders;

    public Client() {
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public List<ShoppingOrder> getShoppingOrders() {
        return shoppingOrders;
    }

    public void setShoppingOrders(List<ShoppingOrder> shoppingOrders) {
        this.shoppingOrders = shoppingOrders;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", address='" + address + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", contactName='" + contactName + '\'' +
                '}';
    }
}
