package com.example.productorest.dao;

import com.example.productorest.models.Producto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional

public class ProductoDaoImp implements ProductoDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Producto> getProductos() {
        String query = "FROM Producto";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void eliminar(int id) {
        Producto producto = entityManager.find(Producto.class, id); //Buscar el producto
        entityManager.remove(producto);
    }

    @Override
    public void registrar(Producto producto) {
        entityManager.merge(producto);
    }
}
