import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int HorasTrabajo=40,HorasTrabajadas=0,Tarifa=0,SueldoBruto=0,HorasAdicional;
        String Nombres=" ";

        for(int i=1;i<=3;i++){
        System.out.println("Digite su nombre Empleado #"+ i + " : ");
        Nombres=x.next();

        do{
        System.out.println("Digite las horas trabajadas");
        HorasTrabajadas=x.nextInt();  
        }while(HorasTrabajadas<=0|| HorasTrabajadas>=70);

        do{
        System.out.println("Digite la tarifa por hora");
        Tarifa=x.nextInt();  
        }while(Tarifa<=0);

         if(HorasTrabajadas>40){
            HorasAdicional=HorasTrabajadas-40;
            SueldoBruto=HorasTrabajo*Tarifa+HorasAdicional;
         }else{
        SueldoBruto=HorasTrabajadas*Tarifa;
         }
         System.out.println(Nombres+" : "+ "Sueldo bruto de :"+SueldoBruto+ " Cordobas");
        }
          x.close(); 
        }
       
    }



