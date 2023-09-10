import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        double ancho,longitud,operacion,pulgadas2,pulgadas3,operacion2,operacion3,operacion4,TOTAL;
        int TipoMarco,opcion2;
        char Color, opcion;
        final double PintarMarcoRegular=0.15;
        final double PintarMarcoLujoso=0.25;

        System.out.println("1.-Marco regular 2.-Marco Lujoso");
        System.out.println("Seleccione el tipo de marco que desee llevar");
        TipoMarco=x.nextInt();

        switch(TipoMarco){
            case 1:{
              System.out.println("Digite el color para el marco");
              Color=x.next().charAt(0);

             do{
             System.out.println("Digite el valor en pulgadas de la longitud del marco");
             longitud=x.nextDouble();
             }while(longitud<10 || longitud>=100);

             do{
             System.out.println("Digite el valor en pulgadas del ancho del marco");
             ancho=x.nextDouble();
             }while(longitud<5|| longitud>=100);

             operacion=longitud+ancho;
             double Subtotal=operacion*PintarMarcoRegular;

             System.out.println("Digite el valor de las pulgadas para el carton");
             pulgadas2=x.nextDouble();

             operacion2=pulgadas2*0.02;

             System.out.println("Digite el valor de las pulgadas para el vidrio");
             pulgadas3=x.nextDouble();

             operacion3=pulgadas3*0.07;
             
             System.out.println("Desea pornerles coronas al marco de su fotografia?");
             opcion=x.next().charAt(0);

             if(opcion=='S' || opcion=='s'){
                System.out.println("Cuantas coronas desea poner?");
                opcion2=x.nextInt();
                operacion4=opcion2*0.35;
                TOTAL=Subtotal+operacion2+operacion3+operacion4;

                System.out.println("La longitud es de: "+longitud);
                System.out.println("El ancho es de: "+ancho);
                System.out.println("El tipo de marco es: "+TipoMarco);
                System.out.println("El color para el marco es: "+Color);
                System.out.println("Precio para pintar el marco: "+Subtotal);
                System.out.println("Precio para poner el carton para el marco: "+operacion2);
                System.out.println("Precio para poner el vidrio para el marco: "+operacion3);
                System.out.println("NUmero de coronas: "+opcion2);
                System.out.println("Precio por las"+opcion2+ " Coronas: "+operacion4);
                System.out.println("El total a pagar es "+TOTAL );

             }else if(opcion=='N'|| opcion=='n'){
                TOTAL=Subtotal+operacion2+operacion3;
                System.out.println("La longitud es de: "+longitud);
                System.out.println("El ancho es de: "+ancho);
                System.out.println("El tipo de marco es: "+TipoMarco+ " Marco Regular");
                System.out.println("El color para el marco es: "+Color);
                System.out.println("Precio para pintar el marco: "+Subtotal+ " Cordobas");
                System.out.println("Precio para poner el carton para el marco: "+operacion2+ " Cordobas");
                System.out.println("Precio para poner el vidrio para el marco: "+operacion3+ " Cordobas");
                 System.out.println("El total a pagar es "+TOTAL );
             }
             break;
            }
            case 2:{
             System.out.println("Digite el color para el marco");
              Color=x.next().charAt(0);

             do{
             System.out.println("Digite el valor en pulgadas de la longitud del marco");
             longitud=x.nextDouble();
             }while(longitud<10 || longitud>=100);

             do{
             System.out.println("Digite el valor en pulgadas del ancho del marco");
             ancho=x.nextDouble();
             }while(longitud<5|| longitud>=100);

             operacion=longitud+ancho;
             double Subtotal=operacion*PintarMarcoLujoso;

             System.out.println("Digite el valor de las pulgadas para el carton");
             pulgadas2=x.nextDouble();

             operacion2=pulgadas2*0.02;

             System.out.println("Digite el valor de las pulgadas para el vidrio");
             pulgadas3=x.nextDouble();

             operacion3=pulgadas3*0.07;

              System.out.println("Desea pornerles coronas al marco de su fotografia?");
             opcion=x.next().charAt(0);

             if(opcion=='S' || opcion=='s'){
                System.out.println("Cuantas coronas desea poner?");
                opcion2=x.nextInt();
                operacion4=opcion2*0.35;
                TOTAL=Subtotal+operacion2+operacion3+operacion4;

                System.out.println("La longitud es de: "+longitud);
                System.out.println("El ancho es de: "+ancho);
                System.out.println("El tipo de marco es: "+TipoMarco);
                System.out.println("El color para el marco es: "+Color);
                System.out.println("Precio para pintar el marco: "+Subtotal);
                System.out.println("Precio para poner el carton para el marco: "+operacion2);
                System.out.println("Precio para poner el vidrio para el marco: "+operacion3);
                System.out.println("NUmero de coronas: "+opcion2);
                System.out.println("Precio por las"+opcion2+ " Coronas: "+operacion4);
                System.out.println("El total a pagar es: "+TOTAL);

             }else if(opcion=='N'|| opcion=='n'){
                TOTAL=Subtotal+operacion2+operacion3;
                System.out.println("La longitud es de: "+longitud);
                System.out.println("El ancho es de: "+ancho);
                System.out.println("El tipo de marco es: "+TipoMarco+ " Marco Regular");
                System.out.println("El color para el marco es: "+Color);
                System.out.println("Precio para pintar el marco: "+Subtotal+ " Cordobas");
                System.out.println("Precio para poner el carton para el marco: "+operacion2+ " Cordobas");
                System.out.println("Precio para poner el vidrio para el marco: "+operacion3+ " Cordobas");
            }
        }

        }
        
        x.close();
    }
}
