
package com.mycompany.sw2;
public class SeccionFarmacia extends TiendaHealthPlus {
    @Override
    protected IProducto crearProducto() {
        return new Medicamento();
    }
}