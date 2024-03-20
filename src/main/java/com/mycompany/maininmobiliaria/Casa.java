/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maininmobiliaria;
public class Casa extends Propiedad{
    private int numHabitaciones;
    
    public Casa(String nombre, double precio, int stock, int numHabitaciones) {
        super(nombre, precio, stock);
        this.numHabitaciones = numHabitaciones;
    }

    @Override
    public void calcularPrecioTotal() {
        if(stock > 10){
            precio -= precio * 0.5;
        }
    }
}
