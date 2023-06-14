/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul10;

/**
 *
 * @author HP
 */
//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import modul10.DataBukuAlamat;
import static modul10.DataBukuAlamat.tambah;


//class pertama tidak berada di package
 class PerluBukuAlamat {
     
     // kelas lain yang dibutuhkan dan dipanggil ke kelas ini, dibutuhkan template get-set yang telah dibuat disana
     // dibuat objek isi berbentuk array karena akan menampung data sebanyak 100 data yang telah di tentukan index array nya
    DataBukuAlamat[] isi = new DataBukuAlamat[100];
    // index , karena disini kita memainkan indeks, 
    public int index;
    
    //method masukan data , menggunakan method set -- seakan sia-sia buat method kalau tidak dipanggil 
      //di main method--pikirkan cara manggil method dan akses input scanner dari method--kayaknya 
      //pakai perulangan, seperti for didalamnya ada scanner, batasnya lengan method, atau impor kelas?
    
    // method input data, yang diinput hanya data jadi ini getter untuk data
    public void masuk(DataBukuAlamat datta){
        // ini merupakan objek isi dari template data kelas sebelah, berbentuk array karena data disana di set
        // dengan beragam method, 
        isi[tambah] = datta;
        //dipakai iterasi ++ untuk memberi tahukan bahwa data dapat bertambah
        tambah++;
    }
    
    // method  menghapus data -- seakan percuma membuat method kalau tidak dipanggil dibawah
    
    // method hapus data
    //jadi rencananya saat case hapus data dipilih, maka data yang telah di isi pada case input akan  direset sehingga
    // saat dilakukan pemilihan lagi, dan dipilih case tampil maka hanya data kosong yang ditampilkan
    public void hapus(int tamba){  // usahakan menggunakan nama yang berbeda-beda agar tidak rancu
//        isi[tambah]= null;
        if(isi[tamba] != null){
            isi[tamba].setNama("");
            isi[tamba].setAlamat("");
            isi[tamba].setNomor("");
            isi[tamba].setEmail("");
        }else{
            System.out.println("data tidak ditemukan");
        }
    }
    
    // method update data
    public void update(int tambah, DataBukuAlamat datta){
        isi[tambah] = datta;   
    }
    
    // method tampil data -- disini menggunakan getter dengan getTampil, 
    public DataBukuAlamat[] getTampil(){
        DataBukuAlamat[] tampung = new DataBukuAlamat[tambah];
        System.arraycopy(isi, 0, tampung, 0, tambah);
        return tampung;   // salah dalam pengembalian nilai dapat menyebabkan error pada proses tampil, walaupun output tampil dapat keluar dan tampil diconsole, tapi dibawahnya akan ada keterangan error
        // terdapat pengembalian nilai bernama tampung, 
    }
    
}


// ini kelas kedua sekaligus kelas main, dan kelas yang dinamai
class bukuAlamat{
    
