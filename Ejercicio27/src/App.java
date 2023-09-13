import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        final double inss=0.07;
        final double InssPatro=0.225;
        double IngN,IngT,Dtotales,IngAntiguedad,DeduccionInss,DeduccionIr,MontoAds,DeduccionEmpre;
        int AñoAntiguedad=0;
        int Salario;

        do{
        System.out.println("Digite el monto de su salario");
        Salario=x.nextInt();
        }while(Salario<=0 || Salario>1000000);

        do{
        System.out.println("Digite sus años de antiguedad");
        AñoAntiguedad=x.nextInt();
        }while(AñoAntiguedad<=0 || AñoAntiguedad>50);

        if((AñoAntiguedad==1) || (Salario<100001 || Salario>200000) ){
            IngAntiguedad=Salario*0.03;
            IngT=IngAntiguedad+Salario;

            DeduccionInss=IngT*inss;
            DeduccionIr=IngT*0.15;
            MontoAds=Salario*0.01;
            Dtotales=DeduccionInss+DeduccionIr+MontoAds;
            DeduccionEmpre=IngT*InssPatro;

            IngN=IngT-Dtotales;
            //Resultados
             System.out.println("Su Ingreso por antiguedad es: "+IngAntiguedad+ " Cordobas");
             System.out.println("Su ingreso total es: "+IngT+" Cordobas");
             System.out.println("  ");
             System.out.println("Su deduccion Inss es: "+DeduccionInss+" Cordobas");
             System.out.println("Su deduccion IR es: "+DeduccionIr+" Cordobas");
             System.out.println("El monto por afilacion de sindicato es: "+MontoAds);
             System.out.println("Las deducciones totales son: "+Dtotales+" Cordobas");
             System.out.println("La deduccion empresarial es: "+DeduccionEmpre+" Cordobas");
             System.out.println("  ");
             System.out.println("Su ingreso neto es: "+IngN+" Cordobas");

        }else if((AñoAntiguedad>2 || AñoAntiguedad<=20)|| (Salario<200001 || Salario>350000)){
            IngAntiguedad=Salario*0.4;
            IngT=IngAntiguedad+Salario;

            DeduccionInss=IngT*inss;
            DeduccionIr=IngT*0.2;
            MontoAds=Salario*0.01;
            Dtotales=DeduccionInss+DeduccionIr+MontoAds;
            DeduccionEmpre=IngT*InssPatro;

            IngN=IngT-Dtotales;
            //Resultados
             System.out.println("Su Ingreso por antiguedad es: "+IngAntiguedad+ " Cordobas");
             System.out.println("Su ingreso total es: "+IngT+" Cordobas");
             System.out.println("  ");
             System.out.println("Su deduccion Inss es: "+DeduccionInss+" Cordobas");
             System.out.println("Su deduccion IR es: "+DeduccionIr+" Cordobas");
             System.out.println("El monto por afilacion de sindicato es: "+MontoAds);
             System.out.println("Las deducciones totales son: "+Dtotales+" Cordobas");
             System.out.println("La deduccion empresarial es: "+DeduccionEmpre+" Cordobas");
             System.out.println("  ");
             System.out.println("Su ingreso neto es: "+IngN+" Cordobas");

        }else if((AñoAntiguedad>21 || AñoAntiguedad<=30)|| (Salario<3500001 || Salario>500000)){
            IngAntiguedad=Salario*0.5;
            IngT=IngAntiguedad+Salario;

            DeduccionInss=IngT*inss;
            DeduccionIr=IngT*0.25;
            MontoAds=Salario*0.01;
            Dtotales=DeduccionInss+DeduccionIr+MontoAds;
            DeduccionEmpre=IngT*InssPatro;

            IngN=IngT-Dtotales;

            //Resultados
             System.out.println("Su Ingreso por antiguedad es: "+IngAntiguedad+ " Cordobas");
             System.out.println("Su ingreso total es: "+IngT+" Cordobas");
             System.out.println("  ");
             System.out.println("Su deduccion Inss es: "+DeduccionInss+" Cordobas");
             System.out.println("Su deduccion IR es: "+DeduccionIr+" Cordobas");
             System.out.println("El monto por afilacion de sindicato es: "+MontoAds);
             System.out.println("Las deducciones totales son: "+Dtotales+" Cordobas");
             System.out.println("La deduccion empresarial es: "+DeduccionEmpre+" Cordobas");
             System.out.println("  ");
             System.out.println("Su ingreso neto es: "+IngN+" Cordobas");
          
        }else if((AñoAntiguedad>30)||(Salario>=500001)){
            IngAntiguedad=Salario*0.6;
            IngT=IngAntiguedad+Salario;

            DeduccionInss=IngT*inss;
            DeduccionIr=IngT*0.3;
            MontoAds=Salario*0.01;
            Dtotales=DeduccionInss+DeduccionIr+MontoAds;
            DeduccionEmpre=IngT*InssPatro;

            IngN=IngT-Dtotales;
            //Resultados
             System.out.println("Su Ingreso por antiguedad es: "+IngAntiguedad+ " Cordobas");
             System.out.println("Su ingreso total es: "+IngT+" Cordobas");
             System.out.println("  ");
             System.out.println("Su deduccion Inss es: "+DeduccionInss+" Cordobas");
             System.out.println("Su deduccion IR es: "+DeduccionIr+" Cordobas");
             System.out.println("El monto por afilacion de sindicato es: "+MontoAds);
             System.out.println("Las deducciones totales son: "+Dtotales+" Cordobas");
             System.out.println("La deduccion empresarial es: "+DeduccionEmpre+" Cordobas");
             System.out.println("  ");
             System.out.println("Su ingreso neto es: "+IngN+" Cordobas");

        }

     x.close();
    }
}
