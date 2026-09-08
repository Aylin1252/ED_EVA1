/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_arreglos;

/**
 *
 * @author aylin
 */
public class EVA1_6_ARREGLOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int[]datos =new int[1000000000];
      System.out.println(datos);
      for(int i=0;i<datos.length;i++){
         datos[i]=(int)(Math.random()*100);
      }
   }
   
}
