/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Cuenta {
    private String nombreCliente;
    private double iva;
    private ArrayList<Menu> listaMenu = new ArrayList<>();
    private double valorCancelar;
    private double subtotal;

    public Cuenta(String n, double i, ArrayList<Menu> lista) {
        nombreCliente = n;
        iva = i;
        listaMenu = lista;
    }

    public void establecerNombreCliente(String c) {
        this.nombreCliente = c;
    }

    public void establecerIva(double c) {
        this.iva = c;
    }

    public void establecerListaMenu(ArrayList<Menu> c) {
        this.listaMenu = c;
    }

    public void establecerSubtotal() {
        for (int i = 0; i < listaMenu.size(); i++) {
            subtotal += listaMenu.get(i).valorMenu;
        }
    }
    public void establecerValorCancelar() {
        valorCancelar = (subtotal + ((subtotal*iva)/(100)));
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public double obtenerIva() {
        return iva;
    }

    public ArrayList<Menu> obtenerListaMenu() {
        return listaMenu;
    }
    public double obtenerSubtotal() {
        return subtotal;
    }
    public double obtenerValorCancelar() {
        return valorCancelar;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n"
                + "Listado de Cartas: \n",
                obtenerNombreCliente());
        for (int i = 0; i < listaMenu.size(); i++) {
            cadena = String.format("%s%s\n",cadena ,listaMenu.get(i));
        }
        String porcentaje = "%";
        cadena = String.format("%s"
                + "subtotal: %.1f\n"
                + "IVA: %.1f%s\n"
                + "Valor Total a Cancelar: %.3f",
                cadena,
                obtenerSubtotal(),
                obtenerIva(),porcentaje,
                obtenerValorCancelar());
        return cadena;
    }
    
}
