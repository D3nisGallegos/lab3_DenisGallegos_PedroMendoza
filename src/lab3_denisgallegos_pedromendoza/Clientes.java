/*Clase para el objeto CLIENTE.
 */
package lab3_denisgallegos_pedromendoza;

import java.util.ArrayList;


public class Clientes extends Personas{
    
    //ATRIBUTOS: 
    private double dinero; 
    private ArrayList carritodeproductos = new ArrayList();
    
    //CONSTRUCTORES: 

    public Clientes() {
    }

    public Clientes(double dinero, int id, String username, String password, String correo, String nombre) {
        super(id, username, password, correo, nombre);
        this.dinero = dinero;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList getCarritodeproductos() {
        return carritodeproductos;
    }

    public void setCarritodeproductos(ArrayList carritodeproductos) {
        this.carritodeproductos = carritodeproductos;
    }
    
    //METODOS DE ADMINISTRACION: 
    public String toStringClientes (){
        String n = "";
        n += "{ ";
        for (int c = 0; c < carritodeproductos.size();c++){
            n += carritodeproductos.get(c)+ "";
            if (c < carritodeproductos.size() - 1){
                n += ", ";
            }
        }
        n += " }";
        return toStringPersonas()+" DINERO: "+dinero+" CARRITO: "+n;
    }
    
    
    
    
    
    
}//Fin de la clase.
