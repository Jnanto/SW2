
package com.mycompany.sw2;

public class EquipoMedico implements IProducto {
    private String nombre;

    @Override
    public void validarCondiciones() {
        System.out.println("[Validacion] Asignando protocolo de almacenamiento");
        System.out.println("[Validacion] Configurando transporte");
    }

    @Override
    public void registrar(String nombre) {
        this.nombre = nombre;
        System.out.println("Registrando en inventario: " + this.nombre);
    }

    @Override
    public String obtenerDetalles() {
        return "Equipo Medico [" + this.nombre + "] - configurado";
    }
}