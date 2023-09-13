import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        int opcion,Hrs,ola=0;

        while(ola==0){
        System.out.println("1.Apartamento 2.Casa 3.-Dormitorio");
        do{
          System.out.println("¿Usted vive en un?");
          opcion=x.nextInt();
        }while(opcion<=0 || opcion>3);

        switch(opcion){
            case 1:{
                do {
                  System.out.println("¿Cuantas horas pasa en su apartamento?");
                  Hrs=x.nextInt();
                } while (Hrs<=0 || Hrs>100);

                if(Hrs<10){
                    System.out.println("Usted necesita un Hamster");
                }else if(Hrs>=10){
                    System.out.println("Usted necesita un gato");
                }
             break; 
            }
            case 2:{
                 do {
                  System.out.println("¿Cuantas horas pasa en su casa?");
                  Hrs=x.nextInt();
                } while (Hrs<=0 || Hrs>100);

                if(Hrs<10){
                    System.out.println("Usted necesita una serpiente");
                }else if(Hrs>=10 && Hrs<=17){
                    System.out.println("Usted necesita un Perro");
                }else if(Hrs>=18){
                    System.out.println("Usted necesita un Cerdo Barrigon");
                }
             break;
            }
            case 3:{
                 do {
                  System.out.println("¿Cuantas horas pasa en su dormitorio?");
                  Hrs=x.nextInt();
                } while (Hrs<=0 || Hrs>100);

                if(Hrs<6){
                    System.out.println("Usted necesita una granja de hormigas");
                }else if(Hrs>=6){
                    System.out.println("Usted necesita un pez");
                }
                
             break;    
            }

                
        }//switch
                
    }
     x.close();  
    }
}
