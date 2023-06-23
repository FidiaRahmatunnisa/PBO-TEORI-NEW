/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul11;

/**
 *
 * @author HP
 */
public class circle extends latihan1162{
    private double jari;
    private double phi = 3.14;
    
//    circle(){
//        
//    }
    
    circle(double jari){
        this.jari = jari;
    }
    
    public double jari(){
        return jari;
    }
    
    public double phi(){
        return phi;
    }

    @Override
    public double getArea() {
        return jari*jari*phi;
    }

    @Override
    public String getName() {
        System.out.println("== Lingkaran ==");
        return null;
    }
    
    public static void main(String[] args){
        circle data = new circle(7);
        System.out.println(data.getName());
        System.out.println("Jari-Jari : "+data.jari);
        System.out.println("phi : "+data.phi);
        System.out.println("Luas : "+data.getArea());
    }
   
}
