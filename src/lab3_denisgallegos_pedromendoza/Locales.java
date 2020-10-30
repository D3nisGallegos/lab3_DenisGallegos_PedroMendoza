/*Clase para el objeto LOCALES
 */
package lab3_denisgallegos_pedromendoza;

import java.util.ArrayList;


public class Locales {
    
    //ATRIBUTOS: 
    private String nombre; 
    private ArrayList <Empleados> listaempleados = new ArrayList(); 
    private Gerente gerente; 
    private ArrayList listadeproductos = new ArrayList();
    
    //CONSTRUCTORES:

    public Locales() {
    }

    public Locales(String nombre, Gerente gerente) {
        this.nombre = nombre;
        this.gerente = gerente;
    }
     
    //MUTADORES: 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleados> getListaempleados() {
        return listaempleados;
    }

    public void setListaempleados(ArrayList<Empleados> listaempleados) {
        this.listaempleados = listaempleados;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    //METODOS DE ADMINISTRACION: 
    public String toStringLocales(){
        String n = "";
        n += "{ ";
        for (int c = 0; c < listaempleados.size();c++){
            n += listaempleados.get(c) +"";
            if (c < listaempleados.size() - 1){
                n += ", ";
            }
        }
        n += " }";
        return "NOMBRE: "+nombre+" GERENTE: "+gerente+" EMPLEADOS: "+n+" PRODUCTOS: ";
    }
    
    
    
    
    
}//Fin de la clase.
