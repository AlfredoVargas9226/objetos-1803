/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etc;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class GeneradorTarjeta {

    public GeneradorTarjeta(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    private ArrayList<Cliente> clientes; //paso 4 a)agregar un arraylist
public GeneradorTarjeta() {
    clientes=new ArrayList<>();
    clientes.add(new Cliente("juan",new Tarjeta(1234,"banamex",32000)));    ///paso 4 b)
    clientes.add(new Cliente("Ana",new Tarjeta(5673,"hsbc",17500)));
    clientes.add(new Cliente("pedro",new Tarjeta(8765,"scotian",19600)));
    clientes.add(new Cliente("irma",new Tarjeta(9321,"banamex",98000)));
    
    
}

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }


}
