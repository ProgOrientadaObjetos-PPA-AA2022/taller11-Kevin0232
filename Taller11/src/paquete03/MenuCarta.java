/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.*;

/**
 *
 * @author SALA I
 */
public class MenuCarta extends Menu {

    private double valorPorcion;
    private double valorBebida;
    private double valorAdicional;

    public MenuCarta(String nom, double valorI, double vp, double vb, double va) {
        super(nom, valorI);
        valorPorcion = vp;
        valorBebida = vb;
        valorAdicional = va;
    }

    public void establecerValorPorcion(double c) {
        valorPorcion = c;
    }

    public void establecerValorBebida(double c) {
        valorBebida = c;
    }

    public void establecerValorAdicional() {
        valorAdicional = ((valorInicial) * valorAdicional / 100);
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPorcion + valorBebida + ((valorInicial) * valorAdicional / 100);
    }

    public double obtenerValorPorcion() {
        return valorPorcion;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }

    public double obtenerValorAdicional() {
        return valorAdicional;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu a la Carta: \n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del Menu: %.1f\n"
                + "\tValor de la Porcion: %.1f\n"
                + "\tValor de la Bebida: %.1f\n"
                + "\tValor adicional: %.2f\n"
                + "\tvalor Total a Cancelar: %.2f\n",
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerValorPorcion(),
                obtenerValorBebida(),
                obtenerValorAdicional(),
                obtenertValorMenu());
        return cadena;
    }
}
