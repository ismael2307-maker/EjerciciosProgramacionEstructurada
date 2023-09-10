import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        double MontoPrestamo,InteresAnual,InteresMensual,PagoMensual,PagoCapital,PrecioMensual;
        int Meses=0;

        do{
        System.out.println("Digite el monto del prestamo");
        MontoPrestamo=x.nextDouble();
        }while(MontoPrestamo<=0 || MontoPrestamo>=100000);

        do{
        System.out.println("Digite el interes anual");
        InteresAnual=x.nextDouble()/100;
        }while(InteresAnual<=0 || InteresAnual>8);

        do{
        System.out.println("Digite el pago mensual");
        PagoMensual=x.nextDouble();
        }while(PagoMensual<=0 || PagoMensual>100);

        PrecioMensual=InteresAnual/12;  
        InteresMensual=MontoPrestamo*PrecioMensual;
        
        while(MontoPrestamo>0){
            if(PagoMensual<=InteresMensual){
                System.out.println("El pago es insuficiente para reducir el monto del prestamo. Su prestamo aumentara");
            }else{
                PagoCapital=PagoMensual-InteresMensual;
                MontoPrestamo=MontoPrestamo-PagoCapital;
                InteresMensual=MontoPrestamo*PrecioMensual;   
            }
             Meses++;
        }
       if(MontoPrestamo<=0){
            System.out.println("El prestamo se pagara en "+Meses+ " Meses");
       }
        x.close();
    }
}
