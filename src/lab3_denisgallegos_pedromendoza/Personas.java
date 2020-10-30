/*Clase para el objeto PERSONAS
 */
package lab3_denisgallegos_pedromendoza;


public class Personas {
    
    //ATRIBUTOS: 
    private int id; 
    private String username; 
    private String password;
    private String correo;
    private String nombre;

    //CONSTRUCTORES: 
    
    public Personas() {
    }

    public Personas(int id, String username, String password, String correo, String nombre) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.nombre = nombre;
    }
    
    //MUTADORES; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //METODOS DE ADMINISTRACION: 
    public String toStringPersonas(){
        return "ID: "+id+" USER: "+username+" PASS: "+password+" MAIL: "+correo+" NOMBRE: "+nombre; 
    }//Fin del metodo TO STRING.
    
    
    
    
}//Fin de la clase.
