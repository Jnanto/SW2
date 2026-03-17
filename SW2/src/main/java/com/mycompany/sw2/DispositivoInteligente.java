package com.mycompany.sw2;
public class DispositivoInteligente implements IProducto {
    private String nombre;

    @Override
    public void validarCondiciones() {
        System.out.println("[Validacion] Verificando compatibilidad con aplicaciones moviles del sistema.");
        System.out.println("[Validacion] Realizando prueba de conexión de sensores para monitoreo de signos vitales.");
    }

    @Override
    public void registrar(String nombre) {
        this.nombre = nombre;
        System.out.println("-> Registrando en inventario el dispositivo inteligente: " + this.nombre);
    }

    @Override
    public String obtenerDetalles() {
        return "Dispositivo Inteligente [" + this.nombre + "] - Sincronizado y listo para monitoreo.";
    }
}