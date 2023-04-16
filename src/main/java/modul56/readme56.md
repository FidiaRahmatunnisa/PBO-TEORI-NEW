pada modul 5 terdapat paket java input berupa buffered dan JOptionPane,

Fungsi paket Buffered pada Java adalah untuk meningkatkan efisiensi operasi 
masukan/keluaran pada program dengan menyimpan data sementara (buffer) di dalam memori.
Paket Buffered menyediakan kelas-kelas seperti BufferedReader dan BufferedWriter, 
yang masing-masing membungkus kelas Reader dan Writer bawaan Java. Dengan menggunakan 
kelas-kelas ini, kita dapat membaca atau menulis data secara buffered, artinya data akan 
disimpan terlebih dahulu di dalam buffer sebelum dikirim ke perangkat masukan atau keluaran.
Keuntungan penggunaan Buffered adalah meningkatkan performa program, karena operasi 
masukan/keluaran menjadi lebih cepat karena data yang diolah berada di dalam memori yang 
lebih cepat dibaca atau ditulis daripada perangkat masukan/keluaran seperti hard disk atau 
jaringan.
Sebagai contoh, jika kita ingin membaca sebuah file teks, menggunakan BufferedReader 
dapat membuat operasi membaca lebih efisien. BufferedReader membaca beberapa karakter 
pada suatu waktu, memasukkannya ke dalam buffer, dan kemudian memberikan karakter tersebut 
dalam bentuk buffer. Ini mengurangi jumlah operasi I/O yang diperlukan untuk membaca file 
dan meningkatkan kinerja program secara keseluruhan.

Paket InputStreamReader pada Java adalah bagian dari paket java.io dan digunakan untuk 
membaca karakter dari input stream yang diberikan. InputStreamReader menerima input stream 
dan mengonversi byte yang diterima dari input stream menjadi karakter yang dapat dibaca 
oleh aplikasi Java.
InputStreamReader memiliki beberapa konstruktor yang memungkinkan penggunaannya dengan 
berbagai sumber input, seperti file atau koneksi jaringan. Beberapa konstruktor 
InputStreamReader antara lain:
InputStreamReader(InputStream in): Menerima objek InputStream dan mengubahnya menjadi objek 
InputStreamReader.
InputStreamReader(InputStream in, Charset cs): Menerima objek InputStream dan Charset, 
dan mengubahnya menjadi objek InputStreamReader. Charset digunakan untuk menentukan 
karakter encoding untuk input stream yang diberikan.
InputStreamReader(InputStream in, String charsetName): Menerima objek InputStream dan 
nama karakter encoding sebagai String, dan mengubahnya menjadi objek InputStreamReader.
Setelah InputStreamReader dibuat, karakter dapat dibaca dari input stream dengan menggunakan 
metode read(). Misalnya, untuk membaca karakter dari sebuah file, kita bisa membuat sebuah 
objek FileInputStream, kemudian memasukkan objek tersebut ke dalam konstruktor 
InputStreamReader dan membaca karakter dengan menggunakan metode read().

Paket IOException pada Java adalah bagian dari paket java.io dan digunakan untuk 
menangani kesalahan atau exception yang terkait dengan input/output dalam program Java. 
IOException merupakan turunan dari kelas Exception dan merupakan jenis exception yang 
paling umum ditemukan dalam pengembangan aplikasi Java.
IOException terjadi ketika terdapat masalah dalam input/output pada program Java, 
misalnya ketika membaca atau menulis ke file, koneksi jaringan, atau mengakses perangkat 
eksternal. IOException biasanya dikategorikan sebagai checked exception, yang berarti 
exception ini harus ditangani atau dilempar oleh program.
Beberapa jenis exception yang termasuk dalam kategori IOException antara lain:
FileNotFoundException: Terjadi ketika mencoba membuka file yang tidak ditemukan.
EOFException: Terjadi ketika mencoba membaca di luar batas akhir file.
SocketException: Terjadi ketika terdapat kesalahan dalam koneksi jaringan.
SocketTimeoutException: Terjadi ketika waktu tunggu untuk koneksi jaringan telah habis.
UnknownHostException: Terjadi ketika mencoba menghubungi host yang tidak dikenal.
Untuk menangani IOException dalam program Java, biasanya digunakan blok try-catch. 
Dalam blok try, kode yang memicu IOException ditempatkan, sedangkan dalam blok catch, 
kode yang menangani exception ditempatkan.

