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
public class MenuEconomico extends Menu{
    private int descuento;

    public MenuEconomico(String nom,double valorI,int des) {
        super(nom, valorI);
        descuento = des;
    }

    public void establecerDescuento(int c) {
        descuento = c;
    }
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial - (valorInicial*(descuento/100));
    }
    public int obtenerDescuento() {
        return descuento;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("--------Menu Carta--------"
                + "Nombre Plato: %s\n"
                + "Valor Inicial del Menu: %.2f\n"
                + "Valor del descuento: %.2f\n"
                + "valor Total a Cancelar: %.2f\n", 
                obtenerNombrePlato(),
                obtenertValorInicial(),
                obtenerDescuento(),
                obtenertValorMenu());
        return cadena;
    }
}
