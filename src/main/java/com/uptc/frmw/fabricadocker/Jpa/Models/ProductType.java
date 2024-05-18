package com.uptc.frmw.fabricadocker.Jpa.Models;
import jakarta.persistence.*;


@Entity
@Table(name = "Tipo_Producto")
public class ProductType {
    @Id
    @Column(name = "id_tipo_producto")
    private int productTypeId;

    @Column(name = "nombre")
    private String name;
    @Column(name = "descripcion")
    private String description;


    @ManyToOne
    @JoinColumn(name = "id_material")
    private Material material;

    public ProductType() {
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
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

   /* public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }*/

    @Override
    public String toString() {
        return "ProductType{" +
                "productTypeId=" + productTypeId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
              /*  ", material=" + material +*/
                '}';
    }
}
