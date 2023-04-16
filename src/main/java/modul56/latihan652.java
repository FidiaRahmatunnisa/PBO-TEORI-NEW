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

public class latihan652 {
    public static void main(String args[]) throws Exception{
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        int angka =1;
        if( angka>=1 || angka<=10){
           System.out.print("masukan angka:");
           angka = Integer.parseInt(data.readLine());
        }
        if(angka==1) System.out.println("satu");
        else if(angka==2) System.out.println("dua");
        else if(angka==3) System.out.println("tiga");
        else if(angka==4) System.out.println("empat");
        else if(angka==5) System.out.println("lima");
        else if(angka==6) System.out.println("enam");
        else if(angka==7) System.out.println("tujuh");
        else if(angka==8) System.out.println("delapan");
        else if(angka==9) System.out.println("sembilan");
        else if(angka==10) System.out.println("sepuluh");
        else System.out.println("invalid number!!");
    }    
}
