#latihan771

public class latihan771 {

    public static void main(String[] args){
    
     String[] hari = {"senin", "selasa", "rabu", "kamis", "jum'at", "sabtu", "minggu"};   
     
     System.out.println("Hari Dalam Seminggu:");
     
        int i = 0;
        
     while(i<hari.length){
     
         System.out.println(hari[i]);
         
         i++;
         
     }
     
    }
}

Pertama-tama, array hari dibuat dengan tujuh elemen yang berisi nama-nama hari dalam
 seminggu.
Kemudian, program mencetak pesan "Hari Dalam Seminggu:" menggunakan perintah 
System.out.println().
Setelah itu, program akan melakukan perulangan menggunakan while loop sampai variabel
 i mencapai panjang array hari. Setiap kali perulangan dijalankan, program mencetak 
elemen array hari ke-i menggunakan perintah System.out.println(hari[i]). Setelah itu,
 variabel i akan ditambahkan satu.
Jadi, program ini akan mencetak daftar hari dalam seminggu menggunakan perulangan 
while dan array di Java

#latihan771b

public class latihan771b {

    public static void main(String[] args){
    
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
        
        System.out.println("Hari Dalam Seminggu:");
        
        int i = 0;
        
        do{
        
            if(i<=hari.length){
            
                System.out.println(hari[i]);
                
                i++;
                
            }
            
        }while(i<hari.length);
        
    }
    
}

 program Java ini hampir sama dengan program sebelumnya. Namun, dalam program ini
 menggunakan perulangan do-while untuk mencetak daftar hari dalam seminggu.
Pertama-tama, seperti program sebelumnya, array hari dibuat dengan tujuh elemen yang 
berisi nama-nama hari dalam seminggu.
Kemudian, program mencetak pesan "Hari Dalam Seminggu:" menggunakan perintah
 System.out.println().
Setelah itu, program menggunakan perulangan do-while untuk mencetak setiap elemen array
 hari. Selama perulangan, program mengecek apakah nilai i kurang dari atau sama dengan
 panjang array hari menggunakan if(i<=hari.length). Jika ya, maka program akan mencetak 
elemen array hari ke-i menggunakan perintah System.out.println(hari[i]). Setelah itu,
 variabel i akan ditambahkan satu.
Perulangan akan terus berlanjut selama nilai i kurang dari panjang array hari. Oleh karena
 itu, kondisi dalam while loop adalah while(i<hari.length).
Jadi, program ini akan mencetak daftar hari dalam seminggu menggunakan perulangan 
do-while dan array di Java.

#latihan771c

public class latihan771c {

    public static void main(String[] args){
    
        String[] hari = {"Senin", "selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
        
        System.out.println("Hari Dalam Seminggu:");
        
        for(int i=0; i<hari.length; i++){
        
            System.out.println(hari[i]);
            
        }
        
    }
    
}

Program ini merupakan program Java sederhana yang mencetak daftar hari dalam seminggu
 menggunakan array dan perulangan for.
Pertama-tama, array hari dibuat dengan tujuh elemen yang berisi nama-nama hari dalam 
seminggu.
Kemudian, program mencetak pesan "Hari Dalam Seminggu:" menggunakan perintah
 System.out.println().
Setelah itu, program menggunakan perulangan for untuk mencetak setiap elemen array
hari. Variabel i dideklarasikan sebagai 0 dan akan terus ditingkatkan selama nilai i
kurang dari panjang array hari. Setiap kali perulangan dijalankan, program mencetak 
elemen array hari ke-i menggunakan perintah System.out.println(hari[i]).
Jadi, program ini akan mencetak daftar hari dalam seminggu menggunakan perulangan for 
dan array di Java

#latihan772

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;

import java.util.Arrays;

import java.util.logging.Level;

import java.util.logging.Logger;


public class latihan772 {

    public static void main(String[] args){
    
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        
     int[] nilai = new int[10];
     
     int i,max,imax;
     
     max =0;
     
     imax = 0;
     
     System.out.println("== Masukan Nilai ==");
     
            try {
            
                 for(i=0;i<10; i++){
                 
                System.out.print("masukan nilai ke-"+(i+1)+" =");
                
                nilai[i] = Integer.parseInt(data.readLine());    
                
                }
                
                 //for(i=0;i<10;i++){
                 
                 //System.out.println("array yang diinputkan:"+nilai[i]);
                 
                 //}
                 
              for(i=0;i<10;i++){
              
              
              if(nilai[i]>max){
              
                      max = nilai[i];
                      
                      imax = i;
                      
                  }
                  
              }   
              
              System.out.println("== Hasil Data Nilai ==");
              
              System.out.println("array yang diinputkan:"+Arrays.toString(nilai));
              
              System.out.println("nilai terbesar adalah: "+max);
              
              System.out.println("nilai terbesar ada pada baris ke: "+(imax+1));
              
         }
         
            catch (IOException ex) {
            
                Logger.getLogger(latihan772.class.getName()).log(Level.SEVERE, null, ex);
                
     }
     
    }
    
}

Program ini merupakan program Java yang meminta pengguna untuk memasukkan 10 nilai 
integer dan kemudian mencari nilai terbesar dalam array nilai dan menampilkan posisinya.
Program dimulai dengan mengimpor java.io.BufferedReader, java.io.InputStreamReader,
java.io.IOException, java.util.Arrays, dan java.util.logging.Logger. Kemudian, program
membuat sebuah objek BufferedReader baru untuk membaca masukan dari pengguna dan sebuah 
array integer nilai dengan 10 elemen.
Selanjutnya, program meminta pengguna untuk memasukkan 10 nilai integer dan menyimpannya
dalam array nilai menggunakan perulangan for dan metode readLine() dari objek BufferedReader.
Setelah semua nilai dimasukkan, program mencari nilai terbesar dalam array nilai
menggunakan perulangan for dan menyimpan posisinya dalam variabel imax. Kemudian,
program mencetak pesan "Hasil Data Nilai" beserta isi array nilai, nilai terbesar, 
dan posisi nilai terbesar dalam array.Akhirnya, program menangani pengecualian yang 
mungkin terjadi saat membaca masukan pengguna menggunakan try-catch block.
Jadi, program ini akan meminta pengguna untuk memasukkan 10 nilai integer, mencari nilai
 terbesar, dan menampilkan posisi nilai terbesar dalam array di Java. Output dari 
program ini akan tergantung pada nilai yang dimasukkan oleh pengguna.

#latihan772b

import java.util.Arrays;

import javax.swing.JOptionPane;

public class latihan772b {