Kemudian beralih pada Paket JOptionPane pada Java merupakan bagian dari paket javax.swing 
yang digunakan untuk menampilkan dialog box dalam program Java. JOptionPane menyediakan 
beberapa dialog box bawaan seperti pesan informasi, peringatan, kesalahan, dan konfirmasi, 
yang dapat digunakan untuk berkomunikasi dengan pengguna atau memberikan feedback terhadap 
tindakan pengguna.
Berikut adalah beberapa fungsi utama dari paket JOptionPane pada Java:
Menampilkan dialog box: JOptionPane menyediakan berbagai jenis dialog box seperti 
showMessageDialog(), showInputDialog(), showConfirmDialog() dan showOptionDialog() 
untuk menampilkan pesan atau meminta input dari pengguna.
Menampilkan pesan: Dengan JOptionPane, kita dapat menampilkan pesan informasi, 
peringatan atau kesalahan dalam dialog box. Misalnya, JOptionPane.showMessageDialog() 
dapat digunakan untuk menampilkan pesan informasi ke pengguna.
Menampilkan input box: JOptionPane juga menyediakan dialog box untuk meminta input dari 
pengguna. Misalnya, showInputDialog() digunakan untuk meminta pengguna memasukkan nilai 
atau data.
Meminta konfirmasi: Dengan showConfirmDialog(), JOptionPane memungkinkan kita meminta 
pengguna mengkonfirmasi tindakan tertentu seperti menghapus data.
Menentukan opsi: showOptionDialog() memungkinkan kita menampilkan dialog box dengan 
beberapa opsi dan meminta pengguna memilih satu opsi.
Paket JOptionPane sangat berguna dalam pengembangan aplikasi desktop karena memberikan 
cara mudah dan cepat untuk menampilkan dialog box ke pengguna. Dialog box yang disediakan 
oleh JOptionPane dapat dengan mudah dikustomisasi dan dikombinasikan dengan komponen Swing 
lainnya untuk membuat tampilan aplikasi yang lebih menarik.

For pada Java adalah salah satu jenis struktur perulangan atau looping yang digunakan 
untuk melakukan iterasi sebanyak n kali, dengan nilai awal, nilai akhir, dan increment 
(kenaikan nilai) yang telah ditentukan sebelumnya. For biasanya digunakan ketika kita 
mengetahui berapa kali iterasi harus dilakukan sebelumnya.
Di dalam for loop, terdapat tiga bagian yang harus diisi:
Inisialisasi: bagian ini digunakan untuk melakukan inisialisasi variabel yang akan 
digunakan sebagai penghitung loop. Inisialisasi ini hanya dilakukan satu kali pada awal 
iterasi. Contohnya: int i = 0;
Kondisi: bagian ini berisi kondisi yang harus dipenuhi agar iterasi dapat dilakukan. 
Jika kondisi ini tidak terpenuhi, maka program akan keluar dari loop. Contohnya: i < 10;
Perubahan: bagian ini berisi instruksi yang akan dilakukan setiap kali iterasi selesai. 
Instruksi ini berfungsi untuk mengubah nilai variabel penghitung loop agar iterasi 
selanjutnya dapat dilakukan. Contohnya: i++;
While dan Do-While pada Java adalah struktur perulangan atau looping yang digunakan untuk 
melakukan iterasi sebanyak n kali, dengan syarat atau kondisi tertentu yang harus dipenuhi. 
Perbedaan utama antara while dan do-while adalah while akan mengecek kondisi pada awal 
iterasi, sedangkan do-while akan mengecek kondisi pada akhir iterasi.
Di dalam while loop, kode yang akan diulang akan terus diulang selama kondisi terpenuhi. 
Jika kondisi tidak terpenuhi pada awal iterasi, maka program tidak akan memasuki while loop.
Di dalam do-while loop, kode yang akan diulang akan dieksekusi terlebih dahulu, 
kemudian kondisi akan diperiksa setelah itu. Jika kondisi terpenuhi, maka program akan 
masuk ke dalam do-while loop lagi, dan begitu seterusnya. Jika kondisi tidak terpenuhi 
pada akhir iterasi, maka program akan keluar dari do-while loop.

