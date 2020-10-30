/*Clase para el objeto COMIDA
 */
package lab3_denisgallegos_pedromendoza;

import java.util.Date;


public class Comida extends Productos{
    
    //ATRIBUTOS: 
    private String tipo; 
    private Date vencimiento; 
    
    //CONSTRUCTORES: 

    public Comida() {
        super();
    }

    public Comida(String tipo, Date vencimiento, String descripcion, String nombre, double precio) {
        super(descripcion, nombre, precio);
        this.tipo = tipo;
        this.vencimiento = vencimiento;
    }

    //MUTADORES: 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }
    
    //METODOS DE ADMINISTRACION: 
    public String toStringComida(){
        return "TIPO: "+tipo+" FECHA DE V:"+vencimiento;
    }
    
    
    
    
    
    
}//Fin de la clase.
