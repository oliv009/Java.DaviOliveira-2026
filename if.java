
package pkg2602;
import java.util.Scanner;

public class Main {

            
    public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero");
        int a = sc.nextInt();
        
        System.out.print("digite mais um numero:");
        int b = sc.nextInt();
        
        System.out.print("escolha uma operação matematica 0 = soma, 1=subtração, 2=multiplicação e 3 divisão:");
        int ope = sc.nextInt();
        
        if(ope==0){
          double result = a + b;
            System.out.println(result);
              
        }
        if(ope==1){
            double result = a-b;
            System.out.println(result);

        }
        if(ope==2){
            double result = a*b;
            System.out.println(result);
        }
        if(ope==3){
            double result = a/b;
            System.out.println(result);
                   
        }
          
        }
       
                
                    
    }
    

