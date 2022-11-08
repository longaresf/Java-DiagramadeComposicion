/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramadecomposicion;

/**
 *
 * @author fco
 */
public class Recibo extends Comprobante {

    private Proveedor proveedor;
    private float total;
    private String detalle;
    private int numero;
    Fecha fecha;

    public Recibo(Fecha fecha, String detalle, int numero) {
        super();
            this.detalle = detalle;
            this.numero = numero;
            this.fecha = fecha;
    }

    public Recibo(Proveedor proveedor, float total, String detalle) {
        this.proveedor = proveedor;
        this.total = total;
        this.detalle = detalle;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "El Recibo del "+fecha+" Detalle: "+detalle+" Número: "+numero;
    }



}
