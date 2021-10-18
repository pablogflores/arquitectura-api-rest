package com.example.productorest.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @Getter @Setter @Column(name = "id_producto")
    private int id;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;
    @Getter @Setter @Column(name = "precio")
    private double precio;
    @Getter @Setter @Column(name = "stock")
    private int stock;
    @Getter @Setter @Column(name = "url")
    private String url;


}
