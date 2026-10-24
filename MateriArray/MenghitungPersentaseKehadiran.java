package MateriArray;

public class MenghitungPersentaseKehadiran {
    public static void main(String[] args) {
        int[] hadir = {14, 13, 16, 12, 15, 10, 16, 14};
        int totalPertemuan = 16;
        double batasMinimal = 75.0;

        for (int i = 0; i < hadir.length; i++) {
            double persentase = hadir[i] / totalPertemuan * 100;

            System.out.println("Data ke-" + (i + 1) + ": " + hadir[i] + " hadir (" + String.format("%.2f", persentase) + "%%) - " + (persentase >= batasMinimal ? "Memenuhi minimal 75%" : "Tidak memenuhi minimal 75%"));
        }
    }
}
