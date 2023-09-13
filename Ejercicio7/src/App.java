import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int NumCuenta,minutos,minutos2;
        int ola=0;
        double adicional,Cargo,total;
        char Servicios;
        final double ServicioRegular=10;
        final double ServicioPremium=25;

        while(ola==0){
        do{
        System.out.println("Digite su su numero de cuenta (5 Digitos)");
        NumCuenta=x.nextInt();
        }while(NumCuenta<=10000 || NumCuenta>99999);

        System.out.println(".-r(Servicio Regular) .-p(Servicio Premium)");

        System.out.println("Digite su tipo de servicio");
        Servicios=x.next().charAt(0);

        switch(Servicios){
            case 'r':{
                System.out.println("¿Cuantos minutos ha hablado?");
                minutos=x.nextInt();

                if(minutos<=50){
                  System.out.println("Los primeros 50 minutos son Gratis");
                  System.out.println("Su numero de cuenta es: "+ NumCuenta);
                  System.out.println("Los minutos hablados fueron: "+minutos+ " Minutos");
                  System.out.println("El costo a pagar de su servicio "+Servicios+ " (Servicio Regular) es de: " +ServicioRegular+ " Dolares");
                }else if(minutos>50){
	
                  adicional=minutos-50;
                  Cargo=adicional*0.20;
                  total=ServicioRegular+Cargo;

                  System.out.println("Ha excedido los 50 minutos");
                  System.out.println("Su numero de cuenta es: "+ NumCuenta);
                  System.out.println("Los minutos hablados fueron: "+minutos+ " Minutos");
                  System.out.println("Los minutos excedidos fue de: "+adicional+ " Minutos");
                  System.out.println("El cargo a pagar por los minutos excedidos es de: "+Cargo+ " Dolares");
                  System.out.println("El total a pagar de su servicio "+Servicios+ "(Servicicio Regular) es de: "+total+ " Dolares");
                }
                break;
            }
            case 'p':{
               System.out.println("¿Cuantos minutos ha hablado en la mañana? (6 a.m y 6 p.m)");
               minutos=x.nextInt();
                
               if(minutos<=75){
                System.out.println("Los primeros 75 minuto son gratis");
                System.out.println("Su numero de cuenta es: "+ NumCuenta);
                System.out.println("Los minutos hablados fueron: "+minutos+ " Minutos en la mañana");
                System.out.println("El costo a pagar de su servicio "+Servicios+ " (Servicio Premium) es de: " +ServicioPremium+ " Dolares en la mañana");

               }else if(minutos>75){
                adicional=minutos-75;
                Cargo=adicional*0.10;
                total=ServicioPremium+Cargo;

                System.out.println("Ha excedido los 75 minutos");
                System.out.println("Su numero de cuenta es: "+ NumCuenta);
                System.out.println("Los minutos hablados fueron: "+minutos+ " Minutos");
                System.out.println("Los minutos excedidos fue de: "+adicional+ " Minutos");
                System.out.println("El cargo a pagar por los minutos excedidos es de: "+Cargo+ " Dolares");
                System.out.println("El total a pagar de su servicio "+Servicios+ "(Servicicio Premium) es de: "+total+ " Dolares en la mañana");
               }

               System.out.println("¿Cuantos minutos ha hablado en la noche? (6 p.m y 6 a.m)");
               minutos2=x.nextInt();

               if(minutos2<=100){
                System.out.println("Los primeros 100 minuto son gratis");
                System.out.println("Su numero de cuenta es: "+ NumCuenta);
                System.out.println("Los minutos hablados fueron: "+minutos2+ " Minutos en la noche");
                System.out.println("El costo a pagar de su servicio "+Servicios+ " (Servicio Premium) es de: " +ServicioPremium+ " Dolares en la noche");

               }else if(minutos2>100){
                adicional=minutos2-100;
                Cargo=adicional*0.05;
                total=ServicioPremium+Cargo;

                System.out.println("Ha excedido los 100 minutos");
                System.out.println("Su numero de cuenta es: "+ NumCuenta);
                System.out.println("Los minutos hablados fueron: "+minutos2+ " Minutos");
                System.out.println("Los minutos excedidos fue de: "+adicional+ " Minutos");
                System.out.println("El cargo a pagar por los minutos excedidos es de: "+Cargo+ " Dolares");
                System.out.println("El total a pagar de su servicio "+Servicios+ "(Servicicio Premium) es de: "+total+ " Dolares en la noche");
               }
              break;
            }
            default:
            System.out.println("No se ha digitado ninguna de las opciones disponibles");
        }
      }
      x.close();   
    }
}
