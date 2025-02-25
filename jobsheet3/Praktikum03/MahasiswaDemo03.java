
import java.util.Scanner;

public class MahasiswaDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa03[] arrayOfMahasiswa = new Mahasiswa03[3];
        String dummy;

        // Mahasiswa03[] myArrayOfMahasiswa = new Mahasiswa03[3];
        // myArrayOfMahasiswa[0].nim = "244107060033";
        // myArrayOfMahasiswa[0].nama = "Budi";
        // myArrayOfMahasiswa[0].kelas = "IF-43-04";
        // myArrayOfMahasiswa[0].ipk = (float) 3.75;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa03();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("----------------------------");
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i].cetakInfo(i);
        }
    }
}
