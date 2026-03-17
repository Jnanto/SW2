package com.mycompany.sw2;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        List<IProducto> inventario = new ArrayList<>();
        boolean continuar = true;

        System.out.println("=== Sistema de Gestion Health Plus ===");

        while (continuar) {
            System.out.println("\nSeleccione una operacion:");
            System.out.println("1. Registrar Medicamento");
            System.out.println("2. Registrar Equipo Medico");
            System.out.println("3. Registrar Dispositivo Inteligente");
            System.out.println("4. Ver inventario registrado");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");

            String opcion = x.nextLine();

            if (opcion.equals("5")) {
                continuar = false;
                System.out.println("Cerrando el sistema");
                continue;
            }

            if (opcion.equals("4")) {
                System.out.println("\n--- Inventario Actual ---");
                if (inventario.isEmpty()) {
                    System.out.println("No hay productos registrados");
                } else {
                    for (int i = 0; i < inventario.size(); i++) {
                        System.out.println((i + 1) + ". " + inventario.get(i).obtenerDetalles());
                    }
                }
                System.out.println("-------------------------");
                continue;
            }

            TiendaHealthPlus seccion = null;

            switch (opcion) {
                case "1" ->
                    seccion = new SeccionFarmacia();
                case "2" ->
                    seccion = new SeccionEquipos();
                case "3" ->
                    seccion = new SeccionTecnologia();
                default ->
                    System.out.println("Opcion no valida");
            }

            if (seccion != null) {
                System.out.print("Ingrese el nombre del articulo: ");
                String nombreArticulo = x.nextLine();
                System.out.println("\n--- Procesando solicitud ---");
                IProducto nuevoProducto = seccion.procesarAltaProducto(nombreArticulo);
                inventario.add(nuevoProducto);
            }
        }

        x.close();
    }
}
