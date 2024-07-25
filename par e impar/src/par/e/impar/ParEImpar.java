/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par.e.impar;

/**
 *
 * @author juanx
 */
import java.util.Scanner;
public class ParEImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        int numeros[]= new int[10];
        System.out.println("ingresa los numeros");
        for(int i=0;i<10;i++){
        numeros[i]= teclado.nextInt();
        
        }
        int pares=0;
        int impares=0;
        for(int numero : numeros){
        if(numero%2==0){
            pares++;
        }else{
            impares++;
        }
            System.out.println("pares = " + pares);
            System.out.println("impares = "+ impares);
        }
    }
    
}
