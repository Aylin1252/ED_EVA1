/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_objetos;

/**
 *
 * @author aylin
 */
public class EVA1_4_OBJETOS {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Prueba prueba = new Prueba();
      System.out.println(prueba);
      //Eliminar prueba:
      //Terminar el programa-->garbage collector(libera memoria automaticamente)
      //eliminar"directamente"un objeto:
      prueba =null;
   }
   
   }
class Prueba{
}
