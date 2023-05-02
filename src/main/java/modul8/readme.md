penjelasan tentang latihan modul 8


public class modul8_latihan841 {
    public static void main(String[] args){
        for(int i=0;i<4;i++){
            System.out.println(" "+args[i]);
        }
        System.out.println("number of argument : "+args.length);
    }
}

Dari latihan 841 yang diambil dari modul 8,

dapat dilihat bahwa disini kita menggunakan argumen sebagai input serta output nilai,
dimana tampil sentuhnya inputnya tidak hanya compiler bawaan dari aplikasi yang kita gunakan 
saat ini yaitu netbeans. kita juga bisa menggunakan command prompt bawaan microsoft untuk 
melakukan input serta keluaran data


public class modul8_latihan841 {

seperti biasa baris pertama(baris diatas) merupakan deklarasi kelas yang dipakai untuk program ini,
dimana kita menggunakan kelas modul8_latihan841

public static void main(String[] args){

selanjutnya baris ini merupakan method yang dipakai, berupa pemberian nilai static,
tanpa pengembalian nilai(ditandai tipe void) lalu main method nya dengan parameter utama
yaitu string array untuk argumen. nah bagian inilah yang akan berperan nantinya untuk deklarasi lokasi,
pemberian nilai input dan outputnya.

for(int i=0;i<4;i++){
            System.out.println(" "+args[i]);
        }

kemudian disini kita menggunakan perulangan for dengan indeksnya dimulai dari 0 hingga 4, 
sehingga memiliki rentang nilai 5 untuk pengulangan. dengan melakukan pencetakan argumen, untuk 
setiap argumen yang diinputkan, kebetulan disini kita akan mengulangnya sebanyak 5 kali sesuai dengan 
perulangan yang dipakai

System.out.println("number of argument : "+args.length);

bagian ini merupakan tampilan output berupa ukuran argumen yang diulang


public class modul8_latihan842 {
    public static void main(String[] args){
        int angka1 = Integer.parseInt(args[0]);
        int angka2 = Integer.parseInt(args[1]);
        
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

kode program diatas merupakan latihan 842 dari modul 8,

public class modul8_latihan842 {

disini kita memakai kelas dengan nama modul8_latihan842

public static void main(String[] args){

lalu disini terdapat method yang sama seperti latihan 841, dengan akses public yang
berarti dapat diakses oleh semua orang, kemudian initialisasi nilai berupa static, 
dengan tipe method void yang berarti tidak mengembalikan nilai sebgai method utama,
ditambah dengan parameter array string untuk argumen

        int angka1 = Integer.parseInt(args[0]);
        int angka2 = Integer.parseInt(args[1]);

kode program selanjutnya  yakni deklarasi nilai untuk angka1 dan angka2
berupa integer, ini dikarenakan deklarasi tipe data sebelumnya yang sudah 
kita nyatakan berupa string, sedangkan yang dibutuhkan saat ini adalah nilai
berupa angka, maka kita melakukan parse nilai dari string ke integer dengan cara seperti diatas,
lalu menempatkan angka1 di argumen array ke 0, dan angka2 pada argumen aray ke 1, hal ini
dilakukan sesuai permintaan soal

/operasi
        int tambah = 0;
        tambah = angka1 + angka2;
        
        int kurang =0;
        kurang = angka1 - angka2;
        
        int kali = 1;
        kali = angka1 * angka2;
        
        int bagi = 1;
        bagi = angka1 / angka2;

lalu pada bagian ini kita melakukan operasi kabataku yang diminta, dengan melakukan
deklarasi tipe data dan pemberian nilai awal 0 untuk operasi tambah, kurang karena 
jika nilai diawali 0 maka tidak akan mengganggu operasi tambah-kurang dan 1 untuk 
operasi kali serta bagi dengan alasan nilai satu tidak akan mengganggu operasi 
nilai , karena jikalau kita menggunakan sebagai nilai awal, maka setiap pencarian 
hanya akan mendapat hasil 0

 //hasil
        System.out.println("sum : "+tambah);
        System.out.println("diff : "+kurang);
        System.out.println("product : "+kali);
        System.out.println("quotient : "+bagi);

berikut pada bagian ini kita melakukan pencetakan nilai atau tampilan dari proses yang sudah
kita lakukan, untuk mengetahui apakah proses kita telah berhasil serta apakah ada yang
harus kita evaluasi

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

untuk program diatas merupakan bentuk lain dari program latihan 842, dimana
disini kita menggunakan input nilai pada tampilan nantinya, disini kita melakukan
import paket java.util.scanner untuk melakukan input nilai, dilanjutkan dengan 
deklarasi tipe data yang disesuaikan dengan tipe data yang diinginkan yaitu 
angka sesuai aturan input dari java.util.scanner. selain dari hal tersebut, kita 
melakukan proses yang hampir sama dengan latihan 842 sebelumnya