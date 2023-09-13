
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int Opcion,Operacion,ola=1;

        while(ola==1){

        System.out.println("1.-Vectores en 2D 2.-Vectores en 3D");
        do{
        System.out.println("Digite su opcion");
        Opcion=s.nextInt();
        }while(Opcion<=0 || Opcion>2);

        switch(Opcion){
            case 1:{
                 System.out.println("1-Suma de vectores 2.-Resta de vectores 3.-Opuesto de un vector 4.-Escalar por un vector 5.-Producto punto entre vectores");
                 System.out.println(" 6.-Vectores Paralelos 7.-Vectores ortogonales 8.-Proyeccion 9-Producto cruz");
                 do{
                 System.out.println("Digite la operacion que desee");
                 Operacion=s.nextInt();
                 }while(Operacion<=0 || Operacion>9); 

                 switch(Operacion){
                    case 1:{
                     int x1,x2,y1,y2,SumaX=0,SumaY=0;

                     do{
                        System.out.println("Digite el valor de x1 del primer vector");
                        x1=s.nextInt();
                        }while(x1<0);
        
                        do{
                        System.out.println("Digite el valor de y1 del primer vector");
                        y1=s.nextInt();
                        }while(y1<0);
        
                        do{
                        System.out.println("Digite el valor de x2 del segundo vector");
                        x2=s.nextInt();
                        }while(x2<0);
        
                        do{
                        System.out.println("Digite el valor de y2 del segundo vector");
                        y2=s.nextInt();
                        }while(y2<0);
                        SumaX=x1+x2;
                        SumaY=y1+y2;
                        System.out.println("La suma del primer vector y segundo vector es: ("+SumaX+ " , "+SumaY+")");
                     break;
                    }
                    case 2:{
                        int x1,x2,y1,y2,RestaX=0,RestaY=0;
                        do{
                        System.out.println("Digite el valor de x1 del primer vector");
                        x1=s.nextInt();
                        }while(x1<0);
        
                        do{
                        System.out.println("Digite el valor de y1 del primer vector");
                        y1=s.nextInt();
                        }while(y1<0);
        
                        do{
                        System.out.println("Digite el valor de x2 del segundo vector");
                        x2=s.nextInt();
                        }while(x2<0);
        
                        do{
                        System.out.println("Digite el valor de y2 del segundo vector");
                        y2=s.nextInt();
                        }while(y2<0);
                        RestaX=x1-x2;
                        RestaY=y1-y2;
                        System.out.println("La resta del primer vector y segundo vector es: ("+RestaX+ " , "+RestaY+")");

                     break;
                    }
                    case 3:{
                        int x1,y1,opuestoX,opuestoY;
                        do{
                        System.out.println("Digite el valor de x1 del vector");
                        x1=s.nextInt();
                        }while(x1<0);

                        do{
                        System.out.println("Digite el valor de y1 del vector");
                        y1=s.nextInt();
                        }while(y1<0);

                        opuestoX=-1*x1;
                        opuestoY=-1*y1;
                        System.out.println("El opuesto del vector "+x1+" ,"+y1+" es: ("+opuestoX+" ,"+opuestoY+")");
                     break;
                    }
                    case 4:{
                       int x1,y1,k,Multi,Multi2;
                        do{
                        System.out.println("Digite el valor del escalar");
                        k=s.nextInt();
                        }while(k<0); 

                        do{
                        System.out.println("Digite el valor de x1 del vector");
                        x1=s.nextInt();
                        }while(x1<0);

                        do{
                        System.out.println("Digite el valor de y1 del vector");
                        y1=s.nextInt();
                        }while(y1<0);
                        Multi=(k*x1);
                        Multi2=(k*y1);
                        System.out.println("El resultado del escalar :"+k+" por el vector("+x1+","+y1+") es: ("+Multi+","+Multi2+")");
                     break;
                    }
                    case 5:{
                    int x1,x2,y1,y2,multiX=0,multiY=0,Resultado;
                       
                        System.out.println("Digite el valor de x1 del primer vector");
                        x1=s.nextInt();
                       
                        System.out.println("Digite el valor de y1 del primer vector");
                        y1=s.nextInt();
                        
                        System.out.println("Digite el valor de x2 del segundo vector");
                        x2=s.nextInt();
                    
                        System.out.println("Digite el valor de y2 del segundo vector");
                        y2=s.nextInt();
                        
                        multiX=x1*x2;
                        multiY=y1*y2;
                        Resultado=multiX+(multiY);
                        System.out.println("El resultado del producto punto entre ("+x1+","+y1+") y ("+x2+","+y2+") es: "+Resultado);


                    break;
                    }
                   case 6:{
                     int x1,x2,y1,y2;
                     System.out.println("Digite el valor de x1 del primer vector");
                     x1=s.nextInt();
                       
                     System.out.println("Digite el valor de y1 del primer vector");
                     y1=s.nextInt();
                        
                     System.out.println("Digite el valor de x2 del segundo vector");
                     x2=s.nextInt();
                    
                     System.out.println("Digite el valor de y2 del segundo vector");
                     y2=s.nextInt();

                   
                    if((x1/x2==y1/y2) || (x2/x1==y2/y1)){
                      System.out.println("Son paralelos");
                    }else{
                        System.out.println("No son paralelos");
                    }

                    break;
                   }
                   case 7:{
                   int x1,x2,y1,y2,Resultado,multiX,multiY;
                     System.out.println("Digite el valor de x1 del primer vector");
                     x1=s.nextInt();
                       
                     System.out.println("Digite el valor de y1 del primer vector");
                     y1=s.nextInt();
                        
                     System.out.println("Digite el valor de x2 del segundo vector");
                     x2=s.nextInt();
                    
                     System.out.println("Digite el valor de y2 del segundo vector");
                     y2=s.nextInt();

                     multiX=x1*x2;
                     multiY=y1*y2;
                     Resultado=multiX+(multiY);
                     if(Resultado==0){
                        System.out.println("Son ortogonales");
                     }else{
                        System.out.println("No son ortogonales");
                     }

                    break; 
                   }
                   case 8:{
                    double x1,x2,y1,y2,multiX,multiY,Magnitud,producto,Resultado,operacion,operacion2;
                     System.out.println("Digite el valor de x1 del primer vector (u)");
                     x1=s.nextDouble();
                       
                     System.out.println("Digite el valor de y1 del primer vector (u)");
                     y1=s.nextDouble();
                        
                     System.out.println("Digite el valor de x2 del segundo vector (v)");
                     x2=s.nextDouble();
                    
                     System.out.println("Digite el valor de y2 del segundo vector (v)");
                     y2=s.nextDouble();

                     multiX=x1*x2;
                     multiY=y1*y2;
                     producto=multiX+(multiY);
                     Magnitud=(Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2)));
                     Resultado=producto/Math.pow(Magnitud,2);
                     operacion=Resultado*x2;
                     operacion2=Resultado*y2;
                     System.out.println("La proyeccion del vector ("+x1+","+y1+") sobre el vector ("+x2+","+y2+") es: ("+operacion+","+operacion2+")");
                      break;
                     }
                     case 9:{
                     double x1,x2,y1,y2,producto1,producto2,ProductoCruz;
                     System.out.println("Digite el valor de x1 del primer vector (u)");
                     x1=s.nextDouble();
                       
                     System.out.println("Digite el valor de y1 del primer vector (u)");
                     y1=s.nextDouble();
                        
                     System.out.println("Digite el valor de x2 del segundo vector (v)");
                     x2=s.nextDouble();
                    
                     System.out.println("Digite el valor de y2 del segundo vector (v)");
                     y2=s.nextDouble();

                     producto1=x1*y2;
                     producto2=y1*x2;
                     ProductoCruz=producto1-producto2;
                     System.out.println("El producto cruz de los vectores ("+x1+","+y1+") y ("+x2+","+y2+") es: "+ProductoCruz+"k");
                      break;
                     }
                 }
                   // 
             break;
            }
            case 2:{
               System.out.println("1-Suma de vectores 2.-Resta de vectores 3.-Opuesto de un vector 4.-Escalar por un vector 5.-Producto punto entre vectores");
               System.out.println(" 6.-Vectores Paralelos 7.-Vectores ortogonales 8.-Proyeccion 9-Producto cruz");
               do{
               System.out.println("Digite la operacion que desee");
               Operacion=s.nextInt();
               }while(Operacion<=0 || Operacion>9);

               switch(Operacion){
                  case 1:{
                     int x1,x2,y1,y2,z1,z2,SumaX=0,SumaY=0,SumaZ=0;

                        System.out.println("Digite el valor de x1 del primer vector");
                        x1=s.nextInt();
                     
                        System.out.println("Digite el valor de y1 del primer vector");
                        y1=s.nextInt();
                     
                        System.out.println("Digite el valor de z1 del primer vector");
                        z1=s.nextInt();
                        
                        System.out.println("Digite el valor de x2 del segundo vector");
                        x2=s.nextInt();
                       
                        System.out.println("Digite el valor de y2 del segundo vector");
                        y2=s.nextInt();
                     
                        System.out.println("Digite el valor de z2 del segundo vector");
                        z2=s.nextInt();   
                        SumaX=x1+x2;
                        SumaY=y1+y2;
                        SumaZ=z1+z2;
                        System.out.println("La suma del primer vector y segundo vector es: ("+SumaX+ ","+SumaY+","+SumaZ+")");
                   break;
                  }
                  case 2:{
                     int x1,x2,y1,y2,z1,z2,RestaX=0,RestaY=0,RestaZ=0;

                        System.out.println("Digite el valor de x1 del primer vector");
                        x1=s.nextInt();
                     
                        System.out.println("Digite el valor de y1 del primer vector");
                        y1=s.nextInt();
                     
                        System.out.println("Digite el valor de z1 del primer vector");
                        z1=s.nextInt();
                        
                        System.out.println("Digite el valor de x2 del segundo vector");
                        x2=s.nextInt();
                       
                        System.out.println("Digite el valor de y2 del segundo vector");
                        y2=s.nextInt();
                     
                        System.out.println("Digite el valor de z2 del segundo vector");
                        z2=s.nextInt();
                        RestaX=x1-x2;
                        RestaY=y1-y2;
                        RestaZ=z1-z2;
                        System.out.println("La resta del primer vector y segundo vector es: ("+RestaX+ ","+RestaY+","+RestaZ+")");
                   break;
                  }
                  case 3:{
                      int x1,y1,z1,opuestoX,opuestoY,opuestoZ;
                        System.out.println("Digite el valor de x1 del vector");
                        x1=s.nextInt();

                        System.out.println("Digite el valor de y1 del vector");
                        y1=s.nextInt();

                        System.out.println("Digite el valor de z1 del vector");
                        z1=s.nextInt();
                        opuestoX=-1*x1;
                        opuestoY=-1*y1;
                        opuestoZ=-1*z1;
                        System.out.println("El opuesto del vector ("+x1+","+y1+","+z1+") es: ("+opuestoX+","+opuestoY+","+opuestoZ+")");
                   break;
                  }
                  case 4:{
                        int x1,y1,z1,k,Multi,Multi2,Multi3;   
                        System.out.println("Digite el valor del escalar");
                        k=s.nextInt();
                         
                        System.out.println("Digite el valor de x1 del vector");
                        x1=s.nextInt();
                       
                        System.out.println("Digite el valor de y1 del vector");
                        y1=s.nextInt();
                        Multi=(k*x1);

                        System.out.println("Digite el valor de z1 del vector");
                        z1=s.nextInt();

                        Multi=(k*x1);
                        Multi2=(k*y1);
                        Multi3=(k*z1);
                        System.out.println("El resultado del escalar :"+k+" por el vector("+x1+","+y1+","+z1+") es: ("+Multi+","+Multi2+","+Multi3+")");
                    break;
                  }
                  case 5:{
                     int x1,x2,y1,y2,z1,z2,multiX=0,multiY=0,multiZ=0,Resultado;
                       
                        System.out.println("Digite el valor de x1 del primer vector");
                        x1=s.nextInt();
                       
                        System.out.println("Digite el valor de y1 del primer vector");
                        y1=s.nextInt();

                        System.out.println("Digite el valor de z1 del primer vector");
                        z1=s.nextInt();
                        
                        System.out.println("Digite el valor de x2 del segundo vector");
                        x2=s.nextInt();
                    
                        System.out.println("Digite el valor de y2 del segundo vector");
                        y2=s.nextInt();

                        System.out.println("Digite el valor de z2 del segundo vector");
                        z2=s.nextInt();
                        
                        multiX=x1*x2;
                        multiY=y1*y2;
                        multiZ=z1*z2;
                        Resultado=multiX+(multiY)+(multiZ);
                        System.out.println("El resultado del producto punto entre ("+x1+","+y1+","+z1+") y ("+x2+","+y2+","+z2+") es: "+Resultado);
                   break;
                  }
                  case 6:{
                     int x1,x2,y1,y2,z1,z2,productoX,productoY,productoZ;

                     System.out.println("Digite el valor de x1 del primer vector");
                     x1=s.nextInt();
                       
                     System.out.println("Digite el valor de y1 del primer vector");
                     y1=s.nextInt();

                     System.out.println("Digite el valor de z1 del primer vector");
                     z1=s.nextInt();
                        
                     System.out.println("Digite el valor de x2 del segundo vector");
                     x2=s.nextInt();
                    
                     System.out.println("Digite el valor de y2 del segundo vector");
                     y2=s.nextInt();

                     System.out.println("Digite el valor de z2 del segundo vector");
                     z2=s.nextInt();

                     productoX=y1*z2-z1*y2;
                     productoY=z1*x2-x1*z2;
                     productoZ=x1*y2-y1*x2;

                     if(productoX==0 && productoY==0 && productoZ==0){
                        System.out.println("Los vectores son paralelos");
                     }else{
                        System.out.println("Los vectores no son paralelos");
                     }
                   break;
                  }
                  case 7:{
                     int x1,x2,y1,y2,z1,z2,Resultado,multiX,multiY,multiZ;
                     System.out.println("Digite el valor de x1 del primer vector");
                     x1=s.nextInt();
                       
                     System.out.println("Digite el valor de y1 del primer vector");
                     y1=s.nextInt();

                     System.out.println("Digite el valor de z1 del primer vector");
                     z1=s.nextInt();
                        
                     System.out.println("Digite el valor de x2 del segundo vector");
                     x2=s.nextInt();
                    
                     System.out.println("Digite el valor de y2 del segundo vector");
                     y2=s.nextInt();

                     System.out.println("Digite el valor de z2 del segundo vector");
                     z2=s.nextInt();

                     multiX=x1*x2;
                     multiY=y1*y2;
                     multiZ=z1*z2;
                     Resultado=multiX+(multiY)+(multiZ);
                     if(Resultado==0){
                        System.out.println("Son ortogonales");
                     }else{
                        System.out.println("No son ortogonales");
                     }
                   break;
                  }
                  case 8:{
                     double x1,x2,y1,y2,z1,z2,multiX,multiY,multiZ,Magnitud,producto,Resultado,operacion,operacion2,operacion3;
                     System.out.println("Digite el valor de x1 del primer vector (u)");
                     x1=s.nextDouble();
                       
                     System.out.println("Digite el valor de y1 del primer vector (u)");
                     y1=s.nextDouble();

                     System.out.println("Digite el valor de z1 del primer vector (u)");
                     z1=s.nextDouble();
                        
                     System.out.println("Digite el valor de x2 del segundo vector (v)");
                     x2=s.nextDouble();
                    
                     System.out.println("Digite el valor de y2 del segundo vector (v)");
                     y2=s.nextDouble();

                     System.out.println("Digite el valor de z2 del segundo vector (u)");
                     z2=s.nextDouble();

                     multiX=x1*x2;
                     multiY=y1*y2;
                     multiZ=z1*z2;
                     producto=multiX+(multiY)+(multiZ);
                     Magnitud=(Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2)+Math.pow(z2,2)));
                     Resultado=producto/Math.pow(Magnitud,2);
                     operacion=Resultado*x2;
                     operacion2=Resultado*y2;
                     operacion3=Resultado*z2;
                     System.out.println("La proyeccion del vector ("+x1+","+y1+","+z1+") y el vector ("+x2+","+y2+","+z2+") es: ("+operacion+","+operacion2+","+operacion3+")");
                     break;
                  }
                  case 9:{
                     double x1,x2,y1,y2,z1,z2,producto1,producto2,producto3;
                     System.out.println("Digite el valor de x1 del primer vector (u)");
                     x1=s.nextDouble();
                       
                     System.out.println("Digite el valor de y1 del primer vector (u)");
                     y1=s.nextDouble();

                     System.out.println("Digite el valor de z1 del primer vector (u)");
                     z1=s.nextDouble();
                        
                     System.out.println("Digite el valor de x2 del segundo vector (v)");
                     x2=s.nextDouble();
                    
                     System.out.println("Digite el valor de y2 del segundo vector (v)");
                     y2=s.nextDouble();

                     System.out.println("Digite el valor de z2 del segundo vector (v)");
                     z2=s.nextDouble();

                     producto1=y1*z2-z1*y2;
                     producto2=z1*x2-x1*z2;
                     producto3=x1*y2-y1*x2;
                     System.out.println("El producto cruz del vector ("+x1+","+y1+","+z1+") y el vector ("+x2+","+y2+","+z2+") es: ("+producto1+","+producto2+","+producto3+")");
                     

                   break;
                  }
               }
               break;    
              }
        }
            System.out.println("¿Quiere seguir usando el programa?");
            System.out.println("Aprieta 1 para Seguir");
            System.out.println("Aprieta 2 para Salir");
            ola=s.nextInt();   
            if(ola==2){
            System.out.println("Muchas Gracias. Hasta pronto");
            }

        }//while
        s.close();
    }
}
