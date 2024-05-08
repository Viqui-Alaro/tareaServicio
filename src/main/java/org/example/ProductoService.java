package org.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {
    private final List<Producto> productos;

    public ProductoService() {
        productos = new ArrayList<>();
        productos.add(new Producto(1, "Producto A", 10.0));
        productos.add(new Producto(2, "Producto B", 15.0));
        productos.add(new Producto(3, "Producto C", 20.0));
    }

    public List<Producto> obtenerProductos() {
        return productos;
    }
}