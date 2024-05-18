package com.uptc.frmw.fabricadocker.Jpa.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Cliente")
public class Client {
    @Id
    @Column(name = "id_cliente")
    private Integer idClient;
    @Column(name = "direccion")
    private String address;
    @Column(name = "numero_telefonico")
    private String numberPhone;
    @Column(name = "nombre_contacto")
    private String contactName;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
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
