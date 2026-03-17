package com.mycompany.sw2;

public abstract class TiendaHealthPlus {

    protected abstract IProducto crearProducto();

    public IProducto procesarAltaProducto(String nombreProducto) {
        IProducto producto = crearProducto();
        System.out.println("Iniciando validacion");
        producto.validarCondiciones();
        producto.registrar(nombreProducto);
        System.out.println("Estado final: " + producto.obtenerDetalles());
        System.out.println("---------------------------------------------------");
        return producto;
    }
}
