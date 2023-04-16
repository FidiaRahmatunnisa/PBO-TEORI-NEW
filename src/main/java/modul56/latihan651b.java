/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul56;

/**
 *
 * @author ASUS
 */
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
