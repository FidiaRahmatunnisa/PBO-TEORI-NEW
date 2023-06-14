/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul10;

/**
 *
 * @author HP
 */
public class DataBukuAlamat {
    private String nama;
    private String alamat;
    private String nomor;
    private String email;
    
    public static int tambah;
    
    DataBukuAlamat(){
    tambah++;
}
    // method nama
    public void setNama(String nama){
        this.nama = nama;
//        tambah++;
    }
    public String getNama(){
        return nama;
    }
    //method alamat
    public void setAlamat(String alamat){
        this.alamat = alamat;
//        tambah++;
    }
    public String getAlamat(){
        return alamat;
    }
    //method nomor telepon
    public void setNomor(String nomor){ //set ditandai dengan void didepan pemberian nama 
        this.nomor = nomor;
//        tambah++;
    }
    
    public String getNomor(){
        return nomor;
    }
    // method email
    public void setEmail(String email){
        this.email = email;
//        tambah++;
    }
    public String getEmail(){
        return email;
    }
    
    public static void main(String[] args){
        DataBukuAlamat data = new DataBukuAlamat();
        data.setNama("ucup");
        data.setAlamat("Padang");
        data.setNomor("1234567890");
        data.setEmail("ucup123@gamil.com");
        
        //pemanggilan output
        System.out.println("Data ke-"+data.tambah);
        System.out.println("Nama : "+data.getNama());
        System.out.println("Alamat : "+data.getAlamat());
        System.out.println("Nomor Telepon :"+data.getNomor());
        System.out.println("Email :"+data.getEmail());
        
    }
    
    
}
