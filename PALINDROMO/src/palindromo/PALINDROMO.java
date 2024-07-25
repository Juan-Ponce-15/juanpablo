/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

/**
 *
 * @author juanx
 */  
import java.util.Scanner;
public class PALINDROMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        String palabra, invertida = " ";
        System.out.println("ingrese la palabra: ");
        palabra= teclado.nextLine();
        if(pal(palabra)){
            System.out.println("es palindromo");
        }else{
            System.out.println("no es palindomo");
        }
    }
      /*  for(int i=palabra.length()-1; i>=0;i--){
        invertida= invertida+palabra.charAt(i);
        }
        System.out.println("la palara invertida es: "+ invertida);
    }*/
    public static boolean pal(String palabra){
    int w= 0;
    int x= palabra.length()-1;
    
    for(int i=0;i<palabra.length();i++){
        if(palabra.charAt(w) == palabra.charAt(x)){
            w++;
            x--;
            
        }else
            return false;
    }
           return true;
    } 
}    
    
    

