/*Clase para el objeto RESTAURANTES
 */
package lab3_denisgallegos_pedromendoza;

import java.util.ArrayList;


public class Restaurantes extends Locales{
    
    //ATRIBUTOS: 
    
    //CONSTRUCTORES: 

    public Restaurantes() {
        super();
    }

    public Restaurantes(String nombre, Gerente gerente) {
        super(nombre, gerente);
    }
    
    //METODOS DE ADMINISTRACION: 
    public String toStringRestaurantes(){
        return toStringLocales();
    }
    
    
    
    
    
}//Fin de la clase.
