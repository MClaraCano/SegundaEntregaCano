package com.entregados.cano.model;


import javax.persistence.*;

@Entity
@Table(name = "PRODUCTO")
public class Producto {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_PRODUCTO")
    private Integer id_producto;
    @Column(name = "NOMBREPRODUCTO")
    private String nombreProducto;
    @Column(name = "PRECIO")
    private Integer precio;

    @Column(name = "STOCK")
    private Integer stock;

    public Producto(Integer stock) {
        this.stock = stock;
    }

    public Producto(Integer id_producto, String nombreProducto, Integer precio, Integer stock) {
        this.id_producto = id_producto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
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

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
