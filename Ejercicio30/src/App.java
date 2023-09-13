import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int opcion,Total=0;

        do{

        System.out.println("Menu de McDonalds");
        System.out.println("1.-McMuffin de salchicha y huevo 2.-McMuffin Nica con Salchicha 3.-Big mac");
        System.out.println("4.-Coca Cola 5.-Fanta Naranja 6.-Mostrar factura");
        System.out.println("Seleccione su opcion");
        opcion=x.nextInt();

        switch(opcion){
            case 1:{
                System.out.println("Se agrego el McMuffin de salchicha y huevo");
                Total=Total+181;
              break;
            }
            case 2:{
                System.out.println("Se agrego el McMuffin Nica con Salchicha");
                Total=Total+190;
              break;
            }
            case 3:{
                System.out.println("Se agrego la Big mac");
                Total=Total+220;
              break;
            }
            case 4:{
                System.out.println("Se agrego la Coca Cola");
                Total=Total+30;
              break;
            }
            case 5:{
                 System.out.println("Se agrego la Fanta Naranja");
                 Total=Total+30;
              break;
            }
             case 6:{
                System.out.println("Muchas Gracias por su Compra. Lo esperamos pronto");
                break;
             }
             default:
             System.out.println("No ha ingresado ninguna de las opciones proporcionadas");

        }
       }while((opcion<=0) || (opcion!=6));
       
       System.out.println("FACTURA");
       System.out.println("Su total a pagar es: "+Total+ " Cordobas");
        
       x.close();
    }
}
