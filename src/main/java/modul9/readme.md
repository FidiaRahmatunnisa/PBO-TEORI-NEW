public class studentRecord {

bagian diatas merupakan nama kelas yang kita pakai disini, dengan identifikasi secara
publik yang artinya dapat dilihat oleh siapa saja.

    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average;
    private String nilai;

bagian diatas merupakan deklarasi dari anggota, dimana terdapat objek name dengan
identifikasi private , seperti:
      private String name;
dimana private menjelaskan bahwa kelas hanya dapat diakses dari dalam kelas itu sendiri.
name, address, age, mathGrade, englishGrade, scienceGrade, average, dan nilai adalah variabel
anggota kelas dengan tipe data yang sesuai. Mereka menyimpan informasi tentang nama, alamat, 
usia, nilai matematika, nilai bahasa Inggris, nilai sains, rata-rata, dan nilai huruf dari seorang 
siswa.
    
    private static int studentCount;

studentCount adalah variabel anggota statis yang digunakan untuk menghitung jumlah objek studentRecord
yang telah dibuat. Diinialisasi dengan status private, yang artinya anggota hanya dapat diakses dari
kelas private itu sendiri.

    public studentRecord()
    {
        // area penulisan kode
        studentCount++;
    }

bagian diatas merupakan konstruktor tanpa parameter yang dijalankan saat objek studentRecord baru dibuat.
Pada konstruktor ini, variabel studentCount akan ditambah satu untuk setiap data yang dibuat. bagian ini 
diidentifikasi dengan status pubkic yang berarti dapat anggota dapat diakses dari dalam maupun luar
konstruktor itu sendiri.

     public studentRecord(String temp){
         this.name = temp; 
          studentCount++;
     } 

bagian diatas adalah konstruktor yang menerima parameter temp yang merupakan nama siswa. 
Konstruktor ini digunakan untuk menginisialisasi variabel name dengan nilai temp. Selain itu, variabel 
studentCount juga akan ditambah satu disetiap value yang diinputkan. selain itu status untuk aksesbilitas
-nya diatur public, sehingga anggota dapat diakses dari luar maupun dalam kostruktor.

     public studentRecord(String name, String address){
         this.name = name; 
         this.address = address; 
          studentCount++;
     } 

bagian ini merupakan konstruktor yang menerima parameter name dan address. Konstruktor ini digunakan 
untuk menginisialisasi variabel name dan address dengan nilai yang diberikan. Variabel studentCount 
juga akan ditambah satu saat nilai diinputkan. konstruktor ini diinialisasi dengan public dimana
semua anggota dapat mengaksesnya dari luar maupun dalam konstruktor.

     public studentRecord(double mGrade, double eGrade, double sGrade){
         mathGrade = mGrade;  
         englishGrade = eGrade;  
         scienceGrade = sGrade;  
          studentCount++;
     } 

bagian diatas adalah konstruktor yang diatur dengan akses public yang berarti dapat diakses dari 
mana saja. lalu konstruktor ini menerima parameter mGrade, eGrade, dan sGrade yang merupakan nilai 
matematika, bahasa Inggris, dan sains siswa. Konstruktor ini digunakan untuk menginisialisasi variabel 
mathGrade, englishGrade, dan scienceGrade dengan nilai yang diberikan. Variabel studentCount juga akan 
ditambah satu disetiap value diinputkan ulang jika input diatur dengan perulangan.

    public String getName(){
        return name;
    }

bagian diatas merupakan accesor, dimana berfungsi untuk mengembalikan nilai dari name, karena 
terdapat getName sebagai accesor-nya, dengan iniliasasi untuk getName yaitu String, sehingga otomatis 
data yang akan dibaca berupa huruf. Dalam konsep java ini juga disebut dengan objek. selain itu dalam 
bagian ini juga diminta pengembalian nilai dari accesor, yang ditandai dengan return name; juga ciri
khas yang membedakan accesor dengan mutator. diatur dengan aksebilitas public.

    public void setName(String name){
        this.name = name;
        
    }

bagian diatas merupakan mutator dengan akses public dimana kita dapat mengakses dari mana saja oleh mutatornya,
kemudian pada mutator tidak dapat dilakukan pengembalian nilai sehingga diidentifikasi dengan void yang 
fungsinya memang tidak mengembalikan nilai. pada bagian ini mutator bernama setName, yang bertugas 
mengubah nilai dari variabel, Metode ini menerima sebuah String baru (newName) dan mengubah nilai name 
menjadi nilai yang baru.
    
    public String getaddress(){
        return address;
    }

bagian diatas merupakan sebuah accesor bernama getaddress, memiliki aksesbilitas public,lalu diinialisasi
dengan String sebagai tipe data variabel/jenis objek. fungsinya mengembalikan nilai dari getaddress tanpa
mengubah apapun darinya , pengembalian nilai ditandai dengan return address;.

    public void setaddress(String address){
        this.address = address;
        
    }

bagian ini merupakan mutator dengan nama setaddress, memiliki akses public dimana berarti dapat diakses 
dari mana saja oleh kelas/objek ini. Dibuat tanpa pengembalian nilai yang ditandai dengan deklarasi void,
lalu Metode ini menerima satu parameter bertipe data String yang disebut address. Parameter ini digunakan 
untuk mengirim nilai yang akan diatur ke variabel anggota address. this.address = address; Ini adalah
pernyataan yang mengubah nilai variabel anggota address dengan nilai yang diberikan melalui parameter 
address. Kata kunci this merujuk pada objek saat ini (instansiasi kelas studentRecord). Dengan 
menggunakan this, kita memastikan bahwa variabel anggota address diubah dengan nilai yang diberikan 
kepada metode setaddress().   

    public int getage(){
        return age;
    }

bagian diatas merupakan sebuah accesor bernama getage, memiliki aksesbilitas public,lalu diinialisasi
dengan Int(integer/bilangan bulat) sebagai tipe data variabel/jenis objek. fungsinya mengembalikan nilai 
dari getage tanpa mengubah apapun darinya , pengembalian nilai ditandai dengan return age;.

    public void setage(int age){
        this.age = age;
        
    }

bagian diatas merupakan mutator bernama setage, dengan akses public berguna untuk aksesbilitas/ berkaitan
dengan siapa saja yang dapat mengaksesnya,disini aksesnya dapat dilakukan dari luar maupun dalam kelas/objek
dibuat. kemudian memakai void sebagai identifikasi bahwa tidak ada pengembalian nilai dari sebuah mutator
karena fungsinya adalah mengatur nilai variabel anggota age, memiliki parameter age dengan tipe data integer
this.age = age;: Ini adalah pernyataan yang mengubah nilai variabel anggota age dengan nilai yang 
diberikan melalui parameter age. Kata kunci this merujuk pada objek saat ini (instansiasi kelas 
studentRecord). Dengan menggunakan this, kita memastikan bahwa variabel anggota age diubah dengan 
nilai yang diberikan kepada metode setage().

    public double getmathGrade(){
        return mathGrade;
    }

bagian diatas merupakan accesor dengan nama getmathGrade, tanpa parameter, aksesbilitas public , kemudian
memiliki tipe data untuk accesor yaitu double, kemudian terdapat pengembalian nilai berupa return
mathGrade; dimana fungsi dari sebuah accesor adalam mengembalikan nilai tanpa mengubahnya sedikitpun.

    public void setmathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }

