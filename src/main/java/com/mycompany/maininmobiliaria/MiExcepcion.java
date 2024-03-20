/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maininmobiliaria;
public class MiExcepcion extends Exception{
    private String mensaje;

    public MiExcepcion() {}

    public MiExcepcion(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "MiExcepcion{"+mensaje+'}';
    }
}
