package com.mycompany.sw2;

public class SeccionTecnologia extends TiendaHealthPlus {
    @Override
    protected IProducto crearProducto() {
        return new DispositivoInteligente();
    }
}