bagian diatas merupakan sebuah mutator bernama setmathGrade. memiliki aksesbilitas dan visibilitas public,
tanpa pengembalian nilai ditandai dengan void, karena fungsi dari sebuah mutator adalah mengatur nilai 
variabel. selain itu, disini kita juga memiliki parameter bertipe data double dengan nama mathGrade sama 
dengan objek yang telah kita deklarasikan diatas. kemudian terdapat perintah this.mathGrade = mathGrade
yang berarti perubahan nilai anggota mathGrade dengan nilai yang diberikan dari parameter. kata this 
merujuk pada objek yang dipakai saat ini, dengan menggunakanya kita memastikan bahwa variabel anggota
untuk mathGrade diubah dengan nilai yang diberikan pada metode setmathGrade.

    public double getenglishGrade(){
        return englishGrade;
    }

bagian diatas merupakan accesor dengan nama getenglishGrade, memiliki akses public yang berarti dapat diakses
dari luar maupun dalam kelas/objek. kemudian memiliki tipe data double untuk accesor tersebut, memiliki fungsi
tanpa parameter. kemudian terdapat pengembalian nilai terbukti dari return englishGrade;, fungsi accesor
adalah mengembalikan nilai tanpa ada yang harus diubah

    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }

bagian diatas merupakan mutator dengan nama setenglishGrade, memiliki akses public yang berarti dapat
diakses secara umum, lalu memiliki tipe data void, dimana pada mutator ini ditegaskan bahwa tidak ada
pengembalian nilai apapun, karena fungsinya yaitu mengatur nilai / mengambil nilai. kemudian disini
juga terdapat parameter bernama englishGrade dengan tipe data primitivnya yakni double, dilanjutkan dengan 
perubahan nilai ditandai dengan this.englishgrade = englisGrade, penggunaan this merupakan rujukan dipakai 
adalah objek yang dideklarasikan sebelumnya.

    public double getscienceGrade(){
        return scienceGrade;
    }

