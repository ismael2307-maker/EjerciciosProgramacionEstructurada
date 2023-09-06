import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
         byte edad;
         char sexo;
         char Verificacion;  

        System.out.println("Digite su edad");
        edad=x.nextByte();
         while(edad<=0){
         System.out.println("Usted no ha nacido.");
         System.out.println("  ");
         System.out.println("Digite su edad");
         edad=x.nextByte();
         }

         while(edad<18){
         System.out.println("Usted es menor de edad, aun no puede entrar.");
         System.out.println("  ");
         System.out.println("Digite su edad");
         edad=x.nextByte();
         }

         System.out.println("Digite su sexo (m/f)");
         sexo=x.next().charAt(0);

         while((sexo =='f' || sexo =='F') && edad>=18 && edad<20){
         System.out.println("Usted es una mujer, tiene la edad de: "+edad+ " Años, puede entrar a la disco pero no puede tomar alcohol"); 
         break;
        }
         while((sexo =='f' || sexo =='F') && edad>=20){
         System.out.println("Usted es una mujer, tiene la edad de: "+edad+ " Años, puede entrar a la disco y puede tomar alcohol");
         break;
        }
         while((sexo =='m' || sexo =='M') && edad>=18 && edad<20){
          System.out.println("¿Lleva armas consigo? (S/N)");
          Verificacion=x.next().charAt(0);
          while(Verificacion == 'S' || Verificacion== 's'){
            System.out.println("No puede entrar. Las armas son prohibidas");
              System.out.println("¿Lleva armas consigo? (S/N)");
              Verificacion=x.next().charAt(0);
            break;
          }
          while(Verificacion == 'N' || Verificacion== 'n'){
            System.out.println("Usted es un hombre, tiene la edad de: "+edad+ " Años, puede entrar a la disco pero no puede consumir alcohol");
            break;
          }
         break;
        }
        while((sexo =='m' || sexo =='M') && edad>=20){
          System.out.println("¿Lleva armas consigo? (S/N)");
          Verificacion=x.next().charAt(0);
          while(Verificacion == 'S' || Verificacion== 's'){
            System.out.println("No puede entrar. Las armas son prohibidas");
              System.out.println("¿Lleva armas consigo? (S/N)");
              Verificacion=x.next().charAt(0);
            break;
          }
          while(Verificacion == 'N' || Verificacion== 'n'){
            System.out.println("Usted es un hombre, tiene la edad de: "+edad+ " Años, puede entrar a la disco y puede consumir alcohol");
            break;
          }
         break;
        }
       x.close();
    }
}
