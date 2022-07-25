package com.entregados.cano.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table (name = "COMPROBANTE")
public class Comprobante {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //columna de base de datos con incremento automático y permite que la base de datos genere un nuevo valor con cada operación de inserción
    @Column(name = "ID_COMPROBANTE")
    private Integer id_comprobante;
    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_COMPROBANTE")
    private Date fecha_comprobante;
    @Column(name = "CANTIDAD_PRODUCTOS")
    private Integer cantidad_productos;
    @Column(name = "PRECIO_UNIDAD")
    private Integer precio_unidad;
    @Column(name = "TOTAL_COMPROBANTE")
    private Integer total_comprobante;


    @ManyToOne
    @JoinColumn(name="dni")
    private Cliente cliente;

   /* @OneToMany(mappedBy="comprobante", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<ItemEntity> item;*/






    public Comprobante() {
    }

    public Comprobante(Integer id_comprobante, Date fecha_comprobante, Integer cantidad_productos, Integer precio_unidad, Integer total_comprobante) {
        this.id_comprobante = id_comprobante;
        this.fecha_comprobante = fecha_comprobante;
        this.cantidad_productos = cantidad_productos;
        this.precio_unidad = precio_unidad;
        this.total_comprobante = total_comprobante;
    }


    public Integer getId_comprobante() {
        return id_comprobante;
    }

    public void setId_comprobante(Integer id_comprobante) {
        this.id_comprobante = id_comprobante;
    }

    public Date getFecha_comprobante() {
        return fecha_comprobante;
    }

    public void setFecha_comprobante(Date fecha_comprobante) {
        this.fecha_comprobante = fecha_comprobante;
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

    public Integer getTotal_comprobante() {
        total_comprobante = getCantidad_productos() * getPrecio_unidad();
        return total_comprobante;
    }

    public void setTotal_comprobante(Integer total_comprobante) {
        this.total_comprobante = total_comprobante;
    }
}
