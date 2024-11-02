
package Pertemuan5;

import java.util.Scanner;

public class Latihan17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========Program Tunjangan========");
        
        // Input gaji pokok
        System.out.print("Berapa gaji pokok anda perbulan? Rp. ");
        double gajiPokok = input.nextDouble();

        // Input status menikah
        System.out.print("Status Anda? (Menikah/Belum) : ");
        String status = input.next();

        // Deklarasi variabel tunjangan
        double tunjangan = 0;

        // Logika untuk menentukan tunjangan
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        }

        // Hitung total gaji
        double totalGaji = gajiPokok + tunjangan;

        // Output hasil perhitungan
        System.out.println("\n=====Hasil Perhitungan Gaji Anda=====");
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("Total Gaji   : Rp " + totalGaji);
        
        input.close();
    }
}

