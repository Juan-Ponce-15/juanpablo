/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raiz;

/**
 *
 * @author juanx
 */
import java.util.Scanner;
public class RAIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner texto= new Scanner(System.in);
        double numero;
       System.out.println("ingrese un mumero");
       numero= texto.nextDouble();
       
        double raiz= Math.sqrt(numero);
        System.out.println("la raiz cuadrada de "+ numero+" es = "+ raiz);
        
        //utilice double porque hace mas exacto el resultado que float,por eso lo considere mejor opcion
       
    }
    
}
