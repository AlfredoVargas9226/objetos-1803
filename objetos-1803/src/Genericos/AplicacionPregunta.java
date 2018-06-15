/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

/**
 *
 * @author T-101
 */
import java.util.*;
public class AplicacionPregunta {
    public static void main(String[] args) {
     GeneradorCuestionario generador=new GeneradorCuestionario();
            
            for(Pregunta p:generador.getCuestionarios().getPreguntas()){
                System.out.println(p.getTitulo());
                
                for (Opcion o:p.getOpciones()){
                System.out.println(o.getTitulo()+""+o.isCorrecta());
            }
            }
    }
}
