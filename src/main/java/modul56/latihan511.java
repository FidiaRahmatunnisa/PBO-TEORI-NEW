/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul56;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan511 {
    public static void main(String args[]) throws IOException  {
       
    BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
    String word1,word2,word3;
    
     System.out.print("word1 :");
     word1 = data.readLine();
     System.out.print("word2 :");
     word2 = data.readLine();
     System.out.print("word3 :");
     word3 = data.readLine();
       
        System.out.println(word1+" "+word2+" "+word3);
  
     }
   }      

