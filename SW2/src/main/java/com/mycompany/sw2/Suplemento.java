package com.mycompany.sw2;
public class Suplemento implements IProducto {
    private String nombre;

    @Override
    public void validarCondiciones() {
        System.out.println("[Validacion] Verificando Disponibilidad");
        System.out.println("[Validacion] Realizando prueba de calidad");
    }

    @Override
    public void registrar(String nombre) {
        this.nombre = nombre;
        System.out.println("Registrando en inventario: " + this.nombre);
    }

    @Override
    public String obtenerDetalles() {
        return "Suplemento [" + this.nombre + "] - listo";
    }
}