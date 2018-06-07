/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.util.*;

public class Cuestionario {
  private ArrayList<Pregunta> Preguntas;
         
    private float pregunta;

    public ArrayList<Pregunta> getPreguntas() {
        return Preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> Preguntas) {
        this.Preguntas = Preguntas;
    }

    public float getPregunta() {
        return pregunta;
    }

    public void setPregunta(float pregunta) {
        this.pregunta = pregunta;
    }
}

