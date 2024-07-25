/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumade;

/**
 *
 * @author juanx
 */
import java.util.Scanner;
public class SumaDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        int[]elmo= new int[5];
        System.out.println("ingresa los numeros: ");
        
        for(int i=0; i<5;i++){
        elmo[i]= teclado.nextInt();
        }
        int elchulo= 0;
        for(int numero : elmo){
        elchulo+=numero;
        }
        System.out.println("la suma es = "+ elchulo);
        
    }
    
}
