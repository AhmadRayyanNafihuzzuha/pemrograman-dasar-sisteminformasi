package MateriArray;

import java.util.*;
public class InputArrayDariKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] nilai = new int[5];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + " : ");
            nilai[i] = input.nextInt();
        }
        System.out.println("\nData Nilai");
        System.out.println("Panjang Array : " + nilai.length);
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Ke-" + (i+1) + " : " + nilai[i]);
        }
    }
}