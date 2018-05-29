
package Tiposdatos;


public class Tipos1 {
    public static void main(String[] args) {
    byte   b=2;
    short  s=2;
    int    i=2;
    long   l=2;
        
    b=(byte)s;
    s=b;
    i=b;
    l=i;
    b=(byte)l;
    s=(byte)i;
    float f=4;
     String malo="21";
      int bueno= Integer.parseInt(malo);
      int dias=bueno*365;
        
    }
}
