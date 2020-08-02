/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class contohJOptionPane {
    public static void main(String[] args) {
        String tanya = JOptionPane.showInputDialog("Anda Tinggal Dimana?");
        System.out.println("Anda Tinggal Di" + tanya);
        
        String takon = JOptionPane.showInputDialog("Dimana Anda Kuliah");
        System.out.println("Anda kuliah Di" + takon);
        
        String kepo  = JOptionPane.showInputDialog("jurusan apa yang kamu ambil?");
        System.out.println("jurusan apa yang kamu ambil?" + kepo);
        
        String warna = JOptionPane.showInputDialog("warna kesukaan");
        System.out.println("warna kesukaan" + warna);
        
        String hobi = JOptionPane.showInputDialog("hobi kamu apa?");
        System.out.println("hobi kamu apa" + hobi);
        
                
    }
    
}
