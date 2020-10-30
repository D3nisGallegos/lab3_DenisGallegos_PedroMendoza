/*Clase para el objeto PRODUCTOS
 */
package lab3_denisgallegos_pedromendoza;


public class Productos {
    
    //ATRIBUTOS: 
    private String descripcion;
    private String nombre; 
    private double precio;
    
    
    //CONSTRUCTORES:

    public Productos() {
    }

    public Productos(String descripcion, String nombre, double precio) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //MUTADORES:

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //METODOS DE ADMINISTRACION: 
    public String toStringProductos(){
        return " NOMBRE: "+nombre+" INFO: "+descripcion+" PRECIO: "+precio;
    } 
    
    
    
    
}//Fin de la clase.
