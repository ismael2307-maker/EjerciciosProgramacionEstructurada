import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        final int CargoMax=10;
        final double CuotaMinima=2.00;
        double HrsEstacionado,adicional,Cargo=0,Total;
        String Nombre=" ";

        for(int i=1;i<=3;i++){
            System.out.println("Digite su nombre, cliente #"+i+" :");
            Nombre=x.next();
            
            do{
            System.out.println("¿Cuantas horas estuvo estacionado?");
            HrsEstacionado=x.nextDouble();
            }while(HrsEstacionado<=0 || HrsEstacionado>24);
            if(HrsEstacionado<=3){
             System.out.println("Dentro del rango de las 3 Horas");
             System.out.println("Horas estacionado: "+HrsEstacionado+ " Horas");
             System.out.println(Nombre+ " Su cargo a pagar sera de: "+CuotaMinima+ " Cordobas");

            }else if(HrsEstacionado==24){
             System.out.println("Horas estacionado: "+HrsEstacionado+ " Horas");
             System.out.println(Nombre+ " Su cargo por las "+HrsEstacionado+ " Horas sera de: "+CargoMax+ " Cordobas");
             
            }else if(HrsEstacionado>3){
                System.out.println("Ha excedido las 3 horas");
                adicional=HrsEstacionado-3;
                Cargo=adicional*0.50;
                Total=Cargo+CuotaMinima;
                System.out.println("Horas estacionado: "+HrsEstacionado+ " Horas");
                System.out.println(Nombre+"Su cargo sera de: "+Total+ " Cordobas");
            }
        }


        x.close();
    }
}
