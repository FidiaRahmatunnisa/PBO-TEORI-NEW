/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author HP
 */
//import java.util.Scanner;

public class studentRecordExample {
    public static void main(String[] args){
//        Scanner baru = new Scanner(System.in);
//        String daia;
//        daia = baru.Line();
        
        studentRecord annaRecord = new studentRecord();
        annaRecord.setName("anna");
        annaRecord.setaddress("Padang");
        annaRecord.setage(23);
        annaRecord.setmathGrade(80);
        annaRecord.setenglishGrade(70);
        annaRecord.setscienceGrade(80);
        
        //tampilkan 
        System.out.println("Nama              :"+annaRecord.getName());
        System.out.println("Alamat            :"+annaRecord.getaddress());
        System.out.println("Umur              :"+annaRecord.getage());
        System.out.println("Matematika        :"+annaRecord.getmathGrade());
        System.out.println("B.inggris         :"+annaRecord.getenglishGrade());
        System.out.println("Ilmu pengetahuan  :"+annaRecord.getscienceGrade());
        System.out.println("Rata - Rata Nilai :"+annaRecord.getaverage());
        System.out.println("Prediket Nilai    :"+annaRecord.getnilai());
        
        studentRecord aliRecord = new studentRecord();
        aliRecord.setName("Ali");
        aliRecord.setaddress("Padang");
        aliRecord.setage(23);
        aliRecord.print("");
        aliRecord.print(80,70,80);
        
         studentRecord budiRecord = new studentRecord("budi", "Bukittinggi");
         budiRecord.print("");
         
        System.out.println("Jumlah siswa : "+ studentRecord.getstudentCount());
        
        
    }
}