bagian diatas merupakan accesor bernama getscienceGrade, memiliki akses public, dan tipe data double
untuk nama accesornya, tidak memiliki parameter, tapi memiliki pengembalian nilai berupa retun scienceGrade;
fungsi dari bagian ini adalah mengembalikan nilai tanpa mengubahnya sedikitpun.

    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }

bagian diatas adalah mutator dengan nama setscienceGrade memiliki tipe data void, akses public, dan 
parameter bernama science dengan tipe data primitivenya yaitu double, kemudian terdapat pengisian 
nilai kembali pada bagian this.scienceGrade = scienceGrade;, yang memanfaatkan objeknya dengan parameternya.
fungsi bagian ini adalah meminta nilai/ mengatur nilai.

    public double getaverage(){
        average = (mathGrade + englishGrade + scienceGrade)/3 ;
        return average;
    }

bagian diatas adalah accesor dengan nama getaverage, memiliki akses public, dan tipe data double untuk 
accesornya, kemudian tidak memiliki parameter ditandai dengan fungsi kosong (),
pada bagian perintahnya terdapat proses untuk mencari rata-rata dari ketiga nilai yang sudah diinialisasikan
sebelumnya, nilai tersebut yaitu dari mathGrade, englishGrade, da scienceGrade, dilanjutkan dengan 
pengembalian nilai dari rata-rata tersebut. fungsi bagian ini hanya untuk mengembalikan nilai dari rata-rata
atau average, tidak ada perubahan yang dilakukan.

    public static int getstudentCount(){
        return studentCount;
    }

bagian ini merupakan accesor dari studentCount public: Kata kunci public menandakan bahwa metode ini 
dapat diakses dari mana saja dalam program. Kata kunci static digunakan untuk mendefinisikan 
metode yang terkait dengan kelas itu sendiri, bukan dengan instance (objek) kelas. Metode static dapat 
dipanggil tanpa perlu membuat objek dari kelas tersebut. Tipe data pengembalian metode ini adalah int, 
yang berarti metode ini akan mengembalikan nilai bertipe data int.getstudentCount adalah nama metode 
tanpa parameter. Nama metode ini menggambarkan fungsinya, yaitu untuk mendapatkan (mengembalikan) nilai 
dari variabel studentCount.return studentCount;: adalah pernyataan return yang mengembalikan nilai dari 
variabel studentCount. Ketika metode ini dipanggil, ia akan mengembalikan nilai studentCount kepada 
pemanggil metode.
Jadi, fungsi dari metode getstudentCount() ini adalah untuk memberikan akses untuk mendapatkan nilai 
dari variabel studentCount yang merupakan variabel statis (static) dalam kelas studentRecord. Metode 
ini dapat dipanggil langsung dengan menggunakan nama kelas tanpa harus membuat objek dari kelas tersebut.

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

