import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
       String Nombre="";
       int NumCuenta,SaldoInicial=0,TotalCargos=0,TotalCreditos=0,Limite,NuevoSaldo=0;

       for(int i=1;i<=3;i++){
        System.out.println("Digite su nombre, cliente: #"+i);
        Nombre=x.next();

        do{
        System.out.println("Digite su numero de cuenta (5 digitos)");
        NumCuenta=x.nextInt();
        }while(NumCuenta<10000 || NumCuenta>99999);

        do{
        System.out.println("Digite su saldo al inicio del mes: ");
        SaldoInicial=x.nextInt();
        }while(SaldoInicial<=0);

        do{
        System.out.println("Digite el total de los articulos cargados en el mes: ");
        TotalCargos=x.nextInt();
        }while(TotalCargos<=0);

        do{
        System.out.println("Digite el total de creditos en el mes: ");
        TotalCreditos=x.nextInt();
        }while(TotalCreditos<=0);

         do{
        System.out.println("Digite el limite: ");
        Limite=x.nextInt();
        }while(Limite<=0 || Limite>1000);

         NuevoSaldo=SaldoInicial+TotalCargos-TotalCreditos;
        if(NuevoSaldo>Limite){
          System.out.println("Se ha excedido el limite de su credito");
        }else{
            System.out.println(Nombre + "Su numero de cuenta es: "+NumCuenta);
            System.out.println(Nombre + "Su nuevo saldo es: "+NuevoSaldo+ " Cordobas");
        }

       }
       
       x.close();
    }
}
