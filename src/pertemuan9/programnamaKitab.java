/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class programnamaKitab {
    public static void main(String[] args) {
        
        String namaKitab[] = new String[6];
        for(int i=0; i<namaKitab.length;i++){
         namaKitab[i] = JOptionPane.showInputDialog(null, "Inputkan Nama Kitab Ke" + i);
            System.out.println(namaKitab[i]);     
        }
        
        String cariNama = JOptionPane.showInputDialog(null, "cari nama kitab");
       
        for(int i=0; i<namaKitab.length;i++){
        if(namaKitab[i].equals(cariNama)){
            JOptionPane.showInputDialog(null, "Nama yang anda cari adalah" +cariNama + "ketemu pada indeks ke" + i);
            
       
            
        }
            
            
        }
    }
    
}
