/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maininmobiliaria;
public class MainInmobiliaria {

    public static void main(String[] args) {
        Inmobiliaria inmobiliaria = new Inmobiliaria();
        Propiedad casa1 = new Casa("Casa del Lago", 200000d, 5, 4);
        Propiedad departamento1 = new Departamento("Torre Alta", 150000d, 8, 10);
        Propiedad terreno1 = null;
        //agregar las propiedades al objeto inmobiliaria aplicando manejo de excepciones
        try{
            inmobiliaria.agregarPropiedad(casa1);
            inmobiliaria.agregarPropiedad(departamento1);
            inmobiliaria.agregarPropiedad(terreno1);
        }catch(IllegalArgumentException excepcion){
            System.out.println("Propiedad nula o inexistente.");
        }
        System.out.println("Inventario:");
        inmobiliaria.mostrarInventario();
        //agregar instrucción para mostrar el inventario
        System.out.println("\nPrecio total de cada propiedad:");
        try{
            System.out.println(casa1.toString());
            System.out.println(departamento1.toString());
            System.out.println(terreno1.toString());
        }catch(NullPointerException excepcion){
            System.out.println("Propiedad nula o inexistente.");
        }
        //agregar instrucción para mostrar el precio de cada propiedad
        try{
            inmobiliaria.alquilarDepartamentos();
        }catch(NullPointerException excepcion){
            System.out.println("\nNo se pudo calcular el precio debido a que existe una propiedad nula o inexistente.");
        }
        //agregar instrucción para mostrar el resultado de alquilerDptos()
    }
}
