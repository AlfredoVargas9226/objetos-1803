
package ejerexam;


public abstract class FigurasGeometricas {
    public abstract double area(); //agregar metodo to String con clik derecho

    @Override
    public String toString() {
        return "area="+area();
    }
    
}
