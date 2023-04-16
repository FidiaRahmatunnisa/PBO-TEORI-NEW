/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class latihan772 {
    public static void main(String[] args){
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
     int nilai;
     for(int i=0;i<10; i++){
            try {
                System.out.print("masukan nilai :");
                nilai = Integer.parseInt(data.readLine());
            } catch (IOException ex) {
                Logger.getLogger(latihan772.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
    }
}
