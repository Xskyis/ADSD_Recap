package Praktikum;

import java.util.Scanner;

public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiTgs, nilaiKuis, nilaiUts, nilaiUas;
        double nilaiAkhir;
        String nilaiHuruf = "";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("====================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTgs = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUas = sc.nextInt();
        System.out.println("====================");
        System.out.println("====================");

        // Validasi inputan nilai Tgs, Kuis, Uts, Uas
        if (nilaiTgs >= 0 && nilaiTgs <= 100 && nilaiKuis >= 0 && nilaiKuis <= 100 && nilaiUts >= 0 && nilaiUts <= 100
                && nilaiUas >= 0 && nilaiUas <= 100) {
            nilaiAkhir = (nilaiTgs * 20 / 100f) + (nilaiKuis * 20 / 100f) + (nilaiUts * 30 / 100f)
                    + (nilaiUas * 30 / 100f);
            System.out.println("nilai akhir: " + nilaiAkhir);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                System.out.println("Nilai Huruf: " + nilaiHuruf);
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                System.out.println("Nilai Huruf: " + nilaiHuruf);
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                System.out.println("Nilai Huruf: " + nilaiHuruf);
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                System.out.println("Nilai Huruf: " + nilaiHuruf);
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                System.out.println("Nilai Huruf: " + nilaiHuruf);
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "E";
                System.out.println("Nilai Huruf: " + nilaiHuruf);
            }

            if (nilaiHuruf.equalsIgnoreCase("A") || nilaiHuruf.equalsIgnoreCase("B+")
                    || nilaiHuruf.equalsIgnoreCase("B") || nilaiHuruf.equalsIgnoreCase("C+")
                    || nilaiHuruf.equalsIgnoreCase("C")) {
                System.out.println("====================");
                System.out.println("====================");
                System.out.println("SELAMAT ANDA LULUS");

            } else {
                System.out.println("Maaf Anda Tidak Lulus");
            }
        } else {
            System.out.println("Nilai Tidak Valid");
        }
    }
}
