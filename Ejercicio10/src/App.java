import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner x=new Scanner(System.in);
        char sexo;
        double PesoCorporal,MedidaMuñeca,MedidaCintura,MedidaCadera,MedidaAntebrazo,GrasaCorporal,Porcentaje;
        double A1,A2,A3,A4,A5,B;

        System.out.println(".-m(Masculino) .-f(Femenino)");

        System.out.println("Digite su sexo");
        sexo=x.next().charAt(0);

        switch(sexo){
            case 'f':{
                do{
                System.out.println("Digite su peso corporal");
                PesoCorporal=x.nextDouble();
                }while(PesoCorporal<=0 || PesoCorporal<18);

                do{
                System.out.println("Digite la medida de su muñeca(punto mas amplio)");
                MedidaMuñeca=x.nextDouble();
                }while(MedidaMuñeca<=0 || MedidaMuñeca<12);

                do{
                System.out.println("Digite la medida de la cintura(en el ombligo)");
                MedidaCintura=x.nextDouble();
                }while(MedidaCintura<=0 || MedidaCintura<58);

                do{
                System.out.println("Digite la medida de la cadera(en el punto mas amplio)");
                MedidaCadera=x.nextDouble();
                }while(MedidaCadera<=0 || MedidaCadera<=86 );

                do{
                System.out.println("Digite la medida del antebrazo(en el punto mas amplio)");
                MedidaAntebrazo=x.nextDouble();
                }while(MedidaAntebrazo<=0 || MedidaAntebrazo>=1.94);

                //Operaciones
                A1=(PesoCorporal*0.732)+8.987;
                A2=MedidaMuñeca/3.140;
                A3=MedidaCintura*0.157;
                A4=MedidaCadera*0.249;
                A5=MedidaAntebrazo*0.434;
                B=A1+A2-A3-A4+A5;
                GrasaCorporal=PesoCorporal-B;
                Porcentaje=GrasaCorporal*100/PesoCorporal;

                //Resultados
                System.out.println("Su grasa corporal es de: "+GrasaCorporal);
                System.out.println("Su porcentaje de grasa corporal es: "+Porcentaje);  
                break;
            }
            case 'F':{
                do{
                System.out.println("Digite su peso corporal");
                PesoCorporal=x.nextDouble();
                }while(PesoCorporal<=0 || PesoCorporal<18);

                do{
                System.out.println("Digite la medida de su muñeca(punto mas amplio)");
                MedidaMuñeca=x.nextDouble();
                }while(MedidaMuñeca<=0 || MedidaMuñeca<12);

                do{
                System.out.println("Digite la medida de la cintura(en el ombligo)");
                MedidaCintura=x.nextDouble();
                }while(MedidaCintura<=0 || MedidaCintura<58);

                do{
                System.out.println("Digite la medida de la cadera(en el punto mas amplio)");
                MedidaCadera=x.nextDouble();
                }while(MedidaCadera<=0 || MedidaCadera<=86);

                do{
                System.out.println("Digite la medida del antebrazo(en el punto mas amplio)");
                MedidaAntebrazo=x.nextDouble();
                }while(MedidaAntebrazo<=0 || MedidaAntebrazo>=1.94);

                //Operaciones
                A1=(PesoCorporal*0.732)+8.987;
                A2=MedidaMuñeca/3.140;
                A3=MedidaCintura*0.157;
                A4=MedidaCadera*0.249;
                A5=MedidaAntebrazo*0.434;
                B=A1+A2-A3-A4+A5;
                GrasaCorporal=PesoCorporal-B;
                Porcentaje=GrasaCorporal*100/PesoCorporal;

                //Resultados
                System.out.println("Su grasa corporal es de: "+GrasaCorporal);
                System.out.println("Su porcentaje de grasa corporal es: "+Porcentaje); 
             break;
            }
            case 'm':{
                do{
                System.out.println("Digite su peso corporal");
                PesoCorporal=x.nextDouble();
                }while(PesoCorporal<=0 || PesoCorporal<18.5);

                do{
                System.out.println("Digite la medida de la cintura(en el ombligo)");
                MedidaCintura=x.nextDouble();
                }while(MedidaCintura<=0 || MedidaCintura<70);

                //Operaciones
                A1=(PesoCorporal*1.082)+94.42;
                A2=MedidaCintura*4.15;
                B=A1-A2;
                GrasaCorporal=PesoCorporal-B;
                Porcentaje=GrasaCorporal*100/PesoCorporal;

                //Resultados
                System.out.println("Su grasa corporal es: "+GrasaCorporal+ "%");
                System.out.println("Su porcentaje de grasa corporal es: "+Porcentaje+ " %");
              break;
            }
            case 'M':{
                do{
                System.out.println("Digite su peso corporal");
                PesoCorporal=x.nextDouble();
                }while(PesoCorporal<=0 || PesoCorporal<18.5);

                do{
                System.out.println("Digite la medida de la cintura(en el ombligo)");
                MedidaCintura=x.nextDouble();
                }while(MedidaCintura<=0 || MedidaCintura<70);

                //Operaciones
                A1=(PesoCorporal*1.082)+94.42;
                A2=MedidaCintura*4.15;
                B=A1-A2;
                GrasaCorporal=PesoCorporal-B;
                Porcentaje=GrasaCorporal*100/PesoCorporal;

                //Resultados
                System.out.println("Su grasa corporal es: "+GrasaCorporal+ "%");
                System.out.println("Su porcentaje de grasa corporal es: "+Porcentaje+ " %");

              break;
            }
        }
        x.close();
    }
}
