/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tunjangan1;

/**
 *
 * @author 
 * Nama              : Akmaliyah
 * NIM               : 23176007
 * Prodi             : Sistem Informasi
 * Deskripsi Program : Program ini berisi program untuk menampilkan jenis-jenis data bilangan bulat
 */

import java.util.Scanner;

public class Tunjangan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner scanner = new Scanner (System.in);
        Scanner input = new Scanner (System.in);
        
        System.out.println("=====Program Tunjangan=====");
        System.out.print("Nama Anda: ");
        String nama = input.nextLine();
        
        System.out.println("Berapa gaji pokok anda perbulan?:Rp. ");
        double gajiPokok = scanner.nextDouble();
        
        System.out.println("Status Anda? (Menikah/Belum)");
        String status = scanner.next();
        
        double Tunjangan = 0;
        
        if (status.equalsIgnoreCase("Menikah")) {
            Tunjangan = gajiPokok * 0.35;
        }
        
        double totalGaji = gajiPokok + Tunjangan;
        
        System.out.println("========Hasil Perhitungan Gaji Anda========");
        System.out.println ("Nama : " + nama);
        System.out.println ("Gaji Pokok : Rp " + gajiPokok);
        System.out.println ("Tunjangan : Rp " + Tunjangan);
        System.out.println ("Total Gaji : Rp " + totalGaji);
        
        scanner.close();
        }
    }


 