package com.uptc.frmw.fabricadocker.Jpa.Models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

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

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "Maquina_Trabajador",
            joinColumns = @JoinColumn(name = "numero_serie"),
            inverseJoinColumns = @JoinColumn(name = "ID_TRABAJADOR"))
    private List<Worker> workers;

    public Machine() {
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
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
