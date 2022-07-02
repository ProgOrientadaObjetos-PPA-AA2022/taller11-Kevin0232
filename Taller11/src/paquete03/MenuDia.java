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
public class MenuDia extends Menu{
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String nom,double valorI,double vp, double vb) {
        super(nom, valorI);
        valorPostre = vp;
        valorBebida = vb;
    }

    public void establecerValorPostre(double c) {
        valorPostre = c;
    }

    public void establecerValorBebida(double c) {
        valorBebida = c;
    }
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPostre+ valorBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Menu del Dia:\n"
                + "Plato: %s\n"
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
