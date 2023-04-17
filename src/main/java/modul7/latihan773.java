/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul7;

/**
 *
 * @author HP
 */
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
