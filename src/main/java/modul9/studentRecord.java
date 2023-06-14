/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul9;

/**
 *
 * @author HP
 */
public class studentRecord { // kelas
    private String name;  // variabel name tipe data string dengan hak akses private
    private String address; // sama seperti sebelumnya
    private int age;    // sama seperti diatas
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average;
    private String nilai; //  sampai disini penjelasannya sama seperti yang variabel awal
    
    private static int studentCount; // bagian ini namanya juga sama dengan yang diatas
                                     //tapi ia static seperti penjelasan bapak tentang final tadi, tapi fungsinya apa?
    
    public studentRecord() /* ini merupakan constructor , yaitu sebuah (method) yang memiliki nama yang sama dengan class nya, 
            tapi bagian ini memiliki parameter kosong */
    {
        // area penulisan kode
        studentCount++;
    }
    //public studentRecord(){ 
         //area inisialisasi kode;    
   // }
     public studentRecord(String temp){ /* ini bisa disebut overriade method/constructor alasanya: 
              1. memiliki nama yang sama dengan superclass dan ada sebuah subclass sebelumnya bernama yang sama, bedanya disini 
                 memiliki satu parameter yang bernama temp*/
         this.name = temp;   
          studentCount++;
     } 
     public studentRecord(String name, String address){ // bagian ini bernama o
         this.name = name; this.address = address; 
          studentCount++;
     } 
     public studentRecord(double mGrade, double eGrade, double sGrade){
         mathGrade = mGrade;  englishGrade = eGrade;  scienceGrade = sGrade;  
          studentCount++;
     } 
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
        
    }
    
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address = address;
        
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age = age;
        
    }
    public double getmathGrade(){
        return mathGrade;
    }
    public void setmathGrade(double mathGrade){
        this.mathGrade = mathGrade;
        
    }
    public double getenglishGrade(){
        return englishGrade;
    }
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
        
    }
    public double getscienceGrade(){
        return scienceGrade;
    }
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
        
    }
    public double getaverage(){
        average = (mathGrade + englishGrade + scienceGrade)/3 ;
        return average;
    }
    public static int getstudentCount(){
        return studentCount;
    }
    public String getnilai(){
        if(average <0 || average >100) nilai = "error!!";
        else 
        {
        if(average >80) nilai = "A";
        else if (average >65) nilai = "B";
        else if(average >55) nilai = "C";
        else if(average >40) nilai = "D";
        else if(average > 0) nilai = "E";
        else nilai = "Error!";
        }
        return nilai;
    } 
    
    public void print( String temp ){
        System.out.println("Name:" + name); 
        System.out.println("Address:" + address);  
        System.out.println("Age:" + age);  } 
 
public void print(double eGrade, double mGrade, double sGrade){
    //System.out.println("Name:" + name); 
    System.out.println("Math Grade:" + mGrade);  
    System.out.println("English Grade:" + eGrade);  
    System.out.println("Science Grade:" + sGrade);  } 
}
