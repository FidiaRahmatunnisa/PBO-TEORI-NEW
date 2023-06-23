/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul11;

/**
 *
 * @author HP
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import modul11.studentRecord;

class penghubung{
    
    private static int tambah;
    studentRecord[] penyim = new studentRecord[50];
    
    // data masuk
    public void dataMasuk(studentRecord data1){
        penyim[tambah] = data1;
        tambah++;
    }
    
    //data diri hapus
    public void dataHapus(int tamba){
        if(penyim[tamba] != null){
            penyim[tamba].setName("");
            penyim[tamba].setage();
            penyim[tamba].setaddress("");
        }else{
            System.out.println("Data invalid!");
        }
    }
    
    //data nilai hapus
    public void dataHapus2(int index){
        if(penyim[index] != null){
            penyim[index].setmathGrade();
            penyim[index].setscienceGrade();
            penyim[index].setenglishGrade();
        }else{
            System.out.println("Data Invalid!!");
        }
    }
    
    // data tampil
    public studentRecord[] getDataTampil(){
        studentRecord[] wada = new studentRecord[tambah];
        for(int i=0;i<tambah;i++){
            wada[tambah] = penyim[tambah];
        }
        return wada;
    }
    
    //update data
    public void dataUpdate(int tamb, studentRecord datta){
        penyim[tamb] = datta;
    }
}



public class latiahan1161 extends studentRecord {
    public static void main(String[] args) throws IOException{
        studentRecord data = new studentRecord();
        BufferedReader isi = new BufferedReader(new InputStreamReader(System.in));
        penghubung tam = new penghubung();
        
        // nama peng- switch
        int pil=0;
        //i sebagai index yang dipermainkan
        int i ;
        
        if(pil<6){
        while(pil<6){
        // daftar pengambilan nilai
        System.out.println("=== Menu Student ===");
        System.out.println("1. Input Data");
        System.out.println("2. Input Nilai Pelajaran");
        System.out.println("3. Tampilkan data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Update Data");
        System.out.println("6. Keluar");
        //input pilih
        System.out.print("masukan pilihan anda ?? ");
        pil = Integer.parseInt(isi.readLine());
        switch(pil){
            case 1 -> { 
                //input data diri
                System.out.println("masukan nama anda?? ");
                data.setName(isi.readLine());
                System.out.println("masukan umur anda?? ");
                data.setage(Integer.parseInt(isi.readLine()));
                System.out.println("masukan alamat anda?? ");
                data.setaddress(isi.readLine());
                }
            case 2 -> {
                // input nilai pelajaran
                System.out.println("masukan nilai math?? ");
                data.setmathGrade(Double.parseDouble(isi.readLine()));
                System.out.println("masukan nilai science?? ");
                data.setscienceGrade(Double.parseDouble(isi.readLine()));
                System.out.println("masukan nilai english?? ");
                data.setenglishGrade(Double.parseDouble(isi.readLine()));
                }
            case 3 -> {
                // Tampilkan semua data
                studentRecord[] pung = tam.getDataTampil();
//                if(case 1 || case 2 != null){  // ilegal statemen
                for(i=0;i<pung.length;i++){
                    if(pung[i]!=null){
                System.out.println("=== Tampilan Data anda ===");
                System.out.println("Nama : "+pung[i].getName());
                System.out.println("Umur : "+pung[i].getage());
                System.out.println("Alamat : "+pung[i].getaddress()+"\n");
                
                System.out.println("=== Tampilan Nilai anda ===");
//                System.out.println(data.print(data.setenglishGrade(),data.setmathGrade() , data.setscienceGrade()));
                System.out.println("Nilai Math : "+pung[i].getmathGrade());
                System.out.println("Nilai Science : "+pung[i].getscienceGrade());
                System.out.println("Nilai English : "+pung[i].getenglishGrade());
                System.out.println("Rata-rata : "+pung[i].getaverage());
                System.out.println("Prediket : "+pung[i].getnilai());
                
                //penghubung student record data otomatis ditambah
//                tam.getDataTampil();
                    }//else{
//                        System.out.println("");
//                    }
                }
            }
            case 4 -> {
                  System.out.println("data manakah yang ingin anda hapus??");
                  System.out.println("1. data diri");
                  System.out.println("2. data nilai");
                  System.out.print("pilihan");
                  int a = Integer.parseInt(isi.readLine());
                  switch(a){
                      case 1 ->{
                          System.out.println("data ke-berapa yang ingin anda hapus?? ");
                          i = Integer.parseInt(isi.readLine());
                          tam.dataHapus(i);
                          break;
                      }
                      case 2 ->{
                          System.out.println("data ke-berapa yang ingin anda hapus?? ");
                          i = Integer.parseInt(isi.readLine());
                          tam.dataHapus2(i);
                          break;
                      }
                      default ->{
                          System.out.println("pilihan tidak sesuai!");
                      }
                  }
                }
            case 5 ->{
                System.out.println("data ke-berapa yang ingin diupdate?? ");
                i = Integer.parseInt(isi.readLine());
                
                // update data
                System.out.println("masukan nama anda?? ");
                data.setName(isi.readLine());
                System.out.println("masukan umur anda?? ");
                data.setage(Integer.parseInt(isi.readLine()));
                System.out.println("masukan alamat anda?? ");
                data.setaddress(isi.readLine());
                
                String jwb = "";
                while("ya".equals(jwb)){
                    System.out.println("apakah anda ingin melanjutkan ke nilai??");
                    jwb = isi.readLine();
                    System.out.println("masukan nilai math?? ");
                    data.setmathGrade(Double.parseDouble(isi.readLine()));
                    System.out.println("masukan nilai science?? ");
                    data.setscienceGrade(Double.parseDouble(isi.readLine()));
                    System.out.println("masukan nilai english?? ");
                    data.setenglishGrade(Double.parseDouble(isi.readLine()));   
                }
                
                tam.dataUpdate(i, data);
            }
            default ->{
                System.out.println("pilihan tidak sesuai!! \n Proses telah selesai");
            }
                
            }
          }
        }else{
            System.out.println("Pilihan invalid!");
        }
        
    }
}
