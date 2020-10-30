/*Clase para el objeto EMPLEAADOS
 */
package lab3_denisgallegos_pedromendoza;

import java.util.Date;


public class Empleados extends Personas {
    
    //ATRIBUTOS: 
    private Date horaentrada;
    private Date horasalida; 
    private int productosvendidos; 
    
    //CONSTRUCTORES: 

    public Empleados() {
        super();
    }

    public Empleados(Date horaentrada, Date horasalida, int productosvendidos, int id, String username, String password, String correo, String nombre) {
        super(id, username, password, correo, nombre);
        this.horaentrada = horaentrada;
        this.horasalida = horasalida;
        this.productosvendidos = productosvendidos;
    }

    //MUTADORES: 

    public Date getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada(Date horaentrada) {
        this.horaentrada = horaentrada;
    }

    public Date getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(Date horasalida) {
        this.horasalida = horasalida;
    }

    public int getProductosvendidos() {
        return productosvendidos;
    }

    public void setProductosvendidos(int productosvendidos) {
        this.productosvendidos = productosvendidos;
    }
    
    //METODOS DE ADMINISTRACION: 
    public String toString(){
        return toStringPersonas()+" H.entrada: "+horaentrada+" H.salida: "+horasalida;
    }
    
    
    
    
    
    
    
    
    
    
}//Fin de la clase.
