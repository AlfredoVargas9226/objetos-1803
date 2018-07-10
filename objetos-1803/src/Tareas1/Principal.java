
package Tareas1;



public class Principal {
    public static void main(String[] args) {
        //e1
        Threadsito t1=new Threadsito();
        t1.setName("Pancho");
        Threadsito t2=new Threadsito();
        t2.setName("Petra");
        Threadsito t3=new Threadsito();
        t3.setName("Pedro");
        Relojito reloj=new Relojito();
        
        //estado de inicializado e2
        t1.start();
        t2.start();
        t3.start();
        reloj.start();
    }
}
