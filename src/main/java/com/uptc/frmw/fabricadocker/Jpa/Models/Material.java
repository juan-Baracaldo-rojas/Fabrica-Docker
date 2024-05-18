package com.uptc.frmw.fabricadocker.Jpa.Models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name ="Material")
public class Material {

    @Id
    @Column(name = "id_material")
    private Integer serialNumber;
    @Column(name = "nombre_material")
    private String nombreMaterial;

    @OneToMany(mappedBy = "material")
    private List<ProductType> productTypes;

    public Material() {
    }


    public List<ProductType> getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(List<ProductType> productTypes) {
        this.productTypes = productTypes;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }

    @Override
    public String toString() {
        return "Material{" +
                "serialNumber=" + serialNumber +
                ", nombreMaterial='" + nombreMaterial + '\'' +
                '}';
    }
}


