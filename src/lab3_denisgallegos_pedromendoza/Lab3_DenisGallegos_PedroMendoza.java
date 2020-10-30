/*Programa de laboratorio 3 de semana 3 de la clase de programacion 2.
 */
package lab3_denisgallegos_pedromendoza;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab3_DenisGallegos_PedroMendoza {

    static Scanner read = new Scanner(System.in).useDelimiter("\\n");
    static boolean soyAdmin = false;
    
    static ArrayList<String[]> usersLoginInfo = new ArrayList<String[]>();
    /*
        Agrega todas tus listas aqui, cuando las agregues hago el resto de los menús
    */
    
    public static void main(String[] args) {
        
        String[] admin = {"admin", "admin"};
        usersLoginInfo.add(admin);
        
        if(LogIn()){
            soyAdmin = true;
        }

        
        
        
    }//Fin del MAIN.
    
    public static int inputUsuarioNum(String msg){
     
        String inputString = "";
        boolean errorInput;

        do{

            System.out.printf(msg+"\n");
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

            errorLogin = false;
            boolean stop = false;
            
            for (String[] str : usersLoginInfo) {
                
                if(!str[0].equalsIgnoreCase(user) && stop){
                    errorLogin = true;
                }
                else{
                    index = usersLoginInfo.indexOf(str);
                    errorLogin = false;
                    stop = true;
                }
                
            }
            
            if(errorLogin){
                System.out.println("No se encontró usuario.");
            }

        }while(errorLogin);
        
        do{
            
            System.out.print("Ingrese Contraseña: ");
            password = read.next();

            errorLogin = false;
            
            if(!usersLoginInfo.get(index).equals(password)){
                errorLogin = true;
            }
            
            if(errorLogin){
                System.out.println("Contraseña incorrecta.");
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
        
        System.out.println("Ingrese nueva contraseña: ");
        String password = read.next();
        
    }
    
}//Fin de la clase.