bagian diatas merupakan accesor dengan nama getnilai, memiliki akses public yang dapat diakses dari mana
saja, lalu memiliki tipe data String untuk accesor, tidak memiliki parameter. didalamnya terdapat sebuah
proses pemilihan untuk setiap rata-rata nilai yang diperoleh dari bagian sebelumnya, terdapat klasifikasi
untuk rentang 5 rentang nilai. Disini kita menggunakan struktur pemilihan if-else if-else, dimana diluar
dari rentang nilai tersebut akan didapat error. dilanjutkan dengan sebuah deklarasi tentang pengembalian 
nilai dari proses yang telah dibuat diatas.
    
    public void print( String temp ){
        System.out.println("Name:" + name); 
        System.out.println("Address:" + address);  
        System.out.println("Age:" + age);  } 
 
Kata kunci public menandakan bahwa metode ini dapat diakses dari mana saja dalam program.void: Tipe data 
pengembalian metode ini adalah void, yang berarti metode ini tidak mengembalikan nilai apapun.
print(String temp): Ini adalah nama metode dengan satu parameter bertipe data String yang disebut temp. 
Parameter ini tidak digunakan dalam tubuh metode ini.
System.out.println("Name:" + name);: Pernyataan ini mencetak teks "Name:" diikuti oleh nilai dari 
variabel anggota name. Pernyataan ini akan mencetak nama pada output.
System.out.println("Address:" + address);: Pernyataan ini mencetak teks "Address:" diikuti oleh nilai 
dari variabel anggota address. Pernyataan ini akan mencetak alamat pada output.
System.out.println("Age:" + age);: Pernyataan ini mencetak teks "Age:" diikuti oleh nilai dari variabel 
anggota age. Pernyataan ini akan mencetak usia pada output.
Jadi, fungsi dari metode print(String temp) ini adalah untuk mencetak nilai dari variabel anggota name, 
address, dan age ke konsol dengan format yang ditentukan. Nilai-nilai ini akan dicetak sebagai bagian 
dari kalimat yang menjelaskan jenis informasi yang dicetak, seperti nama, alamat, dan usia. Parameter 
temp tidak digunakan dalam tubuh metode ini, jadi tidak mempengaruhi perilaku metode ini.

public void print(double eGrade, double mGrade, double sGrade){
    //System.out.println("Name:" + name); 
    System.out.println("Math Grade:" + mGrade);  
    System.out.println("English Grade:" + eGrade);  
    System.out.println("Science Grade:" + sGrade);  } 
}

public: Kata kunci public menandakan bahwa metode ini dapat diakses dari mana saja dalam program.
void: Tipe data pengembalian metode ini adalah void, yang berarti metode ini tidak mengembalikan nilai 
apapun.
print(double eGrade, double mGrade, double sGrade): Ini adalah nama metode dengan tiga parameter, yaitu 
eGrade, mGrade, dan sGrade, yang semuanya bertipe data double. Parameter ini digunakan untuk menerima 
nilai-nilai dari nilai-nilai yang akan dicetak.
System.out.println("Math Grade:" + mGrade);: Pernyataan ini mencetak teks "Math Grade:" diikuti oleh 
nilai dari parameter mGrade. Pernyataan ini akan mencetak nilai dari mGrade sebagai nilai dari penilaian 
matematika.
System.out.println("English Grade:" + eGrade);: Pernyataan ini mencetak teks "English Grade:" diikuti 
oleh nilai dari parameter eGrade. Pernyataan ini akan mencetak nilai dari eGrade sebagai nilai dari 
penilaian bahasa Inggris.
System.out.println("Science Grade:" + sGrade);: Pernyataan ini mencetak teks "Science Grade:" diikuti 
oleh nilai dari parameter sGrade. Pernyataan ini akan mencetak nilai dari sGrade sebagai nilai dari 
penilaian ilmu pengetahuan.
Jadi, fungsi dari metode print(double eGrade, double mGrade, double sGrade) ini adalah untuk mencetak 
nilai-nilai penilaian matematika, bahasa Inggris, dan ilmu pengetahuan ke konsol dengan format yang 
ditentukan. Pernyataan tersebut mencetak setiap nilai dengan teks yang menggambarkan jenis penilaian 
dan diikuti oleh nilai yang diberikan sebagai parameter.



