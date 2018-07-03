
package excepciones;


public class SegundasExcepciones {
    public static void main(String[] args) {
        int a=2;
        int b=2;
        int arreglo[]={1,2};
        try{
        String numeroMalo="4";
        int numeroBueno=Integer.parseInt(numeroMalo);
        
        System.out.println(a/b);
        System.out.println(numeroBueno*2);
        System.out.println(arreglo [0]);
    }catch(NumberFormatException e){ //cuqando se cierra inmediatamente el try se pone mi }cath y lo cierro{
            System.out.println("¿podrias meter un numero valido?");
}catch(ArithmeticException e){
            System.out.println("no se aceptan divisiones entre 0");
}catch(Exception e){
            System.out.println("esto ocurrio"+e.getMessage()); //este es el que muestra el mensaje de la excepcion
}
}
}