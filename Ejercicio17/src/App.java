import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
       int NumArticulo;
       double Articulo=0,Dinero=0,Porcentaje,SumaArticulos=0,IngresosTotales=0,operacion=0;
       ;

        do{
        System.out.println("¿Cuanto dinero recibe por semana?");
        Dinero=x.nextDouble();
        }while(Dinero<=0 || Dinero>1000);

        do{
        System.out.println("¿Cual es el porcentaje de sus ventas?");
        Porcentaje=x.nextDouble()/100;
        }while(Porcentaje<=0 || Porcentaje>15);

        System.out.println("¿Cuantos articulos gestionara?");
        NumArticulo=x.nextInt();

       for(int i=1;i<=NumArticulo;i++){
        do{
        System.out.println("Valor del articulo #"+i+ " :");
        Articulo=x.nextDouble();
        }while(Articulo<=0 || Articulo>6000);
         SumaArticulos=SumaArticulos+Articulo;
         operacion=SumaArticulos*Porcentaje;
         IngresosTotales=SumaArticulos+operacion+Dinero;
       }
         System.out.println("Dinero recibido en la semana: "+Dinero+ " Cordobas");
         System.out.println("Porcentaje de sus ventas: "+Porcentaje+ " %");
         System.out.println("Numero de articulos vendidos en una Semana: "+NumArticulo);
         System.out.println("Subtotal de la suma de los articulos vendidos: "+SumaArticulos+ " Cordobas");
         System.out.println(Porcentaje+"% de "+SumaArticulos+ " = "+operacion+ " Cordobas");
         System.out.println("Subtotal de "+operacion+ " + "+Dinero+" = "+ ( operacion+Dinero)+" Cordobas");
         System.out.println("Los ingresos totales del vendedor fueron de: "+IngresosTotales+ " Cordobas");
         
     x.close();
    }
}
