package com.codeapps.persistence.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class ComprasProductos {
    
    @EmbeddedId
    private ComprasProductosPK id;
    
    private Integer cantidad;
    private Double total;
    private Boolean estado;

    
    public ComprasProductosPK getId() {
        return id;
    }
    public void setId(ComprasProductosPK id) {
        this.id = id;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    
}