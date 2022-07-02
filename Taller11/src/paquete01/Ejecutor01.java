/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.*;
import paquete03.*;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Menu> listaMenu = new ArrayList<>();

        // Menu Ninos
        MenuNinos mn1 = new MenuNinos("Niños 01", 2.00, 1.00, 1.50);
        mn1.calcularValorMenu();
        MenuNinos mn2 = new MenuNinos("Niños 02", 3.00, 1.00, 1.50);
        mn2.calcularValorMenu();
        
        listaMenu.add(mn1);
        listaMenu.add(mn2);
        // Menu Economico
        MenuEconomico me1 = new MenuEconomico("Econo 001" , 4, 25);
        me1.calcularValorMenu();
        
        listaMenu.add(me1);
        // Menu Dia
        MenuDia md1 = new MenuDia("Econo 001" , 5, 1, 1);
        md1.calcularValorMenu();
        
        listaMenu.add(md1);
        // Menu Carta
        MenuCarta mc1 = new MenuCarta("Carta 001" , 6, 1.5 ,2 ,10);
        mc1.calcularValorMenu();
        
        listaMenu.add(mc1);
        Cuenta c1 = new Cuenta("René Elizalde", 10, listaMenu );
        c1.establecerSubtotal();
        c1.establecerValorCancelar();
        System.out.println(c1);
    }

}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu del ninos:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu del ninos:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/
