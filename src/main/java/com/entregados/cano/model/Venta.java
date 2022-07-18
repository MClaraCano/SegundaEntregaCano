package com.entregados.cano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Venta {

    @Column(name = "ID_VENTA")
    @Id
    private Integer id_venta;
    @Column(name = "FECHA_VENTA")
    private Date fecha_venta;
    @Column(name = "CANTIDAD_PRODUCTOS")
    private Integer cantidad_productos;
    @Column(name = "PRECIO_UNIDAD")
    private Integer precio_unidad;
    @Column(name = "TOTAL_VENTA")
    private Integer total_venta;

    public Venta() {
    }

    public Venta(Integer id_venta, Date fecha_venta, Integer cantidad_productos, Integer precio_unidad, Integer total_venta) {
        this.id_venta = id_venta;
        this.fecha_venta = fecha_venta;
        this.cantidad_productos = cantidad_productos;
        this.precio_unidad = precio_unidad;
        this.total_venta = total_venta;
    }

    public Integer getId_venta() {
        return id_venta;
    }

    public void setId_venta(Integer id_venta) {
        this.id_venta = id_venta;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public Integer getCantidad_productos() {
        return cantidad_productos;
    }

    public void setCantidad_productos(Integer cantidad_productos) {
        this.cantidad_productos = cantidad_productos;
    }

    public Integer getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(Integer precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public Integer getTotal_venta() {
        total_venta = getCantidad_productos() * getPrecio_unidad();
        return total_venta;
    }

    public void setTotal_venta(Integer total_venta) {
        this.total_venta = total_venta;
    }
}
