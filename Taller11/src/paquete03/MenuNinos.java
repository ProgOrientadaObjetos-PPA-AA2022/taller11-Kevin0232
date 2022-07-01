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
public class MenuNinos extends Menu{
    private double valorHelado;
    private double valorPastel;

    public MenuNinos(String nom,double valorI,double vh, double vp) {
        super(nom, valorI);
        valorHelado = vh;
        valorPastel = vp;
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
}
