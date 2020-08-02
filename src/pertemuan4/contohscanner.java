/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class contohscanner {

    public static void main(String[] args) {
        int usia = 0;
        int gaji = 0;
        int nilai = 0;
        int absen = 0;
        int saudara = 0;
        
        // membuat scanner
        System.out.println("Umur Anda Berapa");
        Scanner inputUser = new Scanner(System.in); 
        usia = Integer.parseInt(inputUser.nextLine());
        System.out.println("gaji anda berapa");
        gaji = Integer.parseInt(inputUser.nextLine());
        System.out.println("nilai ujian anda berapa");
        nilai = Integer.parseInt(inputUser.nextLine());
        System.out.println("absen anda berapa");
        absen = Integer.parseInt(inputUser.nextLine());
        System.out.println("saudara anda berapa");
        saudara = Integer.parseInt(inputUser.nextLine());
        //output
        System.out.println("Usia Anda Adalah" + usia);
        System.out.println("gaji anda adalah" + gaji);
        System.out.println("nilai ujian anda adalah" + nilai);
        System.out.println("absen anda adalah" + absen);
        System.out.println("saudara anda adalah" + saudara);
        
        
    
        
   
    }
    
}
