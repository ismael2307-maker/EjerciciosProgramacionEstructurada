import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner x=new Scanner(System.in);
       long num=0;
       System.out.println("Digite un numero");
       num=x.nextLong();

       for(int i=2;i<=num;i++){
         while(num%i==0){
          System.out.print(""+i);
          num/=i;
         }
         System.out.println("Los posibles factores son: "+num); 
       } 
      
       x.close();
    }
}
