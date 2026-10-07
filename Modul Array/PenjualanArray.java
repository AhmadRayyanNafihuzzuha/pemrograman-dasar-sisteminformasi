package MateriArray;
public class PenjualanArray {
    public static void main(String[] args) {
        int[] penjualan = {25, 30, 18, 40, 35, 45, 50};
        int total = 0;
        
        for (int i = 0; i < penjualan.length; i++) {
            total+ = penjualan[i];
        }
    }
}