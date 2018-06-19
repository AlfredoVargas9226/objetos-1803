
package serializar;


public class Aplicacion {
    public static void main(String[] args) throws Exception{
        
        Cliente c=new Cliente();
        c.setEdad(25);
        c.setNombre("Alfredo Vargas");
        c.setSueldo(10000);
        PercistensiaUsuario.guardar(c);
        System.out.println("guardado con exito ");
        
    }
}
