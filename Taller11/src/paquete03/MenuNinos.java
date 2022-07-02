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
public class MenuNinos extends Menu {

    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nom, double valorI, double vh, double vp) {
        super(nom, valorI);
        valorHelado = vh;
        valorPastel = vp;
    }

    public void establecerValorHelado(double c) {
        valorHelado = c;
    }

    public void establecerValorPastel(double c) {
        valorPastel = c;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorHelado + valorPastel;
    }

    public double obtenerValorHelado() {
        return valorHelado;
    }

    public double obtenerValorPastel() {
        return valorPastel;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Ninos:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial del Menu: %.2f\n"
                + "\tValor del Helado: %.2f\n"
                + "\tValor de la Pastel: %.2f\n"
                + "\tvalor Total a Cancelar: %.2f\n",
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerValorHelado(),
                obtenerValorPastel(),
                obtenertValorMenu());
        return cadena;
    }
}
