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
public class latihan654c {
    public static void main(String args[]) throws IOException{
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("masukan angka:");
        int angka = Integer.parseInt(data.readLine());
        System.out.print("masukan pangkat:");
        int pangkat = Integer.parseInt(data.readLine());
        int hasil=1;
        for(int i=0; i<=pangkat; i++){
            hasil=hasil*angka;
            i++;
        }
        System.out.println("hasil:"+hasil);
    }
}
