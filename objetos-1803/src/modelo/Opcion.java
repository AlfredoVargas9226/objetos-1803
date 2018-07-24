/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author T-101
 */
public class Opcion {
    private String titulo;
    private boolean corracta;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isCorracta() {
        return corracta;
    }

    public void setCorracta(boolean corracta) {
        this.corracta = corracta;
    }
}
