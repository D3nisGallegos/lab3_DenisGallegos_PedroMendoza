/*Clase para el objeto TIENDAS
 */
package lab3_denisgallegos_pedromendoza;

import java.util.ArrayList;


public class Tiendas extends Locales{

    //ATRIBUTOS:
    //ya estan en la de locales.
    
    //CONSTRUCTORES: 
    public Tiendas() {
        super();
    }

    public Tiendas(String nombre, Gerente gerente) {
        super(nombre, gerente);
    }
   
    //METODOS DE ADMINISTRACION: 
    public String toStringTiendas(){
        return toStringLocales();
    }
    
    
}//Fin de la clase.
