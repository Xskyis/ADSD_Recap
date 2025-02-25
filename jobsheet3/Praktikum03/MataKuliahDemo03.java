import java.util.Scanner;

public class MataKuliahDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahElm;

        System.out.print("Masukkan jumlah Matkul : ");
        jumlahElm = sc.nextInt();
        sc.nextLine();

        Matakuliah03[] arrayOfMatakuliah = new Matakuliah03[jumlahElm];

        for (int i = 0; i < jumlahElm; i++) {
            arrayOfMatakuliah[i] = new Matakuliah03();
            arrayOfMatakuliah[i].tambahData(i);
        }

        for (int i = 0; i < jumlahElm; i++) {
            arrayOfMatakuliah[i].cetakInfo(i);
        }
    }
}