   public static void main(String[] args){
   
       int[] nilai = new int[10];
       
       int i,max,imax;
       
       max = 0;
       
       imax = 0;
       
       for(i=0;i<10;i++){
       
           nilai[i] = Integer.parseInt(JOptionPane.showInputDialog("nilai ke-"+(i+1)));
           
       }
       
       for(i=0;i<10;i++){
       
          if(nilai[i]>max){
         
              max = nilai[i];
              
              imax = i;
              
          }
          
       }
       
   JOptionPane.showMessageDialog(null,"\n nilai yang didapatkan "+Arrays.toString(nilai)+
   
           "\n nilai terbesar :"+max+"\n nilai terbesar terdapat pada baris ke-"+(i));
           
   }
   
}

Program ini juga adalah program Java yang meminta pengguna untuk memasukkan 10 
integer, mencari nilai terbesar dalam array nilai, dan menampilkan posisi nilai terbesar
dalam array menggunakan JOptionPane dari Java Swing.
Program dimulai dengan mendeklarasikan array nilai dengan 10 elemen dan variabel max dan
imax. Kemudian, program menggunakan perulangan for untuk meminta pengguna memasukkan 10
nilai integer dan menyimpannya dalam array nilai.
Setelah semua nilai dimasukkan, program menggunakan perulangan for kedua untuk mencari 
nilai terbesar dalam array nilai dan menyimpan posisinya dalam variabel imax.
Akhirnya, program menampilkan output dengan menggunakan JOptionPane.showMessageDialog() 
yang berisi nilai yang dimasukkan oleh pengguna dalam bentuk array, nilai terbesar, dan
posisi nilai terbesar dalam array.
Jadi, program ini mirip dengan program sebelumnya, tetapi menggunakan JOptionPane sebagai
metode input/output. Output dari program ini juga tergantung pada nilai yang dimasukkan 
oleh pengguna.

#latihan773

public class latihan773 {

    public static void main(String[] args){
    
        String[][] entry =  {{"Florence", "735-1234", "Manila"},         
        
                            {"Joyce", "983-3333", "Quezon City"},
                            
                            {"Becca", "456-3322", "Manila"}}; 
                            
        //int i,j;
        
        //for(i=0;i<entry.length;i++){
        
          //  for(j=0;j<entry.length;j++){
          
            //    System.out.println("Name : "+entry[i][j]);
            
            //}
            
        //}
        
        System.out.println("Name : "+entry[0][0]);
        
        System.out.println("Tel : "+entry[0][1]);
        
        System.out.println("Address : "+entry[0][2]);
        
        System.out.println("\n");
        
        System.out.println("Name : "+entry[1][0]);
        
        System.out.println("Tel : "+entry[1][1]);
        
        System.out.println("Address : "+entry[1][2]);
        
        System.out.println("\n");
        
        System.out.println("Name : "+entry[2][0]);
        
        System.out.println("Tel : "+entry[2][1]);
        
        System.out.println("Address : "+entry[2][2]);
        
    }
    
}

Program ini menggunakan array 2 dimensi untuk menyimpan data beberapa entri yang 
berisi informasi nama, nomor telepon, dan alamat. Data tersebut kemudian ditampilkan pada
layar menggunakan statement System.out.println().
Pada baris pertama, array 2 dimensi entry dideklarasikan dan diinisialisasi dengan 
data entri yang memiliki 3 kolom: nama, nomor telepon, dan alamat.
Kemudian pada baris ke-9 sampai ke-11, data entri pertama diakses dengan menggunakan
indeks 0 untuk baris dan indeks 0, 1, dan 2 untuk kolom nama, nomor telepon, dan alamat
secara berurutan. Data tersebut kemudian ditampilkan pada layar menggunakan 
System.out.println().
Hal yang sama dilakukan pada baris ke-13 sampai ke-15 dan baris ke-17 sampai ke-19 
untuk mengakses dan menampilkan data pada entri kedua dan ketiga.
