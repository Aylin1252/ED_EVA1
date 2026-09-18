/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ev1_12_primos;

import java.util.Scanner;

/**
 *
 * @author aylin
 */
public class EV1_12_PRIMOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner cap= new Scanner (System.in);
      int num;
      
      System.out .println("poner numero:");
      num=cap.nextInt();
      int primer=0;
      for(int i=1; i<= num; i++){
         if(num %i==0){
            primer++;
            
         }
      }
      System.out.println("Resultado1");
      if(primer==2){
         System.out.println(num + "Es primo");
      }else{
         System.out.println(num+ "no es primo");
            
      }
      int segundo =0;
      for(int i=2;i*i<=num;i++){
         if(num % i==0){
            segundo++;
            break;
         }
      }
      System.out.println("Resultado 2");
      if(num>1 && segundo==0){
         System.out.println(num +"es primo");
      }else{
         System.out.println(num+"no es primo");
      }
      
   }
   
}