    // method main
    public static void main(String[] args) throws IOException{  // trow-exception bak penangkal error-- karena kalau ada error dia akan mengeluarkan pemberitahuan error!
        
        // buat class PerluBukuAlamat untuk template tampil semua data
        // buat untuk objek penyimpanan semua data dengan template kelas sebelah 'DataBukuAlamat'
        PerluBukuAlamat buat = new PerluBukuAlamat();
        
        BufferedReader tem = new BufferedReader(new InputStreamReader(System.in));
        
        int pili = 0;
        while(pili<5){
        
        // ini lemari penyimpanan masing-masing data input
        // kelas yang isinya akan dimanipulasi disini, dengan bantuan kelas PerluDataAlamat
        DataBukuAlamat ini = new DataBukuAlamat(); 
            
        System.out.println("=== Daftar Akses Data ===");
        System.out.println("1. Memasukan data");
        System.out.println("2. Menghapus data");
        System.out.println("3. Menampilkan seluruh data");
        System.out.println("4. Update data");
        
        //Scanner input = new Scanner(System.in);   // input merupakan nama memory penyimpanan data penginputan nilai
        //System.out.print("pilihan : ");
        //int baru1 = input.nextInt();  // ini lemari penyimpan input (pilihan)yang diatasnya 
        
        // pakai buffredReader untuk memilih dari menu 
        System.out.print("pilihan anda : ");
        pili = Integer.parseInt(tem.readLine());
        
        //index 
           int i ;
        
        switch(pili){
            case 1 -> { 
                // baris ini dapat dijelaskan dengan, baris pertama output atau sekedar tampilan yang berinteraksi denngan user
                // baris kedua dimulai dari 'ini..' ini.set.. menunjukan pengambilan data set, dengan objek nya disini bernama 'ini'
                // lalu dalam kurung ada 'tem.readLine..' menunjukan kalau si 'ini' di set ke penginputan, 
                // jadi nilainya di set dari input ke seter dengan objeknya disini bernama 'ini'
                    System.out.print("masukan nama anda?  ");
                    ini.setNama(tem.readLine());
                    System.out.print("masukan alamat anda?  ");
                    ini.setAlamat(tem.readLine());
                    System.out.print("masukan nomor telepon anda?  ");
                    ini.setNomor(tem.readLine());
                    System.out.print("masukan alamat email anda?  ");
                    ini.setEmail(tem.readLine());
                    
                    // data di tampung di masuk pada kelas PerluBukuAlamat
                    // 'buat' berasal dari kelas "Perlu..' dan 'masuk' adalah getter nya, lalu objek 'ini' merupakan
                    // punya nya kelas 'DataBukuAlamat'
                    // satu kelas memanipulasi kelas lain, butuh template
                    buat.masuk(ini);
                    break;
                       }
            case 2 -> {
                    System.out.println("masukan nomor data yang akan dihapus?  ");
                    i = Integer.parseInt(tem.readLine());
                    
                    // kata kunci penghapusan nilai yang diinput sebelumnya
                    buat.hapus(i);
                    
//                    System.out.println("Nama :"); // ini output setNama
//                    ini.setNama("");
//                    System.out.println("Alamat :");  // ini output      setAlamat
//                    ini.setAlamat("");
//                    System.out.println("Nomor Telepon :");  // ini output setNomor
//                    ini.setNomor("");
//                    System.out.println("Email :");  // ini output setEmail
//                    ini.setEmail("");
//                    
                    
                    break;
                      }
            case 3 ->{
                // -- menggunakan cara dibawah menjadikan hasilnya null, kenapa hasilnya tidak ditangkap???
//                    System.out.println("Nama           : "+ini.getNama());
//                    System.out.println("Alamat         :"+ini.getAlamat());
//                    System.out.println("Nomor Teleppon :"+ini.getNomor());
//                    System.out.println("Email          :"+ini.getEmail());

                        // objek tamp dibuat untuk menampung data tampil, jadi pada tampil tidak memakai 'ini'
                        DataBukuAlamat[] tamp = buat.getTampil();  // pengolahan di kelas DataBukuAlamat sangat berpengaruh untuk ini, karena dikelas tersebut ada
                                                                    // keterkaitan tak tergambar 
                    
//                        if(tamp.length == 0){
//                              System.out.println("Data 1 Kosong!");
//                        }else{
                       for( i=0; i<tamp.length;i++)  {// length disini tidak sebua fungsi/method{
                           if(tamp[i] != null){  // struktur pemilihan ini harus dipakai, kalau tidak terjadi error
                           System.out.println("=====================================");
                           System.out.println(" Data ke-"+(i));
                           System.out.println("Nama          : "+tamp[i].getNama());
                           System.out.println("Alamat        : "+tamp[i].getAlamat());
                           System.out.println("Nomor Telepon : "+tamp[i].getNomor());
                           System.out.println("Email         : "+tamp[i].getEmail());
                           System.out.println("=====================================");
//                       }
//                           else{
//                               System.out.println("Data 2 Kosong!!");
//                           }
                       }
                        }
                    break;
                      }
            case 4 ->{
                    System.out.println("masukan data ke-berapa yang ingin diperbarui?");
                    // hal terpenting di update data itu -- adalah pemilihan data ke- berapa yang ingin di update,
                    i = Integer.parseInt(tem.readLine());   // ini buffered tentang data ke berapa yang ingin di update
                   
                    System.out.print("masukan nama anda?  ");
                    ini.setNama(tem.readLine());
                    System.out.print("masukan alamat anda?  ");
                    ini.setAlamat(tem.readLine());
                    System.out.print("masukan nomor telepon anda?  ");
                    ini.setNomor(tem.readLine());
                    System.out.print("masukan alamat email anda?  ");
                    ini.setEmail(tem.readLine());
                   
                    //pemanggilan template update data dari kelas paling atas
                    buat.update(i, ini);
                    break;
                      }
            default ->{
                System.out.println("pilihan Error!!!!!");
                }
            }
        }
    }
}
    
    

