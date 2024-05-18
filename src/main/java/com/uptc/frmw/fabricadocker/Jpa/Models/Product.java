package com.uptc.frmw.fabricadocker.Jpa.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class Product {
    @Id
    @Column(name = "id_producto")
    private int productId;

    @Column(name = "Nombre")
    private String name;
    @Column(name = "Descripcion")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_tipo_producto ")
    private ProductType productType;

    @ManyToOne
    @JoinColumn(name = "id_maquina")
    private Machine machine;

    public Product() {
    }



    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", productType=" + productType +
                ", machine=" + machine +
                '}';
    }
}
