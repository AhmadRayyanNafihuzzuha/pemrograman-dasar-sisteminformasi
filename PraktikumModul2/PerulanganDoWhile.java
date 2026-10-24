/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraktikumModul2;

import java.util.Scanner;
public class PerulanganDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = input.nextInt();
            System.out.println("Anda memasukkan: " + angka);
        } while (angka != 0);
        System.out.println("Program selesai.");
        input.close();
    }
}
