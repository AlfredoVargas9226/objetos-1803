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
public abstract class Trabajador{
    private int seguro;
    private String nombre;
    private float sueldoBase;
    public abstract void pagar(); // en la clase abstracta no se puede heredar clases pero para quitar la abstraccion en un metodo le quitas {} y pones ;
        
        
    

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    
    
    
    
}
