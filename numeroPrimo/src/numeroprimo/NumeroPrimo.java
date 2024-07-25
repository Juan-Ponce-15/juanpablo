/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroprimo;

/**
 *
 * @author juanx
 */
import java.util.Scanner;
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingtrse numero");
       int num= teclado.nextInt();
        int f, ;
       for(f=1;f<(num+1);f++){
       if(num%f==0)
           c++;
           }
       if(c>2){
       
        System.out.println("true");
        }else{
            System.out.println("false");
        }
       
       
        
    }
    
    //public static boolean primo(int num){
   // boolean respuesta;
    //if(num%2==0){
      //  respuesta = true;
    //else if {
           // System.out.println("");
       // respuesta = false;{
    
       //return respuesta;
       
    
    
     
    
    
