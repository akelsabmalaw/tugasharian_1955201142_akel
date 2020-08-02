/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan10;

/**
 *
 * @author TOSHIBA
 */
public class arrayMultiDimensi {

    public static void main(String[] args) {
        System.out.println("Array 1 dimensi");
        int bilangan[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};// array 1 dimensi

        for (int i = 0; i < bilangan.length; i++) {
            System.out.println(bilangan[i]);
        }
        System.out.println("Array 2 dimensi untuk integer");
        int matriks[][] = {{1, 4},
        {5, 7}};

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                System.out.println(matriks[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Array 2 dimensi untuk String");
        String namaKitab[][] = {{"01", "aswaja"}, {"02", "sulam"}, {"03", "taqrib"}};

        for (int i = 0; i < namaKitab.length; i++) {
            for (int j = 0; j < namaKitab[0].length; j++) {
                System.out.println(namaKitab[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        

    }

}
