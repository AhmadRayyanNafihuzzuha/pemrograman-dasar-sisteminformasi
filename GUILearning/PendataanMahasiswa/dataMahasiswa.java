/**
 * Nama : Ahmad Rayyan Nafihuzzuha
 * NIM  : 09020626043
 * Kelas: H6Z.1
 */
package GUILearning.PendataanMahasiswa;
import java.util.ArrayList;
public class dataMahasiswa {
        private String nimMahasiswa;
    private String namaMahasiswa;
    private String prodi;
    private String jenisKelamin;
    
    public dataMahasiswa(String nim, String nama,
            String prodi, String jenisKelamin) {
        this.nimMahasiswa = nim;
        this.namaMahasiswa = nama;
        this.prodi = prodi;
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getnamaMahasiswa(){
        return namaMahasiswa;
    }
    public String getnimMahasiswa(){
        return nimMahasiswa;
    }
    public String getprodi(){
        return prodi;
    }
    public String getjenisKelamin(){
        return jenisKelamin;
    }
}
