import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        double a,b,c;
        double operacion1,operacion2,operacion3,operacion4,operacion5,operacion6;
        
        do{
        System.out.println("Digite el valor del lado #1");
        a=x.nextDouble();
        }while(a<=0);

        do{
        System.out.println("Digite el valor del lado #2");
        b=x.nextDouble();
        }while(b<=0);

        do{
        System.out.println("Digite el valor del lado #3");
        c=x.nextDouble();
        }while(b<=0);
        
        //Operaciones
        operacion1=b-a;
        operacion2=b-c;
        operacion3=a-c;

        operacion4=b+a;
        operacion5=b+c;
        operacion6=a+c;  
        
        if((operacion1<c && c<operacion4) && (operacion2<a && a<operacion5) && (operacion3<b && b<operacion6)){
            System.out.println("Resultado: "+operacion1+ " < "+c+ " < "+operacion4);
            System.out.println("Resultado: "+operacion2+ " < "+a+ " < "+operacion5);
            System.out.println("Resultado: "+operacion3+ " < "+b+ " < "+operacion6);  
            System.out.println("SI EXISTE");

            if(a==b && a==c && b==c){
            System.out.println("El triangulo es equilatero");
             }else if(a==b && a!=c || a==c && a!=b || b==c && b!=a) {
            System.out.println("El tringulo es Isosceles");
             }else if(a!=b && a!=c && b!=c){
            System.out.println("El triangulo es escaleno");
          }
         }else{
             System.out.println("No se cumple la propiedad para determinar la existencia de un triangulo ");
             System.out.println("NO EXISTE");
         }

         

      x.close();  
    }
}
