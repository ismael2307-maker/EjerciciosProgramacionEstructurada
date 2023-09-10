import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int num1,num2;
        int sumaPares=0,cuadrado=0,sumaImparesCuadrados=0;

        System.out.println("Digite el numero 1");
        num1=x.nextInt();

        System.out.println("Digite el numero 2");
        num2=x.nextInt();
       if(num1>=num2){
        System.out.println("El primer numero debe ser menor que el segundo");
       }else{
        while(num1<=num2){
            if(num1%2!=0){
                System.out.println(" Numeros impares: "+num1);
                sumaImparesCuadrados=sumaImparesCuadrados+(int)Math.pow(num1,2);
            }else{
                sumaPares=sumaPares+num1;
            }
              num1++;

             }
            System.out.println(" ");
            System.out.println("La suma de los pares es: "+sumaPares);
            
            int numero=num1;
            while(numero<=num2){
                System.out.println(numero+ " ^2 = "+(numero*numero));
                numero++;   
            }

            System.out.println("La suma de los cuadrados impares: "+sumaImparesCuadrados);
            numero=num1;
           
           
       }  
      x.close();        
    }
}
