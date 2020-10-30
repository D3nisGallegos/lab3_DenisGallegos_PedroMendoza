/*Clase para el objeto GERENTE
 */
package lab3_denisgallegos_pedromendoza;


public class Gerente extends Personas{
    
    //ATRIBUTOS:  
    private Tiendas tienda; 
    
    //CONSTRUCTORES:

    public Gerente() {
        super();
    }

    public Gerente(Tiendas tienda, int id, String username, String password, String correo, String nombre) {
        super(id, username, password, correo, nombre);
        this.tienda = tienda;
    }
    
    //MUTADORES: 

    public Tiendas getTienda() {
        return tienda;
    }

    public void setTienda(Tiendas tienda) {
        this.tienda = tienda;
    }
    
    //METODOS DE ADMINISTRACION: 
    public String toStringGerente(){
        return " TIENDA: "+tienda; 
    }
    
    
    
    
    
}//Fin de la clase.
