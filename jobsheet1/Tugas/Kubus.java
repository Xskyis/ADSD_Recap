package Tugas;

import java.util.Scanner;

public class Kubus {
    static double sisi = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Volume, Luas Permukaan, dan Keliling Kubus");
        System.out.println("=============================================================");
        System.out.println("Pilih Menu: ");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.print("Masukkan pilihan: ");
        int pilihan = sc.nextInt();

        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = sc.nextDouble();

        switch (pilihan) {
            case 1:
                System.out.println("Volume Kubus: " + volumeKubus(sisi));
                break;
            case 2:
                System.out.println("Luas Permukaan Kubus: " + luasPermukaanKubus(sisi));
                break;
            case 3:
                System.out.println("Keliling Kubus: " + kelilingKubus(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    // Fungsi menghitung volume kubus
    public static double volumeKubus(double sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi menghitung luas permukaan kubus
    public static double luasPermukaanKubus(double sisi) {
        return 6 * sisi * sisi;
    }

    // Fungsi untuk menghitung keliling kubus
    public static double kelilingKubus(double sisi) {
        return 12 * sisi;
    }
}
