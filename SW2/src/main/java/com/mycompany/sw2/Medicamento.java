
package com.mycompany.sw2;

public class Medicamento implements IProducto {
    private String nombre;

    @Override
    public void validarCondiciones() {
        System.out.println("[Validación] Verificando prescripcion medica obligatoria.");
        System.out.println("[Validación] Comprobando vigencia del registro sanitario.");
        System.out.println("[Validación] Evaluando restricciones de compra por cantidad.");
    }

    @Override
    public void registrar(String nombre) {
        this.nombre = nombre;
        System.out.println("-> Registrando en inventario el medicamento: " + this.nombre);
    }

    @Override
    public String obtenerDetalles() {
        return "Medicamento [" + this.nombre + "] - Aprobado y con registro sanitario validado.";
    }
}