bagian dibawah merupakan sebuah kelas lain yang bertujuan untuk menjalankan kode perintah dari kelas 
sebelumnya.

public class studentRecordExample {

bagian diatas merupkan deklarasi kelas yang digunakan yaitu studentRecordExample

    public static void main(String[] args){

bagian diatas merupakan sebuah metode biasa, dengan akses public berarti dapat diakses dari manapun,
Kata kunci static digunakan untuk mendefinisikan metode yang terkait dengan kelas itu sendiri, 
bukan dengan instance (objek) kelas. Metode static dapat dipanggil tanpa perlu membuat objek dari 
kelas tersebut.

        studentRecord annaRecord = new studentRecord();

bagian diatas merupakan pembuatan objek baru dari studentRecord dengan nama variabelnya annaRecord, 
hal ini bertujuan agar kita dapat memasukan nilai ke studentRecord melalui variabel annaRecord, 
sehingga setiap metode yang ada pada studentRecord dapat diakses dengan variabel annaRecord saja.

        annaRecord.setName("anna");
        annaRecord.setaddress("Padang");
        annaRecord.setage(23);
        annaRecord.setmathGrade(80);
        annaRecord.setenglishGrade(70);
        annaRecord.setscienceGrade(80);
        
bagian diatas adalah input nilai dari set/mutatornya, sesuai dengan fungsi dari sebuah mutator yaitu
mengambil nilai, lalu nilainya dimasukan ke annaRecord yang sesuai dengan setiap set/mutatornya

        //tampilkan 
        System.out.println("Nama              :"+annaRecord.getName());
        System.out.println("Alamat            :"+annaRecord.getaddress());
        System.out.println("Umur              :"+annaRecord.getage());
        System.out.println("Matematika        :"+annaRecord.getmathGrade());
        System.out.println("B.inggris         :"+annaRecord.getenglishGrade());
        System.out.println("Ilmu pengetahuan  :"+annaRecord.getscienceGrade());
        System.out.println("Rata - Rata Nilai :"+annaRecord.getaverage());
        System.out.println("Prediket Nilai    :"+annaRecord.getnilai());
        
bagian diatas merupakan proses output yang memanfaatkan get/accesor dengan pengembalian nilai,
sesuai dengan fungsinya, mutator mengambil nilai, kemudian accesor mengembalikan nilai tersebut
dengan cara menampilkannya pada output. menggunakan variabel annaRecord untuk mengakses nilai-nilai 
tersebut.

        studentRecord aliRecord = new studentRecord();

bagian diatas merupakan pembuatan objek baru dari studentRecord dengan varibel bernama aliRecord,
bertujuan agar metode yang terdapat pada studentRecord dapat diakses oleh alirecord 

        aliRecord.setName("Ali");
        aliRecord.setaddress("Padang");
        aliRecord.setage(23);

bagian diatas merupakan mutator dari name,address,age, bertujuan untuk mengambil nilai dari metode 
tersebut lalu menyimpannya di objek baru bernama aliRecord

        aliRecord.print("");
        aliRecord.print(80,70,80);
        
bagian diatas merupakan metode yang berguna untuk mengembalikan/ menampilkan nilai dari input
yang dilakukan,

         studentRecord budiRecord = new studentRecord("budi", "Bukittinggi");
         budiRecord.print("");
         
bagian diatas merupakan pembuatan objek baru dari studentRecord dengan nama budiRecord yang mana bertujuan
untuk membuat sebuah objek baru untuk proses baru

        System.out.println("Jumlah siswa : "+ studentRecord.getstudentCount());
    
bagian diatas merupakan output dari aksesor yang bertujuan menampilkan berapa banyak objek baru yang
telah dibuat, pengambilanya dari langsung kelas studentRecord
        
    }
}
