package Tugas;

import java.util.Scanner;

public class JadwalKuliah {
    static int n; 
    static String[] namaMatkul;
    static int[] sks;
    static int[] semester;
    static String[] hariKuliah;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        n = scanner.nextInt();
        scanner.nextLine(); 

        namaMatkul = new String[n];
        sks = new int[n];
        semester = new int[n];
        hariKuliah = new String[n];

        // Input data mata kuliah
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = scanner.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal();
                    break;
                case 2:
                    System.out.print("Masukkan hari yang ingin ditampilkan: ");
                    String hari = scanner.nextLine();
                    tampilkanJadwalBerdasarkanHari(hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = scanner.nextInt();
                    tampilkanJadwalBerdasarkanSemester(sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String nama = scanner.nextLine();
                    cariMataKuliah(nama);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    // Menampilkan seluruh jadwal kuliah
    static void tampilkanSeluruhJadwal() {
        System.out.println("\n=== Seluruh Jadwal Kuliah ===");
        for (int i = 0; i < n; i++) {
            System.out.println(
                    namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    // Menampilkan jadwal berdasarkan hari tertentu
    static void tampilkanJadwalBerdasarkanHari(String hari) {
        System.out.println("\n=== Jadwal Kuliah Hari " + hari + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah di hari " + hari);
        }
    }

    // Menampilkan jadwal berdasarkan semester tertentu
    static void tampilkanJadwalBerdasarkanSemester(int sem) {
        System.out.println("\n=== Jadwal Kuliah Semester " + sem + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (semester[i] == sem) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah di semester " + sem);
        }
    }

    // Mencari mata kuliah berdasarkan nama
    static void cariMataKuliah(String nama) {
        System.out.println("\n=== Pencarian Mata Kuliah: " + nama + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (namaMatkul[i].equalsIgnoreCase(nama)) {
                System.out.println("Nama: " + namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]
                        + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah dengan nama \"" + nama + "\" tidak ditemukan.");
        }
    }
}
