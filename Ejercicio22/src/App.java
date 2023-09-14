import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int aleatorio=(int)(Math.random()*50);
        int numero=0;
        int intentos=0;
        int olaa=1;

        while(olaa==1){ 

        while(numero!=aleatorio && intentos<3){ 
            intentos++;
            System.out.println("Digite un numero");
            numero=x.nextInt();
            if(aleatorio<numero){
                System.out.println("Mas bajo");
            }else if(aleatorio>numero){
                System.out.println("Mas alto");
             }
            }
            if(intentos==3){
                System.out.println("Ha intentado muchas veces, regresa mas tarde");     
            }else{
                System.out.println("Correcto. El N° de intentos fue de: "+intentos);
                break;
            }
            System.out.println("¿Quiere seguir jugando?");
            System.out.println("Aprieta 1 para Seguir");
            System.out.println("Aprieta 2 para Salir");
            olaa=x.nextInt();
            intentos-=3;
            if(olaa==2){
                System.out.println("Muchas Gracias por jugar");
            }
        }
         x.close();            
        }
    }
