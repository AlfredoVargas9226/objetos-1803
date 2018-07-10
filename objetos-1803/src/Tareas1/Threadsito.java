//existen 3 formas de generar theads
//1 generando la clase theads
//2implementado la clase runable
// 3 como clases internas anonimas PARA EL EXAMEN DEL SEGUNDO PARCIAL VAMOS A OCUPAR LA 3
package Tareas1;

public class Threadsito extends Thread{//a)
    public void run() {//b
        System.out.println("soy un thread y me llamo"+Thread.currentThread().getName());    
    }
    
}
