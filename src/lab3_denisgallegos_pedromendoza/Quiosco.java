/*Clase para el objeto QUIOSCO
 */
package lab3_denisgallegos_pedromendoza;


public class Quiosco extends Tiendas{

    
    
    //ATRIBUTOS:
    
    
    //CONSTRUCTORES: 
    public Quiosco() {
        super();
    } 

    public Quiosco(String nombre, Gerente gerente) {
        super(nombre, gerente);
    }
    
    //METODOS DE ADMINISTRACION:
    public String toStringQuiosco(){
        return toStringTiendas();
    }
    
}//Fin de la clase.
