/*Programa de laboratorio 3 de semana 3 de la clase de programacion 2.
 */
package lab3_denisgallegos_pedromendoza;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab3_DenisGallegos_PedroMendoza {

    static Scanner read = new Scanner(System.in).useDelimiter("\\n");
    
    static ArrayList<String[]> usersLoginInfo = new ArrayList();
    
    static ArrayList<Object> locales = new ArrayList();
    static ArrayList<Tiendas> tiendas = new ArrayList();
    static ArrayList<Quiosco> kiosks = new ArrayList();
    static ArrayList<Restaurantes> rests = new ArrayList();

    static ArrayList<Object> personas = new ArrayList();
    static ArrayList<Empleados> empleados = new ArrayList();
    static ArrayList<Clientes> clientes = new ArrayList();
    
    static ArrayList<Object> productos = new ArrayList();
    static ArrayList<Ropa> ropas = new ArrayList();
    static ArrayList<Juguetes> jugs = new ArrayList();
    static ArrayList<Comida> comidas = new ArrayList();
    
    public static void main(String[] args) {
        
        String[] admin = {"admin", "admin"};
        usersLoginInfo.add(admin);
        
        System.out.println("1. Iniciar sesión\n2. Crear nuevo usuario\n3. Salir");
        
        switch(inputUsuarioNum("Ingrese opción: ")){
        
            case 1:
                if(LogIn()){
                    
                }
                else{
                    
                } 
            break;
            
            case 2:
                SignIn();
            break;
            
            case 3:
            break;
            
            default:
                System.out.println("Código no válido.");
            break;
        
        }
        
    }//Fin del MAIN.
    
    public static int inputUsuarioNum(String msg){
     
        String inputString = "";
        boolean errorInput;

        do{

            System.out.printf(msg);
            inputString = read.next();

            errorInput = false;

            for (int i = 0; i < inputString.length(); i++) {

                if(!Character.isDigit(inputString.charAt(i))){
                    errorInput = true;
                }

            }

        }while(errorInput);
        
        return Integer.parseInt(inputString);
        
    }
    
    public static boolean LogIn(){
        
        boolean errorLogin;
        String user = "", password = "";
        int index = 0;
        
        do{
        
            System.out.print("Ingrese Usuario: ");
            user = read.next().replace(" ", "");

            System.out.print("Ingrese Contraseña: ");
            password = read.next();
            
            errorLogin = false;
            boolean stop = true;
            
            for (String[] str : usersLoginInfo) {
                
                if(!str[0].equalsIgnoreCase(user) && stop){
                    errorLogin = true;
                }
                else{
                    index = usersLoginInfo.indexOf(str);
                    errorLogin = false;
                    stop = false;
                }
                
            }
            
            String[] currentUser = usersLoginInfo.get(index);
            
            if(!currentUser[1].equals(password) && !errorLogin){
                errorLogin = true;
            }
            
            if(errorLogin){
                System.out.println("Usuario y/o Contraseña Incorrecta");
            }
            
        }while(errorLogin);
        
        return (user.equalsIgnoreCase("admin") && password.equals("admin"));
        
    }
    
    public static void SignIn(){
        
        String newUser = "";
        boolean errorLogin;
        
        do{
            
            System.out.print("Ingrese nuevo nombre de usuario: ");
            newUser = read.next().replace(" ", "");

            errorLogin = false;
            
            for (String[] str : usersLoginInfo) {
                
                if(str[0].equals(newUser)){
                    errorLogin = true;
                }
                
            }
            
            if(errorLogin){
                System.out.println("Usuario ya existe");
            }

        }while(errorLogin);
        
        System.out.print("Ingrese nueva contraseña: ");
        String password = read.next();
        
        String[] newUserInfo = {newUser, password};
        
        usersLoginInfo.add(newUserInfo);
        
    }
    
    public static void SubMenuSUDO(){
        
        int opcionSubMenu = 0;
        while(opcionSubMenu != 5){
            
            System.out.println("1. Agregar\n2. Eliminar\n3. Actualizar\n4. Resumen\n5.Salir");
            opcionSubMenu = inputUsuarioNum("Ingrese Opcion:");

            switch(opcionSubMenu){
                
                case 1:
                    Agregar();
                break;

            }
        
        }
        
    }
    
    public static void Agregar(){
        
        int opcionSubMenu = 0;
        while(opcionSubMenu != 4){
            
            System.out.println("1. Local\n2. Persona\n3. Producto\n4. Salir");
            opcionSubMenu = inputUsuarioNum("Ingrese Opcion:");

            switch(opcionSubMenu){
                
                case 1:
                    AgregarLocal();
                break;
                
                case 2:
                    
                    
                    
                break;
                
                case 3:
                    
                    
                    
                break;
                
                default:
                    System.out.println("Opción no válida.");
                break;
                
            }
        
        }
        
    }
    
    public static void AgregarLocal(){
        
        int opcionSubMenu = 0;
        
        while(opcionSubMenu != 4){
            
            System.out.println("¿Qué tipo de local quiere agregar?");
            System.out.println("1. Tienda\n2. Quiosco\n3. Restaurante\n4. Salir");
            opcionSubMenu = inputUsuarioNum("Ingrese Opcion:");

            switch(opcionSubMenu){
                
                case 1:
                    locales.add(new Tiendas());
                break;
                
                case 2:
                    if(!tiendas.isEmpty()){
                        for (Tiendas tienda : tiendas) {
                            System.out.println(tiendas.indexOf(tienda) + tienda.getNombre());
                        }
                        int num = inputUsuarioNum("Ingrese tienda a agregar quiosco: ");
                        if(num >= 0 && num < tiendas.size()){
                            kiosks.add(new Quiosco(tiendas.get(num).getNombre(), tiendas.get(num).getGerente()));
                        }
                        else{
                            System.out.println("Número no válido. ");
                        }
                    }
                    else{
                        System.out.println("No hay tiendas.");
                    }
                break;
                
                case 3:
                    locales.add(new Restaurantes());
                break;
                
                default:
                    System.out.println("Opción no válida.");
                break;
                
            }
        
        }
        
    }
    
}//Fin de la clase.
