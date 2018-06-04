/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author T-101
 */
public class Planta extends Trabajador {// marca error en planta x q la clase abstracta q es trabajador le tiene q dar el cuerpo a la clase planta como abstracta 

    @Override
    public void pagar() {
        System.err.println("SE VA A PAGARA ESTE TRABAJADOR DE PLANTA");
    
}
}