
package Abstraccion;

public class Conversion {
   private Grados grados;

   public float centigradosAfarenheit(){
       //este metodo si tiene logica
       float resultado=grados.getCentigrados()*1.8f+32;
       return  resultado;   // centigradosAfarenheit();
   }
    
   public Grados getGrados() {
   return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }


}



