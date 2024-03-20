/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maininmobiliaria;
public class Terreno extends Propiedad{
    private double area;
    
    public Terreno(String nombre, double precio, int stock, double area) {
        super(nombre, precio, stock);
        this.area = area;
    }

    @Override
    public void calcularPrecioTotal() {
        if(stock > 10){
            precio -= precio * 0.7;
        }
    }
}
