/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumModul2.HOTS_Case;

import java.util.Scanner;
public class HOTS2Presensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa: ");
        int n = input.nextInt();
        int hadir = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Mahasiswa ke-" + i + " (1 hadir / 0 tidak): ");
            int status = input.nextInt();
            if (status == 1) hadir++;
        }
        int tidakHadir = n - hadir;
        double persentase = n == 0 ? 0 : hadir * 100.0 / n;
        System.out.println("Jumlah hadir = " + hadir);
        System.out.println("Jumlah tidak hadir = " + tidakHadir);
        System.out.println("Persentase kehadiran = " + persentase + "%");
        System.out.println(persentase >= 75 ? "Memenuhi syarat" : "Tidak memenuhi syarat");
        input.close();
    }
}