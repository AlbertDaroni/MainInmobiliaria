/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maininmobiliaria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inmobiliaria {
    private final Map<String,Propiedad> inventario = new HashMap();
    
    public void agregarPropiedad(Propiedad propiedad) throws IllegalArgumentException{
        Scanner leerPropiedad = new Scanner(System.in);
        System.out.print("Tipo de propiedad: ");
        String tipo = leerPropiedad.nextLine();
        inventario.put(tipo, propiedad);
    }
    public void mostrarInventario(){
        for(Map.Entry<String,Propiedad> i : inventario.entrySet()){
            System.out.println(i.getKey()+": "+i.getValue());
        }
    }
    public double alquilarDepartamentos(){
        double total = 0;
        for(Propiedad i : inventario.values()){
            total += i.precio;
        }
        return total;
    }
}
