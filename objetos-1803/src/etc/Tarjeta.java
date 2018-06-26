/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etc;

/**
 *
 * @author T-101
 */
public class Tarjeta { // paso 1uno encapsularmiento
    
     private int numero;
    private String nombre;
   private float saldo;

    public Tarjeta(int numero, String nombre, float saldo) { //paso 2 generar el constructor de defecto
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
   