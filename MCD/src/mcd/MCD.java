/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mcd;

/**
 *
 * @author juanx
 */
import java.util.Scanner;
public class MCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner teclado= new Scanner(System.in);
        System.out.println("ingrese el numero 1 o mayor: ");
        int num1= teclado.nextInt();
        System.out.println("ingerece el numero 2 o menor: ");
        int num2 = teclado.nextInt();
        int pop= MCD(num1, num2);
        System.out.println("el resultado es = "+ pop);
    }
    public static int MCD(int num1, int num2){
    int pan= Math.max(num1, num2);
    int uva= Math.min(num1, num2);
    
    int resultado=0;
    do{
    resultado = uva;
    uva= pan % uva;
    pan= resultado;
    
    
    }while(uva!=0);
    return resultado;
    }
}
