/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maininmobiliaria;
public class Departamento extends Propiedad implements Alquiler{
    private final int numPisos;
    
    public Departamento(String nombre, double precio, int stock, int numPisos) {
        super(nombre, precio, stock);
        this.numPisos = numPisos;
    }

    @Override
    public void calcularPrecioTotal() {
        
    }
    @Override
    public void calcularAlquiler() {
        precio = precio + (numPisos * 10);
    }
}
