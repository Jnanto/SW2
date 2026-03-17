
package com.mycompany.sw2;

public class Medicamento implements IProducto {
    private String nombre;

    @Override
    public void validarCondiciones() {
        System.out.println("[Validación] Verificando prescripcion medica");
        System.out.println("[Validación] Comprobando vigencia");
        System.out.println("[Validación] Evaluando restricciones");
    }

    @Override
    public void registrar(String nombre) {
        this.nombre = nombre;
        System.out.println("Registrando en inventario: " + this.nombre);
    }

    @Override
    public String obtenerDetalles() {
        return "Medicamento [" + this.nombre + "] - Aprobado y con registro sanitario";
    }
}