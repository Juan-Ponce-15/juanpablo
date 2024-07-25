/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayusculas;

/**
 *
 * @author juanx
 */
import java.util.Scanner;
public class MAYUSCULAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        String texto;
        do{
        System.out.println("ingresa el texto: ");
        texto = teclado.nextLine();
        //texto= texto.toUpperCase();
        System.out.println(texto.toUpperCase());
        }while(!texto.equals(" "));
    }
    
}
