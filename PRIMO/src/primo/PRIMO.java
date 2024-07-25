/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primo;
/**
 *
 * @author juanx
 */
import java.util.Scanner;
public class PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        int num= teclado.nextInt();
        //primo(num);
        boolean primo2 = primo(num);
        if(primo2){
        System.out.println("true");
        }else{
            System.out.println("false");
        }    
    }
    public static boolean primo(int num){
        //double raiz = Math.sqrt(num);
    if(num<=1){
           return false; //System.out.println("falce");
}else{
        for(int i=2; i<=Math.sqrt(num);i++){
            if(num % i != 0){
                return false;
            }
        }
        return true;
    }
}
}
        
       
        

