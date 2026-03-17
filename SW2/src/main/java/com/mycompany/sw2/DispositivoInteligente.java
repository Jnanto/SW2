package com.mycompany.sw2;
public class DispositivoInteligente implements IProducto {
    private String nombre;

    @Override
    public void validarCondiciones() {
        System.out.println("[Validacion] Verificando compatibilidad");
        System.out.println("[Validacion] Realizando prueba de conexión");
    }

    @Override
    public void registrar(String nombre) {
        this.nombre = nombre;
        System.out.println("Registrando en inventario: " + this.nombre);
    }

    @Override
    public String obtenerDetalles() {
        return "Dispositivo Inteligente [" + this.nombre + "] - listo";
    }
}