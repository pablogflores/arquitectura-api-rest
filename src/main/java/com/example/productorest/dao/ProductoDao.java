package com.example.productorest.dao;

import com.example.productorest.models.Producto;

import java.util.List;

public interface ProductoDao {

    List<Producto> getProductos();

    void eliminar(int id);

    void registrar(Producto producto);
}
