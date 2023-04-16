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

public class latihan651 {
    public static void main(String args[])throws Exception{ 
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        int total=0;
        double rata;
       for(int i=0; i<3; i++){
           System.out.print("nilai:");
          int nilai = Integer.parseInt(data.readLine());
            total =total+nilai;
       }
       System.out.println("total:"+total);
       rata=total/3;
       System.out.println("rata-rata:"+rata);
       if(rata>=60)System.out.println(":-)");
       else System.out.println(":-(");
    }
    
}
