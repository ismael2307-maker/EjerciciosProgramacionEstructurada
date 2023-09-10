import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int NumCuenta;
        double Saldo=0,CargoServivio,SaldoActual=0,SaldoNuevo=0,Interes;
        char cuenta;

        do{
        System.out.println("Digite su numero de cuenta (Digite 5 digitos):");
        NumCuenta=x.nextInt();
        }while(NumCuenta<10000 || NumCuenta>99999);

        System.out.println(".-s(Cuenta ahorros) .-c(Cuenta cheques)");

        System.out.println("Digite su tipo de cuenta");
        cuenta=x.next().charAt(0);

        switch(cuenta){
           case 's':{
              System.out.println("Digite su saldo"); 
              Saldo=x.nextDouble();

              if(Saldo<100){
                System.out.println("Se le ha impuesto un cargo por servicio");
               CargoServivio=Saldo-10; 
               SaldoActual=Saldo;
               SaldoNuevo=CargoServivio;
              }else if(Saldo>=100){
               Interes=Saldo*0.04;
               SaldoActual=Saldo;
               SaldoNuevo=Saldo+Interes;
              }
              System.out.println("Su numero de cuenta es: "+NumCuenta);
              System.out.println("Su tipo de cuenta es: "+cuenta+ " Cuenta de ahorros");
              System.out.println("Su saldo actual es: "+SaldoActual +" Dolares");
              System.out.println("Su saldo nuevo es de: "+SaldoNuevo +" Dolares");
            break;
           }
           case 'c':{
              System.out.println("Digite su saldo"); 
              Saldo=x.nextDouble(); 

              if(Saldo<500){
                System.out.println("Se le ha impuesto un cargo por servicio");
               CargoServivio=Saldo-25; 
               SaldoActual=Saldo;
               SaldoNuevo=CargoServivio;

              }else if(Saldo>=500 && Saldo<=5000){
               System.out.println("Ha ganado un Interes del 3%");
               Interes=Saldo*0.03;
               SaldoActual=Saldo;
               SaldoNuevo=Saldo+Interes;

              }else if(Saldo>=5000
              ){
               System.out.println("Ha ganado un Interes del 5%");
               Interes=Saldo*0.05;
               SaldoActual=Saldo;
               SaldoNuevo=Saldo+Interes;
              }
              System.out.println("Su numero de cuenta es: "+NumCuenta);
              System.out.println("Su tipo de cuenta es: "+cuenta+ " Cuenta de ahorros");
              System.out.println("Su saldo actual es: "+SaldoActual +" Dolares");
              System.out.println("Su saldo nuevo es de: "+SaldoNuevo +" Dolares");
            break;
           }
           default:
             System.out.println("No se ha digitado ninguna de las opciones disponibles");
        }
     
     x.close();   
    }
}
