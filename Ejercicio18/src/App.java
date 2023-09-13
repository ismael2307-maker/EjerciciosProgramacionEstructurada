import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int Figura,dimension,ancho,Filas;

         System.out.println("1.-Tringulo Rectangulo 2.-equilatero 3.-Cuadrado 4.-Rectangulo 5.-Paralelogramo");
         System.out.println(" ");
         do{
         System.out.println("Seleccione su opcion");
         Figura=x.nextInt();
         }while(Figura<=0 || Figura>10);

         switch(Figura){
            case 1:{
                System.out.println("Ingrese las dimensiones");
                dimension=x.nextInt();
               for(int i=1;i<dimension;i++){
                 for(int j=1;j<=i;j++){
                    System.out.print(" * ");
                 }
                 System.out.println();
               }
             break;
            }
            case 2:{
                System.out.println("Ingrese las dimensiones");
                dimension=x.nextInt();
                for(int i=1;i<=dimension;i++){
                  for(int j=1;j<=dimension-i;j++){
                  System.out.print("");
                  }
                 for(int k=1;k<=2*i-1;k++){
                  System.out.print(" * ");
                 }
                 System.out.println();
                }
             break;
            }
            case 3:{
               System.out.println("Ingrese las dimensiones");
               dimension=x.nextInt();
               for(int i=0;i<dimension;i++){
                for(int j=0;j<dimension;j++){
                 if(i==0 || i==dimension-1 || j==0 || j==dimension-1){
                     System.out.print("*" );
                 }else{
                   System.out.print(" ");
                 }

                }
                System.out.println();
               }
              break;
            }
            case 4:{
               System.out.println("Ingrese las dimensiones");
               dimension=x.nextInt();

               System.out.println("Ingrese el ancho");
               ancho=x.nextInt();

               for(int i=0;i<dimension;i++){
                for(int j=0;j<ancho;j++){
                  if(i==0 || i==dimension-1 || j==0 || j<ancho-1){
                    System.out.print("*" );
                  }else{
                    System.out.print(" ");

                  }
                }
                System.out.println();
              }
              break;
              }
              case 5:{
               System.out.println("Ingrese las dimensiones");
               dimension=x.nextInt();

                System.out.println("Ingrese numeros de filas");
                Filas=x.nextInt();

                for(int i=0;i<dimension;i++){
                  for(int j=0;j<i;j++){
                    System.out.print(" ");
                  }
                  for(int k=0;k<Filas;k++){
                    System.out.print(" * ");
                  }
                  System.out.println();
                }
                break;
              }
              case 6:{

              }
         }
         x.close();
    }
}
