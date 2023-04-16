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

public class latihan652b {
    public static void main(String args[]) throws IOException{
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        int angka;
          System.out.print("angka:");
          angka = Integer.parseInt(data.readLine());
        switch(angka){
            case 1 : System.out.println("satu");
                 break;
            case 2 : System.out.println("dua");
                 break;
            case 3 : System.out.println("tiga");
                 break;
            case 4 : System.out.println("empat");
                 break;
            case 5 : System.out.println("lima");
                 break;
            case 6 : System.out.println("enam");
                 break;
            case 7 : System.out.println("tujuh");
                 break;
            case 8 : System.out.println("delapan");
                 break;
            case 9 : System.out.println("sembilan");
                 break;
            case 10 : System.out.println("sepuluh");
                 break;
            default : System.out.println("invalid number!!");
        }
    }
}
