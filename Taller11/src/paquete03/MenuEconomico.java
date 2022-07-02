/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.Menu;

/**
 *
 * @author SALA I
 */
public class MenuEconomico extends Menu {

    private double descuento;

    public MenuEconomico(String nom, double valorI, double des) {
        super(nom, valorI);
        descuento = des;
    }

    public void establecerDescuento(int c) {
        descuento = c;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial - (valorInicial * (descuento / 100));
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del Menu: %.2f\n"
                + "\tValor del descuento: %.2f\n"
                + "\tvalor Total a Cancelar: %.2f\n",
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerDescuento(),
                obtenertValorMenu());
        return cadena;
    }
}
