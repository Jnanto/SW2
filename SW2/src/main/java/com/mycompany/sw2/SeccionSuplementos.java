package com.mycompany.sw2;

public class SeccionSuplementos extends TiendaHealthPlus {
    @Override
    protected IProducto crearProducto() {
        return new Suplemento();
    }
}