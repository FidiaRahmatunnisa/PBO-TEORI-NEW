/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul11;

/**
 *
 * @author HP
 */
public class square extends latihan1162{
    private double panjang;
    private double lebar;
    private double luas;
    private double keliling;
    
//    public square(){
//    }
    
    public square(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // panjang 
//    public void setPanjang(double panjang){
//        this.panjang = panjang;
//    }
    public double getPanjang(){
        return panjang;
    }
//    //lebar
//    public void setLebar(double lebar){
//        this.lebar = lebar;
//    }
    public double getLebar(){
        return lebar;
    }
    
    
    
    @Override
    public double getArea() {
        return luas = panjang*lebar;
    }

    @Override
    public String getName() {
        System.out.println("== Persegi Panjang ==");
//       return keliling = (2*panjang)+(2*lebar);
        return null;
    }
    
    //main method
    public static void main(String[] args){
        square data = new square(6,4);
        System.out.println(data.getName());
        System.out.println("panjang : "+data.getPanjang());
        System.out.println("Lebar :"+data.getLebar());
        System.out.println("Luas : "+data.getArea());
//        System.out.println("Keliling : "+data.getName());
    }
}
