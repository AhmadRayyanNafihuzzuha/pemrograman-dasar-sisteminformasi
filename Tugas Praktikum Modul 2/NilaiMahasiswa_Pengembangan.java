/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumModul2;

import java.util.Scanner;
public class NilaiMahasiswa_Pengembangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lulus = 0, tidakLulus = 0, total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            int nilai = input.nextInt();
            total += nilai;
            if (nilai >= 75) {
                System.out.println("Status: Lulus");
                lulus++;
            } else {
                System.out.println("Status: Tidak Lulus");
                tidakLulus++;
            }
        }
        double rataRata = (double) total / 5;
        System.out.println("Jumlah lulus = " + lulus);
        System.out.println("Jumlah tidak lulus = " + tidakLulus);
        System.out.println("Rata-rata = " + rataRata);
        input.close();
    }
}