#ioJoptione.java
import javax.swing.JOptionPane;

public class ioJoptione {
   public static void main(String args[]){
       String name = "";
       name = JOptionPane.showInputDialog("enter your name:");
       String msg = "hello "+ name+ "!";
       JOptionPane.showMessageDialog(null, msg);
   }    
}


Program di atas merupakan sebuah contoh penggunaan kelas JOptionPane pada bahasa 
pemrograman Java untuk melakukan input dan output melalui dialog box. 
Berikut penjelasannya:
Pada baris pertama, terdapat sebuah perintah "import" yang meng-import kelas JOptionPane 
yang ada pada package "javax.swing" ke dalam program.
Pada baris kedua, terdapat sebuah deklarasi class "ioJoptione" yang merupakan class utama 
dari program.
Pada baris ketiga, terdapat sebuah method "main" yang akan dieksekusi ketika program 
dijalankan.
Variabel "name" dideklarasikan dengan nilai awal string kosong.
Pada baris kelima, terdapat sebuah perintah "JOptionPane.showInputDialog()" yang akan 
menampilkan dialog box dan meminta user untuk memasukkan input. Dialog box tersebut akan 
menampilkan pesan "enter your name:". Setelah user memasukkan input, nilai input tersebut 
akan disimpan ke dalam variabel "name".
Pada baris keenam, variabel "msg" dideklarasikan dengan nilai string "hello " ditambah 
dengan nilai dari variabel "name" ditambah dengan string "!".
Pada baris ketujuh, terdapat sebuah perintah "JOptionPane.showMessageDialog()" yang akan 
menampilkan dialog box dengan pesan yang sesuai dengan nilai dari variabel "msg". 
Pesan tersebut akan berupa "hello " ditambah dengan nilai dari variabel "name" ditambah 
dengan string "!".
Perintah "JOptionPane.showMessageDialog()" tersebut memiliki dua parameter, yaitu null 
(yang menunjukkan bahwa dialog box akan muncul di tengah layar) dan variabel "msg" yang 
berisi pesan yang akan ditampilkan pada dialog box.
Ketika program dijalankan, akan muncul sebuah dialog box yang meminta user untuk 
memasukkan nama. Setelah user memasukkan nama, program akan menampilkan pesan "hello " 
ditambah dengan nama yang dimasukkan user ditambah dengan string "!" pada dialog box.
Jadi, program tersebut bertujuan untuk meminta user untuk memasukkan input melalui 
dialog box, kemudian menampilkan pesan pada dialog box yang mengucapkan salam kepada user 
dengan nama yang dimasukkan.

#iobuffered.java
import java.io.BufferedReader;
import java.io.InputStreamReader;    
import java.io.IOException;

public class iobufered {
    public static void main(String args[]){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
        String name ="";
        System.out.print("enter your name :");
        try{
            name = dataIn.readLine();
        }
        catch(IOException e){
        System.out.println("error!");
    }
        System.out.println("hello"+name+"!");
    }
}
Program di atas merupakan contoh penggunaan kelas BufferedReader pada bahasa pemrograman 
Java untuk melakukan input melalui command line. Berikut penjelasannya:

