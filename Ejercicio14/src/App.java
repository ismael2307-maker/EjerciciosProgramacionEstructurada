import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int Kilometros,Litros,TotalK=0,TotalLi=0,ola=0,operacion;
        double KilometroPorlitro,Total=0;
        while(ola==0){
         do{
         System.out.println("1.-Usar programa 2.-Salir");
         operacion=x.nextInt();
         }while(operacion<=0 || operacion>2);
         switch(operacion){
            case 1:{
            System.out.println("Digite los kilometros conducidos: ");
            Kilometros=x.nextInt();

            do{
            System.out.println("Digite los litros usados: ");
            Litros=x.nextInt();
            }while(Litros<=0);

            KilometroPorlitro=(double)Kilometros/Litros;
            System.out.println("Kilometros por litro hechos en este viaje: "+KilometroPorlitro);

            TotalK=TotalK+Kilometros;
            TotalLi=TotalLi+Litros;
            
            Total=(double)TotalK/TotalLi;
            System.out.println("Kilometros por litro total: "+Total);

            break;
            }
            
            case 2:{
                ola=1;  
                System.out.println("Nos vemos");
                break;
            }
         }
        }

         x.close();
    }
}
