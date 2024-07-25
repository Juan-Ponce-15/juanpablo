/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayor.y.menor;

/**
 *
 * @author juanx
 */
import java.util.Scanner;
public class MayorYMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner limon= new Scanner(System.in);
        int[]chi= new int[8];
        
        System.out.println("ingresa los numeros: ");
       
        for(int i= 0; i<8;i++){
            System.out.println("numero" + (i+1)+": ");
        chi[i]= limon.nextInt();
        }
        int max = chi[0];
                int min = chi[0];
         for(int numero : chi){
         if(numero>max){
         max=numero;
         }
         if(numero<min){
         min= numero;
         }
             System.out.println("el numero mayor es = " + max);
             System.out.println("el numero menor es = "+ min);
         
         }
                
                
    }
    
}
