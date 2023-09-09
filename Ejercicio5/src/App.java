import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner x=new Scanner(System.in);
       int numero, suma=0;
       

       do{
       System.out.println("Digite un numero");
       numero=x.nextInt();
       }while(numero<=0);

       int num=numero;
       while(numero>0){
        suma=suma + (numero%10);
        numero=numero/10;  
       }
       System.out.println("Terminos independientes: ");
       while(num>0){
        System.out.println(num%10);  
        num=num/10; 
       }
        System.out.println("El resultado de la suma es: "+suma); 
        x.close();
    }
}
