import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int totalRos,CajasRos,CajasDese,Contenedor,ContenedorDese;

        do{
        System.out.println("Digite el total de rosquillas");
        totalRos=x.nextInt();
        }while(totalRos<=0);

        CajasRos=totalRos/24;
        CajasDese=totalRos%24;
        Contenedor=CajasRos/75;
        ContenedorDese=CajasRos%75;

        System.out.println("Cajas necesarias: "+CajasRos);
        System.out.println("Contenedores necesarios: "+Contenedor);
        System.out.println("Rosquillas que sobraron: "+CajasDese);
        System.out.println("Cajas que sobraron: "+ContenedorDese);

     x.close();
      
    }
}
