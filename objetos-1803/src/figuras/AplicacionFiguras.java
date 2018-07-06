package figuras;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AplicacionFiguras {
    public static void main(String[] args) {
        try {
            //primiero creamos un objeto de tipo cuadrado
            Cuadrado c=new Cuadrado();
            
            //ajustamos el valor de lado
            ValidarValores.validarNoNegativo(4); // siempre para hacer un bloque trycath le doy al foco y selecciono el bloc try cath para mejor resultado
            c.setLado(4);
            //generamos un objeto de tipo calculos
            Calculos cal= new Calculos();
            System.out.println(cal.calculararArea(c));// lo encierro en un System.ou8t
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage()); //borro el de loogwer y lo sustituyo por System.out.println
        }
   
  
    }
   
}
