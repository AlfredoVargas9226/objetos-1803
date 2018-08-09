/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2java;

/**
 *
 * @author T-101
 */
public class Administracion {
    private int honorarios;
 private int planta;
 private int proyecto;

    public Administracion(int honorarios, int planta, int proyecto) {
        this.honorarios = honorarios;
        this.planta = planta;
        this.proyecto = proyecto;
    }

    public Administracion() {
    }

    public int getHonorarios() {
        return honorarios;
    }

    public void setHonorarios(int honorarios) {
        this.honorarios = honorarios;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getProyecto() {
        return proyecto;
    }

    public void setProyecto(int proyecto) {
        this.proyecto = proyecto;
    }
}
