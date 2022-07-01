/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;

    public Menu(String n, double vi) {
        nombrePlato = n;
        valorInicial = vi;
    }
    public void establecerNombrePlato(String c) {
        nombrePlato = c;
    }   
    public abstract void calcularValorMenu();
    
    public void establecerValorInicial(double c) {
        valorInicial = c;
    }
    public String obtenerNombrePlato() {
        return nombrePlato;
    }
    public double obtenertValorInicial() {
        return valorInicial;
    }
    public double obtenertValorMenu() {
        return valorMenu;
    }
    
}
