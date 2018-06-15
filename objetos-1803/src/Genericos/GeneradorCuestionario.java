/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Genericos;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class GeneradorCuestionario {
    
    private Cuestionario cuestionarios;

    public  GeneradorCuestionario(){
        Cuestionario Cuestionarios = new Cuestionario();
        
         Opcion o11=new Opcion();
        o11.setTitulo("Mizcalco");
        o11.setCorrecta(false);
                
        Opcion o21=new Opcion();
        o21.setTitulo("TExcoco");
        o21.setCorrecta(false);
       
         Opcion o31=new Opcion();
         o31.setTitulo("Madrid");
         o31.setCorrecta(true);
       
         
         Opcion  o41=new Opcion();
         o41.setTitulo("Ecatepec");
         o41.setCorrecta(false);
         
         //sigue la pregunta
         Pregunta p11=new Pregunta();
         p11.setTitulo("cula es la capital de españa");
         //antes generamos el arrayñlist con las opciones de arriba
          ArrayList<Opcion> opcionesp11=new ArrayList<>();
          opcionesp11.add(o11);
          opcionesp11.add(o21);
          opcionesp11.add(o31);
          opcionesp11.add(o41);
          //ahpora agregamos  el arraylist en la primera pregunta
          p11.setOpciones(opcionesp11);
          
          // sigue el cuestionario c1
          
            ArrayList<Pregunta> preguntas=new ArrayList<>();
            preguntas.add(p11);
            cuestionarios.setPreguntas(preguntas);
    }
    
    public Cuestionario getCuestionarios() {
        return cuestionarios;
    }

    public void setCuestionarios(Cuestionario cuestionarios) {
        this.cuestionarios = cuestionarios;
    }
}
