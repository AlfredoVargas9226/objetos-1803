
package ejerexam;


public class Circulos extends FigurasGeometricas{
   //implemento el abstracto y quitoi trow
private int radio;    

    public Circulos(int r) {
    radio =r;
    }
    public double area(){
    //retorno"Pi por radio al cuadrado"
  return Math.PI*Math.pow(radio, 2);
    }
    
        
    

    
}
