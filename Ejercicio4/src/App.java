import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int a=0,b=0,c=0;  
        double determinante,x1,x2;  

        System.out.println("Digite el valor de a");
        a=x.nextInt();

        System.out.println("Digite el valor de b");
        b=x.nextInt();

        System.out.println("Digite el valor de c");
        c=x.nextInt();

        determinante=Math.pow(b,2)-(4*a*c);
        if(determinante>0){
            x1=((b*(-1))+Math.sqrt(determinante))/(2*a);
            x2=((b*(-1))-Math.sqrt(determinante))/(2*a);
            System.out.println ("El valor de x1= "+x1+ " y el valor de x2= "+x2);     
        }else{
            System.out.println("El determinate es negativo");
        }
        x.close();
    }
}
