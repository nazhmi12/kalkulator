/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author user
 */
import java.util.Scanner;
class Barang {
    
    public void b1()
    {
        // NOTE: Membuat var        
        int result;
        int jumlahBeli;
        int hargaBarang = 50000;
        
        System.out.println("Nama barang: Kaos katun");
        System.out.println("Harga barang: Rp." + hargaBarang);
        Scanner input = new Scanner(System.in);
        // NOTE: Input
        System.out.print("Jumlah Beli: ");    
        jumlahBeli = input.nextInt();
        
        // NOTE: Proses perhitungan 
        result = jumlahBeli * hargaBarang;
        if(result >= 1000.000) {
            int total_bayaran;
            total_bayaran = (result-(result*30/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        } else if (result >= 500.000) {
            int total_bayaran;
            total_bayaran = (result-(result*20/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        } else if (result >= 250.000) {
            int total_bayaran;
            total_bayaran = (result-(result*10/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        }
        
    }
    
    public void b2()
    {
        // NOTE: Membuat var        
        int result;
        int jumlahBeli;
        int hargaBarang = 235000;
        
        System.out.println("Nama barang: Jaket Bomber");
        System.out.println("Harga barang: Rp." + hargaBarang);
        Scanner input = new Scanner(System.in);
        // NOTE: Input
        System.out.print("Jumlah Beli: ");    
        jumlahBeli = input.nextInt();
        
        // NOTE: Proses perhitungan 
        result = jumlahBeli * hargaBarang;
        if(result >= 1000.000) {
            int total_bayaran;
            total_bayaran = (result-(result*30/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        } else if (result >= 500.000) {
            int total_bayaran;
            total_bayaran = (result-(result*20/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        } else if (result >= 250.000) {
            int total_bayaran;
            total_bayaran = (result-(result*10/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        }
        
    }
    
    public void b3()
    {
        // NOTE: Membuat var        
        int result;
        int jumlahBeli;
        int hargaBarang = 120000;
        
        System.out.println("Nama barang: Kaos Lengan Pendek");
        System.out.println("Harga barang: Rp." + hargaBarang);
        Scanner input = new Scanner(System.in);
        // NOTE: Input
        System.out.print("Jumlah Beli: ");    
        jumlahBeli = input.nextInt();
        
        // NOTE: Proses perhitungan 
        result = jumlahBeli * hargaBarang;
        if(result >= 1000.000) {
            int total_bayaran;
            total_bayaran = (result-(result*30/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        } else if (result >= 500.000) {
            int total_bayaran;
            total_bayaran = (result-(result*20/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        } else if (result >= 250.000) {
            int total_bayaran;
            total_bayaran = (result-(result*10/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        }
        
    }
    
    public void b4()
    {
        // NOTE: Membuat var        
        int result;
        int jumlahBeli;
        int hargaBarang = 199000;
        
        System.out.println("Nama barang: Celana Jeans Panjang");
        System.out.println("Harga barang: Rp." + hargaBarang);
        Scanner input = new Scanner(System.in);
        // NOTE: Input
        System.out.print("Jumlah Beli: ");    
        jumlahBeli = input.nextInt();
        
        // NOTE: Proses perhitungan 
        result = jumlahBeli * hargaBarang;
        if(result >= 1000.000) {
            int total_bayaran;
            total_bayaran = (result-(result*30/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        } else if (result >= 500.000) {
            int total_bayaran;
            total_bayaran = (result-(result*20/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        } else if (result >= 250.000) {
            int total_bayaran;
            total_bayaran = (result-(result*10/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        }
        
    }
    
    public void b5()
    {
        // NOTE: Membuat var        
        int result;
        int jumlahBeli;
        int hargaBarang = 260000;
        
        System.out.println("Nama barang: Sepatu Sneaker");
        System.out.println("Harga barang: Rp." + hargaBarang);
        Scanner input = new Scanner(System.in);
        // NOTE: Input
        System.out.print("Jumlah Beli: ");    
        jumlahBeli = input.nextInt();
        
        // NOTE: Proses perhitungan 
        result = jumlahBeli * hargaBarang;
        if(result >= 1000.000) {
            int total_bayaran;
            total_bayaran = (result-(result*30/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        } else if (result >= 500.000) {
            int total_bayaran;
            total_bayaran = (result-(result*20/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        } else if (result >= 250.000) {
            int total_bayaran;
            total_bayaran = (result-(result*10/100));
            System.out.println("Harga: " + result);
            System.out.println("Diskon: " + total_bayaran);
        }
        
    }
   
           
}
    
public class Main {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        String kode;
        
        System.out.print("Masukan kode barang: ");
        kode = input.nextLine();
        // NOTE: Menginstansiasi class Barang
        Barang b = new Barang();
        switch(kode) {
            case "b1":
                    b.b1();
                break;
            case "b2":
                    b.b2();
                break;
            case "b3":
                    b.b3();
                break;
            case "b4":
                    b.b4();
                break;
            case "b5":
                    b.b5();
                break;
            default:
                System.out.println("Kode barang tidak tersedia");  
        }
    }
    
}