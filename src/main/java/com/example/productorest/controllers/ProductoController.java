package com.example.productorest.controllers;


import com.example.productorest.dao.ProductoDao;
import com.example.productorest.models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoDao productoDao;



   @RequestMapping (value = "/all", method = RequestMethod.GET)
    public List<Producto> getProductos(){
    return productoDao.getProductos();

   }

   @RequestMapping(value = "/add", method = RequestMethod.POST)
   public void registrarProducto(@RequestBody Producto producto){

     productoDao.registrar(producto);
   }
    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void eliminar( @PathVariable  int id){
     productoDao.eliminar(id);

    }



}
