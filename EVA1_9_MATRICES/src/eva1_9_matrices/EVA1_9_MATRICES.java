/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_matrices;

/**
 *
 * @author aylin
 */
public class EVA1_9_MATRICES {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      int [] []matriz=new int [5] [3];
          System.out.println("matris="+matriz);
          System.out.println("matriz-length="+ matriz.length);
          System.out.println("matriz[0]="+matriz[0]);
          System.out.println("matriz[0].length="+matriz[0].length);
          System.out.println("matriz[1]="+matriz[1]);
         System.out.println("matriz[1] .length="+matriz[1].length);
          //-------
          for(int i=0; i<matriz.length;i++){
             for(int j=0;j<matriz [i].length;j++){
                matriz[i][j] = (int)(Math.random()*100);
             }
          }
          for(int i=0; i<matriz.length;i++){
             for(int j=0;j<matriz [i].length;j++){
                System.out.print("["+matriz[i][j]+"]");
              }  
             System.out.println("");
   }
    }
}
