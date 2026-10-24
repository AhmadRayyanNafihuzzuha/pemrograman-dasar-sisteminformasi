/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumModul2.HOTS_Case;

import java.util.Scanner;
public class HOTS1Tabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah bulan: ");
        int bulan = input.nextInt();
        int setoran = 100000;
        int total = 0;
        int bulanTarget = -1;
        for (int i = 1; i <= bulan; i++) {
            total += setoran;
            System.out.println("Bulan " + i + " = Rp" + setoran);
            if (bulanTarget == -1 && total >= 1000000) {
                bulanTarget = i;
                break;
            }
            setoran += 50000;
        }
        System.out.println("Total tabungan = Rp" + total);
        if (bulanTarget != -1) {
            System.out.println("Pertama kali mencapai Rp1.000.000 pada bulan ke-" + bulanTarget);
        } else {
            System.out.println("Target Rp1.000.000 belum tercapai.");
        }
        input.close();
    }
}
