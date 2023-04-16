/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul56;

/**
 *
 * @author ASUS
 */ 
import javax.swing.JOptionPane;

public class ioJoptione {
   public static void main(String args[]){
       String name = "";
       name = JOptionPane.showInputDialog("enter your name:");
       String msg = "hello "+ name+ "!";
       JOptionPane.showMessageDialog(null, msg);
   }    
}
