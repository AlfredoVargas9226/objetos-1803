
package serializar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class PercistensiaUsuario {
    //primero guardamos
    public static void guardar(Cliente c)throws Exception{
        // paso 1 generar el archivo donde se va a guardar el serializado
        File file=new File("D:\\archivado.yomero");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
    }
}
