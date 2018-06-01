/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author T-101
 */
public class Arreglos {
    public static void main(String[] args) {
        
        int []valores={1,-20,4};
        for (int i=0;i<valores.length;i++){
        System.out.println(valores[i]);
    }
        
      //1-este clclo for ers el mejorado  y se recoemienda siempre 
      
        for(int v:valores){
            System.out.println(v);
        }
    }
    
    //2-segunda forma  de inicializar los arreglos 
    int otro[]=new int[4];
}
