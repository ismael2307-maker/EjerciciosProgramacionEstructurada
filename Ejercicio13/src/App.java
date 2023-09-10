import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        double SaldoCordobas=0,SaldoDolares=0,Cordobas,Dolares,MontoRetiro;
        int operacion,CuentaDeposito,Retiro,Resultados;
        boolean ola=true;

        System.out.println("Su saldo actual en cordobas :"+SaldoCordobas+ " Cordobas");
        System.out.println("Su saldo actual en dolares :"+SaldoCordobas+ " Dolares");
        while(ola){
        System.out.println("1.-Deposito 2.Retiro 3.Salir");

        do{
        System.out.println("Digite su opcion");
        operacion=x.nextInt();
        }while(operacion<=0 || operacion>3);

        switch(operacion){
            case 1:{
               System.out.println("1.Cordobas 2.-Dolares");
               do{
               System.out.println("Digite su opcion");
               CuentaDeposito=x.nextInt();
               }while(CuentaDeposito<=0 || CuentaDeposito>2);

                 switch(CuentaDeposito){
                    case 1:{
                        System.out.println("Digite el monto que desea depositar");
                        Cordobas=x.nextDouble();
                        SaldoCordobas=SaldoCordobas+Cordobas;
                     break;
                    }
                    case 2:{
                        System.out.println("Digite el monto que desea depositar");
                        Dolares=x.nextDouble();
                        SaldoDolares=SaldoDolares+Dolares;
                     break;
                    }
                 }

             break;
            } 
            case 2:{
                System.out.println("1.-Cordobas 2.-Dolares");
                do{
                System.out.println("¿En que cuenta desea retirar?");
                Retiro=x.nextInt();
                }while(Retiro<=0 || Retiro>2);

                switch(Retiro){
                   case 1:{
                    do{
                    System.out.println("¿Cuanto quiere retirar");
                    MontoRetiro=x.nextDouble();
                    }while(MontoRetiro<=0);

                    if(MontoRetiro<=SaldoCordobas){
                        SaldoCordobas=SaldoCordobas-MontoRetiro;
                    }else{
                        System.out.println("No tiene mucho dinero en la cuenta de cordobas");
                    }
                    break;
                   }
                   case 2:{
                    do{
                    System.out.println("¿Cuanto quiere retirar");
                    MontoRetiro=x.nextDouble();
                    }while(MontoRetiro<=0);

                    if(MontoRetiro<=SaldoDolares){
                        SaldoDolares=SaldoDolares-MontoRetiro;
                    }else{
                        System.out.println("No tiene mucho dinero en la cuenta ");
                    }
                    break;
                   }
                }
             break;   
            }
            case 3:{
                
                System.out.println("1.-Si 2.-No");
                do{
                System.out.println("¿Quiere ver su saldo actual");
                Resultados=x.nextInt();
                }while(Resultados<=0 || Resultados>2);

                switch(Resultados){
                   case 1:{
                    
                     System.out.println("Su saldo en la cuenta de cordobas"+SaldoCordobas + " Cordobas");
                     System.out.println("Su saldo en la cuenta de dolares"+SaldoDolares+ " Dolares");
                     ola=false;
                    break;
                   }
                   case 2:{
                    System.out.println("Nos vemos");
                    break;
                   }
                }
            }
            
         } 
      }
         x.close();
         }
        }
    
 
 
 