
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class kasirXRPL5 {
    public static void main(String[] args) {
        System.out.println("Menu Makanan");
        System.out.println("1. soto ayam (30000)");
        System.out.println("2. rawon daging (20000)");

        
                
        int soto,rawon;
        soto=30000;
        rawon=20000;
        
        
        int jumlahbeli,bayar,kembali,total;
        
        Scanner input = new Scanner(System.in);
        System.out.println("jumlah beli soto");
        jumlahbeli=input.nextInt();
        total=jumlahbeli*soto;
        System.out.println("jumlah beli rawon");
        jumlahbeli=input.nextInt();
        total+= jumlahbeli*rawon;
        System.out.println("total pembelian:"+total);
        System.out.println("masukkan pembayaran:");
        bayar=input.nextInt();
        kembali=bayar-total;
        System.out.println("jumlah kembalian: "+kembali);
        
        
    }
}
