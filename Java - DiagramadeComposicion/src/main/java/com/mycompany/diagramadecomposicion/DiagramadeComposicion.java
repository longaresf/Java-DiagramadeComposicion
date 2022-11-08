/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.diagramadecomposicion;

/**
 *
 * @author fco
 */
public class DiagramadeComposicion {

    public static void main(String[] args) {
        int dia;
        int mes;
        int anio;
        String detalle = null;
        int numero = 0;
        
        
        Fecha fecha = new Fecha(27,10,2022);
        Recibo recibo = new Recibo(fecha,"Compra telefono",2276);
        

        System.out.println(fecha);
        System.out.println(recibo);
    }
}