Pada baris pertama, terdapat sebuah perintah "import" yang meng-import beberapa kelas 
yang diperlukan untuk program ini dari package "java.io" ke dalam program.
Pada baris kedua, terdapat sebuah deklarasi class "iobufered" yang merupakan class utama 
dari program.
Pada baris ketiga, terdapat sebuah method "main" yang akan dieksekusi ketika program 
dijalankan.
Variabel "dataIn" dideklarasikan sebagai sebuah objek BufferedReader dengan nilai awal 
yang diperoleh dari hasil instansiasi kelas InputStreamReader yang akan membaca input 
dari System.in (yaitu input melalui command line).
Variabel "name" dideklarasikan dengan nilai awal string kosong.
Pada baris keempat, terdapat sebuah perintah "System.out.print()" yang akan menampilkan 
pesan "enter your name :" pada command line.
Pada baris keenam, terdapat sebuah blok try-catch untuk menangani kemungkinan terjadinya 
kesalahan input/output. Perintah "dataIn.readLine()" akan membaca input yang dimasukkan 
oleh user dari command line dan menyimpannya ke dalam variabel "name".
Jika terjadi kesalahan pada saat membaca input, program akan menampilkan pesan "error!" 
pada command line.
Pada baris kedelapan, terdapat sebuah perintah "System.out.println()" yang akan menampilkan 
pesan "hello" ditambah dengan nilai dari variabel "name" ditambah dengan string "!" pada 
command line.
Ketika program dijalankan, program akan menampilkan pesan "enter your name :" pada command 
line dan menunggu user untuk memasukkan nama. Setelah user memasukkan nama, program akan 
menampilkan pesan "hello" ditambah dengan nama yang dimasukkan user ditambah dengan 
string "!" pada command line.
Jadi, program tersebut bertujuan untuk meminta user untuk memasukkan input melalui 
command line, kemudian menampilkan pesan pada command line yang mengucapkan salam 
kepada user dengan nama yang dimasukkan

#latihan511.java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan511 {
    public static void main(String args[]) throws IOException  {
       
    BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
    String word1,word2,word3;
    
     System.out.print("word1 :");
     word1 = data.readLine();
     System.out.print("word2 :");
     word2 = data.readLine();
     System.out.print("word3 :");
     word3 = data.readLine();
       
        System.out.println(word1+" "+word2+" "+word3);
  
     }
   }      
pada latihan ini menggunakan buffered untuk proses inputnya, juga ada ioException untuk
menangani kemungkinan kesalahan terjadi, dengan tujuan keluarannya adalah menanyakan sebuah
kata sebanyak 3 kali lalu diisi, setelah itu baru menampilkan outputnya berupa kata yang 
diisi dari input tersebut

