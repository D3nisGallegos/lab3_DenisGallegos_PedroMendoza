/*Clase para el objeto ROPA
 */
package lab3_denisgallegos_pedromendoza;


public class Ropa extends Productos{
    
    //ATRIBUTOS: 
    private String genero; 
    private String talla;
    
    //CONSTRUCTORES: 

    public Ropa() {
        super();
    }

    public Ropa(String genero, String talla, String descripcion, String nombre, double precio) {
        super(descripcion, nombre, precio);
        this.genero = genero;
        this.talla = talla;
    }
    
    //MUTADORES: 

    public String getGenero() {
        return genero;
    }

    public void setGenero(int n) {
        if (n == 1){
            genero = "M";
        }else if (n== 2){
            genero = "M";
        }
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(int n) {
        if (n == 1){
            talla = "S";
        }else if (n == 2){
            talla = "M";
        }else if (n == 3){
            talla = "L";
        }
    }
    
    //METODOS DE ADMINISTRACION: 
    public String toStringRopa(){
        return toStringProductos()+" TALLA: "+talla+" GENERO: "+genero;
    }
    
    
}//Fin de la clase.
