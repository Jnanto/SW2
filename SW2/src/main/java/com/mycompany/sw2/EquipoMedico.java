
package com.mycompany.sw2;

public class EquipoMedico implements IProducto {
    private String nombre;

    @Override
    public void validarCondiciones() {
        System.out.println("[Validacion] Asignando protocolo de almacenamiento en cadena de frio o ambiente controlado.");
        System.out.println("[Validacion] Configurando transporte especializado para equipos delicados.");
    }

    @Override
    public void registrar(String nombre) {
        this.nombre = nombre;
        System.out.println("-> Registrando en inventario el equipo medico: " + this.nombre);
    }

    @Override
    public String obtenerDetalles() {
        return "Equipo Medico [" + this.nombre + "] - Logistica de transporte configurada.";
    }
}