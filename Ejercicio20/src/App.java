public class App {
    public static void main(String[] args) throws Exception {
        int ola=1;
        while(ola<=300000000){
            if(ola%1000000==0){
                System.out.println("El multiplo de 1000000 es: "+ola);
            }
           ola++;
        }
    }
}
