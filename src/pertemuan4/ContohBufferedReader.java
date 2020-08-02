/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author TOSHIBA
 */
public class ContohBufferedReader {

    public ContohBufferedReader(InputStreamReader r) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
  String nama = "";
  String status = "";
  
  // object InputStream
  InputStreamReader isr = new InputStreamReader(System.in);
  // object bufferedReader
  BufferedReader br = new BufferedReader(isr);
  
  // mengisi variabel nama dengan buffereadReader 
  System.out.println("Siapa Nama Anda ?");
  nama = br.readLine();
  
  System.out.println("Jomblo opo ora kowe ?");
  status = br.readLine();
  
   System.out.println("nama ayah adalah ?");
  status = br.readLine();
  
  System.out.println("nama ibu adalah ?");
  status = br.readLine();
  
  System.out.println("nama jodoh anda ");
  status = br.readLine(); 
  
  // menampilkan nama 
  System.out.println("nama anda adalah ?" + nama);
  System.out.println("Jomblo opo ora kowe ?" + status);
  System.out.println("Nama ayah adalah ?" + nama);  
  System.out.println("nama ibu adalah ?" + nama);
  System.out.println("nama jodoh anda" + nama); 

  
  
    }


}
