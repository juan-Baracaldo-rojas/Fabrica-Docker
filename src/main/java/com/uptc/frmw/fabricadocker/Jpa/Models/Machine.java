package com.uptc.frmw.fabricadocker.Jpa.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name ="MAQUINA")
public class Machine {
    @Id
    @Column(name = "numero_serie")
    private Integer serialNumber;
    @Column(name = "marca")
    private String brand;
    @Column(name = "modelo")
    private String model;
    @Column(name = "fecha_compra")
    private Date shoppingDate;

    public Machine() {
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getShoppingDate() {
        return shoppingDate;
    }

    public void setShoppingDate(Date shoppingDate) {
        this.shoppingDate = shoppingDate;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "serialNumber=" + serialNumber +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", shoppingDate=" + shoppingDate +
                '}';
    }
}
