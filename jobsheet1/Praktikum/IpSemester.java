package Praktikum;

import java.util.Scanner;

public class IpSemester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mata Kuliah
        String[] mataKuliah = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        // Array untuk menyimpan nilai
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        // Input nilai angka
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
        }

        // Menampilkan hasil konversi
        System.out.println("\n===================================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("===================================");
        System.out.printf("%-40s %-10s %-10s %-10s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double totalBobot = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-10.2f %-10s %-10.2f%n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i],
                    bobotNilai[i]);
            totalBobot += bobotNilai[i];
        }

        // Menghitung IP
        double ip = totalBobot / mataKuliah.length;
        System.out.println("===================================");
        System.out.printf("IP : %.2f%n", ip);

        input.close();
    }
}
