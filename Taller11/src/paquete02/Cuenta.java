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
    private int iva;
    private ArrayList<Menu> listaMenu;
    private double valorCancelar;
    private double subtotal;

    public Cuenta(String n, int i, ArrayList<Menu> lista) {
        nombreCliente = n;
        iva = i;
        listaMenu = lista;
    }

    public void establecerNombreCliente(String c) {
        this.nombreCliente = c;
    }

    public void establecerIva(int c) {
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
        valorCancelar = subtotal + (subtotal*(iva/100));
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public int obtenerIva() {
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
        String cadena = String.format("Nombre Plato: %s\n"
                + "Valor Inicial del Menu: %.2f\n"
                + "Valor del Postre: %.2f\n"
                + "Valor de la Bebida: %.2f"
                + "valor Total a Cancelar: %.2f\n", 
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerValorPostre(),
                obtenerValorBebida(),
                obtenertValorMenu());
        return cadena;
    }
    
}
