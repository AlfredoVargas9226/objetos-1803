
package modelo;


public class ValidarUsuario {
    public static void autenticar(Usuario u) 
        throws UsuarionNoValidoException{
        if(! (u.getLogin().equals("fredy")&&u.getPassword().equals("1234")))
        throw new UsuarionNoValidoException();
    }
        
    }
