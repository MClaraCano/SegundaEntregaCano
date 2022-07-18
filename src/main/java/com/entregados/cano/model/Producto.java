package com.entregados.cano.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCTO")
public class Producto {

    @Column(name = "ID_PRODUCTO")
    @Id
    private Integer id_producto;
    @Column(name = "NOMBREPRODUCTO")
    private String nombreProducto;
    @Column(name = "PRECIO")
    private Integer precio;

    public Producto() {
    }

    public Producto(Integer id_producto, String nombreProducto, Integer precio) {
        this.id_producto = id_producto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
