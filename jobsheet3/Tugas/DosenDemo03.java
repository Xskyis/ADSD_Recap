package Tugas;

import java.util.Scanner;

public class DosenDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen03[] arrayOfdosen = new Dosen03[3];
        String kode, nama;
        boolean jenisKelamin;
        int usia;

        for (int i = 0; i < arrayOfdosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.nextBoolean();
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            sc.nextLine();
            arrayOfdosen[i] = new Dosen03(kode, nama, jenisKelamin, usia);
            System.out.println("-------------------------");
        }

        System.out.println();

        int index = 1;
        for (Dosen03 dosen03 : arrayOfdosen) {
            System.out.println("Data Dosen ke-" + index);
            System.out.println("Kode      : " + dosen03.kode);
            System.out.println("Nama      : " + dosen03.nama);
            // jenis kelain true = laki-laki, false = perempuan
            System.out.println("Jenis Kelamin : " + (dosen03.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia      : " + dosen03.usia);
            System.out.println("-------------------------");
            index++;
        }

        System.out.println();

        DataDosen03 dataDosen03 = new DataDosen03();
        dataDosen03.dataSemuaDosen(arrayOfdosen);
        dataDosen03.jumlahDosenPerJenisKelamin(arrayOfdosen);
        dataDosen03.rerataUsiaDosenPerJenisKelamin(arrayOfdosen);
        dataDosen03.infoDosenPalingTua(arrayOfdosen);
        dataDosen03.infoDosenPalingMuda(arrayOfdosen);

    }
}
