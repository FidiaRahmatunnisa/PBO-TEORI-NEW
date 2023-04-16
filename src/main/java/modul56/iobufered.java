/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul56;

/**
 *
 * @author ASUS
 */

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
