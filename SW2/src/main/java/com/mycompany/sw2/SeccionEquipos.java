
package com.mycompany.sw2;

public class SeccionEquipos extends TiendaHealthPlus {
    @Override
    protected IProducto crearProducto() {
        return new EquipoMedico();
    }
}