package Tugas;

import java.util.Scanner;

public class PlatNomor {
    public static void main(String[] args) {
        // Deklarasi array kode plat dan kota
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] KOTA = new char[10][12];

        // Inisialisasi array kota
        KOTA[0] = new char[] { 'B', 'A', 'N', 'T', 'E', 'N' };
        KOTA[1] = new char[] { 'J', 'A', 'K', 'A', 'R', 'T', 'A' };
        KOTA[2] = new char[] { 'B', 'A', 'N', 'D', 'U', 'N', 'G' };
        KOTA[3] = new char[] { 'C', 'I', 'R', 'E', 'B', 'O', 'N' };
        KOTA[4] = new char[] { 'B', 'O', 'G', 'O', 'R' };
        KOTA[5] = new char[] { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' };
        KOTA[6] = new char[] { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' };
        KOTA[7] = new char[] { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' };
        KOTA[8] = new char[] { 'M', 'A', 'L', 'A', 'N', 'G' };
        KOTA[9] = new char[] { 'T', 'E', 'G', 'A', 'L' };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = scanner.next().toUpperCase().charAt(0);
        scanner.close();

        // Cari kode plat nya
        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (inputKode == KODE[i]) {
                System.out.print("Kota yang dengan kode plat " + inputKode + " = ");
                for (int j = 0; j < KOTA[i].length; j++) {
                    System.out.print(KOTA[i][j]);
                }
                System.out.println();
                ditemukan = true;
                break;
            }
        }

        // Handle jika kode plat tidak ditemukan
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
