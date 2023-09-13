import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        String Contraseña;
        String Pass="";

        System.out.println("Digite una contraseña");
        Contraseña=x.next();
        
        //System.out.println("Mi contraseña tiene : "+Contraseña.length()+" Caracteres");
       while(Contraseña.length()<=6 || Contraseña.length()>=10){
        System.out.println("Vuela a Digitar una contraseña");
        Contraseña=x.next();
       }
       while(Contraseña.equals(Pass)==false){
        System.out.println("Verifique su Contraseña");
        Pass=x.next();
          
         if(Contraseña.equals(Pass)==false){
            System.out.println("Contraseña incorrecta. No coinciden");
         }

       }
       System.out.println("Contraseña Correcta. Acceso permitido");
       
     x.close();
    }
}
