/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_scope;

/**
 *
 * @author aylin
 */
public class EVA1_1_SCOPE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int x =100;//existe dentro del bloque del main
      for(int i=0;i<10;i++){//existe dentro del bloque for
         System.out.println("i=" +i);
         x++; //visible dentro del for
      }
      System.out.println("valor final de la i= "+i);//ya noexiste
      System.out.println("valor final de la x="+x);//todavia existe
   }
   public static void Otrafuncion(){
      System.out.println("valor de x"+x); //no existe
   }
}
