/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul8;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class modul8_latihan842b {
    public static void main(String[] args){
        Scanner isi = new Scanner(System.in);
        
        System.out.print("masukan angka 1 : ");
        int angka1 = isi.nextInt();
        
        System.out.print("masukan angka 2 : ");
        int angka2 = isi.nextInt();
        
        //operasi
        int tambah = 0;
        tambah = angka1 + angka2;
        
        int kurang =0;
        kurang = angka1 - angka2;
        
        int kali = 1;
        kali = angka1 * angka2;
        
        int bagi = 1;
        bagi = angka1 / angka2;
        
        //hasil
        System.out.println("sum : "+tambah);
        System.out.println("diff : "+kurang);
        System.out.println("product : "+kali);
        System.out.println("quotient : "+bagi);
    }
}
