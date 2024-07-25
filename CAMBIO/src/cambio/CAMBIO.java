/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambio;

/**
 *
 * @author juanx
 */
import java.util.Scanner;
public class CAMBIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new  Scanner(System.in);
System.out.println("Ingresa el texto");
String palabras =teclado.nextLine();
palabras= palabras.replace('a', '$');
        System.out.println(palabras);
       // System.out.println("la palabra es "+ palabra);
//System.out.println("Remplazar: "+ palabra./*replace(char oldChar:'n',char newChar:'e'));*/replace(oldChar:'n',newChar:'u'));
//System.out.println("Remplazar: "+ palabra.replace(a, d); no funionaron *posible error mio, me ayudo un video de you tube:)
    }
    
}
