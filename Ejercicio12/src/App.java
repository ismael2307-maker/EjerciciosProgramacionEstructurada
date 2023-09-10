import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        double operacion,Total;
        int Codigocliente,NumCuenta,NumCanalesP,Conexiones;
        final double CargoFactura=4.50;
        final double CargoBasico=20.50;
        final double CanalesPremium=7.50;
        final double CargoFacturaN=15;
        final double CargoBasicoN=75;
        final double CanalesPremiumN=50;

        do{
        System.out.println("Digite su numero de cuenta (5 digitos)");
        NumCuenta=x.nextInt();
        }while(NumCuenta<10000 || NumCuenta>99999);

        System.out.println("1.-Cliente Residencial 2.-Clientes  de negocios");
        
        System.out.println("Seleccione su opcion");
        Codigocliente=x.nextInt();

        switch(Codigocliente){
            case 1:{
                do{
                System.out.println("Digite la cantidad de canales premium que desea adquirir");
                NumCanalesP=x.nextInt();
                }while(NumCanalesP<=0 || NumCanalesP>50);
                operacion=NumCanalesP*CanalesPremium;
                Total=CargoFactura+CargoBasico+operacion;

                //Resultados
                System.out.println("FACTURA: ");
                System.out.println("Numero de cuenta: "+NumCuenta);
                System.out.println("Codigo de cliente: "+ Codigocliente+ " Cliente Residencial");
                System.out.println("   ");
                System.out.println("Cargo por procesamiento de factura: "+CargoFactura+ " Cordobas");
                System.out.println("Cargo por servicio Basico: "+CargoBasico+ " Cordobas");
                System.out.println("Cargo por canales premium: "+CanalesPremium+ " Cordobas");
                System.out.println("   ");
                System.out.println("Numeros de canales premium a los que esta suscrito: "+NumCanalesP+ " Canales");
                System.out.println("Subtotal a pagar por los canales Premium: "+operacion+ " Cordobas");
                System.out.println("Total a pagar: "+Total+ " Cordobas");

             break;
            }
            case 2:{
                do{
                System.out.println("Digite la cantidad de canales premium que desea adquirir");
                NumCanalesP=x.nextInt();
                }while(NumCanalesP<=0 || NumCanalesP>70);

                do{
                System.out.println("¿Cuantas conexiones tiene?");
                Conexiones=x.nextInt();
                }while(Conexiones<=0 || Conexiones>20);

                if(Conexiones<=10){
                  //Operaciones
                  operacion=NumCanalesP*CanalesPremiumN;
                  Total=CargoFacturaN+CargoBasicoN+operacion;
                  //Resultados
                 System.out.println("Factura");
                 System.out.println("Numero de cuenta: "+NumCuenta);
                 System.out.println("Codigo de cliente: "+ Codigocliente+ " Cliente de negocios");
                 System.out.println("   ");
                 System.out.println("Cargo por procesamiento de factura: "+CargoFacturaN+ " Cordobas");
                 System.out.println("Cargo por servicio basico: "+CargoBasicoN+ " Cordobas. Por las primeras 10 conexiones");
                 System.out.println("Cargo por canales premium: "+CanalesPremiumN+ " Cordobas");
                 System.out.println("   ");
                 System.out.println("Numeros de canales premium a los que esta suscrito: "+NumCanalesP+ " Canales");
                 System.out.println("Subtotal a pagar por los canales Premium: "+operacion+ " Cordobas");
                 System.out.println("Total a pagar: "+Total+ " Cordobas");

                }else if(Conexiones>10){
                 operacion=NumCanalesP*CanalesPremiumN;
                 int adicional=Conexiones-10;
                 int Cargo=adicional*5;
                 double exceso=CargoBasicoN+Cargo;
                 Total=exceso+operacion+CargoFacturaN;

                 System.out.println("Factura");
                 System.out.println("Numero de cuenta: "+NumCuenta);
                 System.out.println("Codigo de cliente: "+ Codigocliente+ " Cliente de negocios");
                 System.out.println("   ");
                 System.out.println("Ha sobrepasado las conexiones");
                 System.out.println("Cargo por procesamiento de factura: "+CargoFacturaN+ " Cordobas");
                 System.out.println("Cargo por servicio basico: "+CargoBasicoN+ " Cordobas. Ha sobrepasado las conexiones");
                 System.out.println("Monto a pagar por exceder las 10 conexiones es de: "+Cargo);
                 System.out.println("Subtotal de servicio basico + Monto de exceso de conexiones:"+exceso+ " Cordobas");
                 System.out.println("  ");
                 System.out.println("Numeros de canales premium a los que esta suscrito: "+NumCanalesP+ " Canales");
                 System.out.println("Subtotal a pagar por los canales Premium: "+operacion+ " Cordobas");
                 System.out.println("Total a pagar: "+Total+ " Cordobas");

                }
              break;  
            }
        }   
        x.close();
    }
}

