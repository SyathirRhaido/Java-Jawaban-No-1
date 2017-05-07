package jawabansoalno1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author ridho
 */
public class JawabanSoalNo1 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        Scanner input = new Scanner(System.in);
        String kdBarang ="", nmBarang="", dataBarang="";
        int no=0, ulang=0, cetak=0, jmlBrng=0, hargaBarang=0;
        
        System.out.println("Toko beeLancah.com");
        
        do{
            no++;
            System.out.println("Item : "+no);
            
            System.out.print("Kode Barang : ");
                kdBarang = input.readLine();
//                  kdBarang = input.nextLine();
                
            System.out.print("Nama Barang : ");
                nmBarang = input.readLine();
//                  nmBarang = input.nextLine();
            
            System.out.print("Jumlah Barang : ");
                jmlBrng = Integer.parseInt(input.readLine());
//                  jmlBrng = input.nextInt();
                
            System.out.print("Harga Barang : ");
                hargaBarang = Integer.parseInt(input.readLine());
//                  hargaBarang = input.nextInt();
                
                 int total = hargaBarang * jmlBrng;
                
            dataBarang = dataBarang+"\nNO. "+ no +"\nKode Barang : "+kdBarang +
                    "\nNama Barang : "+nmBarang+"\nJumlah Barang : "+jmlBrng+"\n"+ "Harga Barang : "+ hargaBarang + 
                    "\nTotal Harga : " + total;
            
            System.out.print("Apakah anda akan menginputkan data lagi ?\n1. Ya \n2. Tidak"
                    + "\nJawab : ");
                    
            ulang = Integer.parseInt(input.readLine());
//              ulang = input.nextInt();
            
        }while(ulang==1);
        
        
        System.out.print("Apakah anda akan mencetak data barang yang masuk ? "
                + "?\n1. Ya \n2. Tidak"
                    + "\nJawab : ");
        
                    cetak = Integer.parseInt(input.readLine());
//                      cetak = input.nextInt();
                    
            if(cetak==1){
                System.out.println("=======DATA BARANG MASUK==========");
                System.out.println(dataBarang);
                               
                
            }
            
            
    }
    
}