#latihan512
import javax.swing.JOptionPane;
public class latihan512 {
    public static void main(String args[]){
         String word1,word2,word3;
         word1 = JOptionPane.showInputDialog("word1");
         String msg = word1;
                JOptionPane.showMessageDialog(null, msg);
         word2 = JOptionPane.showInputDialog("word2");
         String msg2 = word2;
                JOptionPane.showMessageDialog(null,msg2);
         word3 = JOptionPane.showInputDialog("word3");
         String msg3 = word3;
                JOptionPane.showMessageDialog(null, msg3);

    }
   pada program ini kita menggunakan jOptionePane untuk inputnya, nanti keluarannya berupa 
kotak message yang harus diisi, sama seperti sebelumnya. keluaran yang diharapkan adalah 
kotak pesan yang meminta input sebanyak 3 kali dan kotak tersebut dapat diisi, lalu setelah 
selesai dengan input 3 buah kata , maka akan ditampilkan hasilnya di kotak pesan lainnya

#latihan651
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class latihan651 {
    public static void main(String args[])throws Exception{ 
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        int total=0;
        double rata;
       for(int i=0; i<3; i++){
           System.out.print("nilai:");
          int nilai = Integer.parseInt(data.readLine());
            total =total+nilai;
       }
       System.out.println("total:"+total);
       rata=total/3;
       System.out.println("rata-rata:"+rata);
       if(rata>=60)System.out.println(":-)");
       else System.out.println(":-(");
    }
    
}
pada program ini selain menggunakan buffered sebagai input nilai, program ini dimaksudkan 
untuk meminta 3 buah nilai berupa integer lalu dijumlahkan dan dicari rata-ratanya oleh
karenanya dibutuhkan perulangan disini untuk mengefisienkan pekerjaan, lalu sebelum data 
ditampilkan , akan dilakukan dulu pemilihan jika rata-rata dari data mencapai nilai 60 atau 
lebih , maka akan diberi emosi senyum, sebaliknya jika nilai rendah dari 60 makan akan
diberi emosi murung

#latihan651b
import javax.swing.JOptionPane;

public class latihan651b {
    public static void main(String args[]){
        int total=0;
        double rata;
        for(int i=0; i<3; i++){
            int nilai = Integer.parseInt(JOptionPane.showInputDialog("nilai:"));
            total+=nilai;
        }
        rata = total/3;
        if(rata>=60)
        JOptionPane.showMessageDialog(null,"\ntotal:"+total+
                "\nrata-rata:"+rata+"\n:-)");
        else
            JOptionPane.showMessageDialog(null,"\ntotal:"+total+
                    "\nrata-rata:"+rata+"\n:-(");
    }
    
    
}
pada program ini untuk input kita menggunakan jOptione , sehingga yang tampil nantinya
akan berupa kotak pesan untuk input dan kotak pesan untuk output. sama seperti latihan 
sebelumnya yaitu latihan651 , operasi yang dilakukan disini sama seperti sebelumnya, hal 
yang membedakan hanya pada bagian input nilai

#latihan652
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
pada program ini menggunakan buffered sebagai input , untuk menanyakan angka antara 1-10, 
kemudian akan mencetak angka tersebut dalam bentuk tulisan huruf, disini terdapat struktur
pemilihan if-else yang mana jika nilai yang diinputkan tersebut berada pada pemilihan 
tersebut maka program selesai dan outputnya dicetak, jika belum maka program akan terus 
dieksekusi hingga pernyataan yag dinginkan didapat ditemukan, atau bahkan jika tidak ditemukan
maka akan dicetak invlaid number sebagai bentyk pengecualian, hal ini juga bergantung pada input
yang diberikan jika sesuai maka dengan rentang batasan diberikan makan hasil yang sesuai akan
dicetak

#latihan652b
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
program ini memiliki tujuan yang sama dengan program latihan652, dimana menginginkan output
angka dalam bentuk huruf dari pelafalan katanya,masih menggunakan buffered sebagai input,
yang membedakan disini struktur pemilihannya berupa switch-case, dimana pemilihan seperti ini 
lebih efisien dari if-else, setiap barisnya terdapat case sesuai pemilihan yang berlangsung
lalu memasukan pernyataan untuk pilihan tersebut, dan diakhiri dengan break , agar program 
berhenti saat kita telah mendapatkan pernyataan yang diinginkan, juga terdapat default sebagai
bentuk jawaban pengecualian , jika pada if-else , fungsinya dapat dikatakan sama dengan else
terakhir yang berupa pengecualian juga.

#latihan653
public class latihan653 {
    public static void main(String args[]){
        int ulang=0;
        while(ulang<100){
            System.out.println("Fidia Rahmatunnisa!!");
            ulang++;
        }
        System.out.println("banyak pengulangan :"+ulang);
    }
}
program diatas merupakan perulangan dengan menggunakan while-do, dimana nilai akan
diuji diawal barulah dijalankan perintah, jika nilai yang terdapat masih dalam kawasan yang
diinginkan maka program akan dieksekusi, lalu kembali keatas untuk bertanya lagi, jika masih dalam
rentang batasan maka program akan terus berulang, dan berhenti jika nilai sudah tidak sama 
lagi dengan pernyataan yang diatur diawal, disini program dibatasi dengan 100 pengulangan, dengan nilai
awal diset 0, jika nilai yang diulangi masih berada dibawah batasanya yaitu 100 maka 
tulisan Fidia Rahmatunnisa akan dieksekusi terus

#latihan653b
public class latihan653b {
    public static void main(String args[]){
     int ulang=0;
     do{
         System.out.println("Fidia Rahmatunnisa");
         ulang++;
     }while(ulang<100);
     System.out.println("total="+ulang);   
    }
}
program ini memiliki tujuan yang sama dengan program sebelumnya, yang membedakan hanya struktur
perulangan yang dipakai, dimana disini yang dipakai yaitu do-while, dimana perintah dilakukan
dahulu barulah ditanyakan apakah sesuai dengan batasan yang diinginkan, jika tidak program akan
berhenti, jika ya program akan terus berjalan, poin utama yang membedakan program ini dengan
program sebelumnya, pada program ini perintah akan tetap dieksekusi setidaknya satu kali
karena pemeriksaan dilakukan diakhir

#latihan653c
public class latihan653c {
    public static void main(String args[]){
        
        for(int i=0; i<100; i++){
          System.out.println("Fidia Rahmatunnisa!");
        }
    }
    
}
sama seperti 2 perulangan sebelumnya , program ini juga melakukan perulangan sebanyak n-1 
dari yang ditentukan, penggunaan for kurang efisien karena perulangan ini harus mengetahui dulu
batasanya, maka program dapat ditentukan. 

#latihan654
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan654 {
    public static void main(String args[]) throws IOException{
     BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
     System.out.print("masukan angka:");
     int angka = Integer.parseInt(data.readLine());
     System.out.print("masukan pangkat:");
     int pangkat = Integer.parseInt(data.readLine());
     int hasil=1,i=1;
     while(i<=pangkat){
         hasil=hasil*angka;
         i++;
     }
     System.out.println("hasil:"+hasil);
    }
}
program ini bertujuan untuk mencari pangkat dari sebuah angka, untuk pangkat merupakan
perkalian yang dilakukan berulang-ulang , makanya perulangan digunakan disini, disini
terdapat 2 input yaitu untuk angka dan untuk pangkat, untuk pangkat jika angka yang diulang masih
dibawah pangkat yang diinputkan maka angka akan dikalikan sesamanya, kemudian kembali keatas
untuk melakukan pengulangan, jika nilai masih dibawah pangkat yang  diinputkan maka
perkalian sesamanya akan dilakukan , dan berhenti apabila logika untuk pangkat sudah tidak
sesuai lagi.

#latihan654b
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class latihan654b {
    public static void main(String args[]) throws IOException{
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("masukan angka:");
     import   int angka = Integer.parseInt(data.readLine());
        System.out.print("masukan pangkat:");
        int pangkat = Integer.parseInt(data.readLine());
        int hasil=1,i=1;
        do{
            if(i<=pangkat)
                hasil=hasil*angka;
            i++;
        }while(i<=pangkat);
        System.out.println("hasil:"+hasil);
    }
    
}
dengan permintaan yang sama, dibuat program pangkat dengan perulangan do-while
karen do-while, setidaknya melakukan eksekusi setidaknya satu kali maka, diberi struktur 
pemilihan if agar hasil lebih efisien, contohnya pangkat yang diinputkan bernilai negatif
sedangkan deklarasi nilai awal iterasinya adalah 1, maka program tidak akan dieksekusi dan 
mendapat hasil invalid

#latihan654c
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
pada program ini kita memakai perulangan for, dengan perintah program yang sama seperti
sebelumnya , dengan hal yang membedakan terdapat pada strutur perulangan yang dipakai saja