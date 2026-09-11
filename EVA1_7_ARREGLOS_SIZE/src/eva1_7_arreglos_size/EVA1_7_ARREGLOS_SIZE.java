/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_arreglos_size;

/**
 *
 * @author aylin
 */
public class EVA1_7_ARREGLOS_SIZE {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      int []original = new int [10];
      System.out.println(original);
      for(int i =0;i<original.length;i++){
         original[i]=(int)(Math.random()*100);
      }
      for(int i=0; i<original.length;i++){
         System.out.print("["+original[i]+"]");
      }
      System.out.println("");
      //respaldo
      int[]copia=original;//copio direccion arreglo original
      original=new int[5];//aqui desconectamos el arreglo 10 y lo remplazamos
      System.out.println(original);
      //transferiri informacion
      for(int i =0; i <original.length;i++){
         original[i]=copia[i];
      }
      for(int i =0; i <original.length;i++){//imprimir arreglo modificado
         System.out.print("[" + original[i]+"]");
      }
   }
   
   
}
