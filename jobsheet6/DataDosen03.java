public class DataDosen03 {
    Dosen03[] dataDosen = new Dosen03[10];
    int idx = 0;

    public void tambah(Dosen03 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen03 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan dari termuda ke tertua (Bubble Sort).");
    }

    public void sortingDSC() {
        for (int i = 1; i < idx; i++) {
            Dosen03 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia < key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j = j - 1;
            }
            dataDosen[j + 1] = key;
        }
        System.out.println("Data berhasil diurutkan dari tertua ke termuda (Insertion Sort).");
    }

    void PencarianDataSequential03(String nama) {
        boolean ditemukan = false;
        int jumlahHasil = 0;
        System.out.println("\nHasil pencarian data dosen dengan nama " + nama + ":");

        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("Ditemukan pada indeks ke-" + i);
                dataDosen[i].tampil();
                ditemukan = true;
                jumlahHasil++;
            }
        }

        if (!ditemukan) {
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan!");
        }

        if (jumlahHasil > 1) {
            System.out.println("\nPERINGATAN: Ditemukan " + jumlahHasil + " data dosen dengan nama yang sama!");
        }
    }

    void PencarianDataBinary03(int usia) {
        sortingASC();

        boolean ditemukan = false;
        int jumlahHasil = 0;
        int left = 0;
        int right = idx - 1;
        int firstFound = -1;

        System.out.println("\nHasil pencarian data dosen dengan usia " + usia + ":");

        while (left <= right) {
            int mid = (left + right) / 2;

            if (dataDosen[mid].usia == usia) {
                firstFound = mid;
                ditemukan = true;
                break;
            } else if (dataDosen[mid].usia > usia) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (ditemukan) {
            for (int i = firstFound; i >= 0 && dataDosen[i].usia == usia; i--) {
                System.out.println("Ditemukan pada indeks ke-" + i);
                dataDosen[i].tampil();
                jumlahHasil++;
            }

            for (int i = firstFound + 1; i < idx && dataDosen[i].usia == usia; i++) {
                System.out.println("Ditemukan pada indeks ke-" + i);
                dataDosen[i].tampil();
                jumlahHasil++;
            }

            if (jumlahHasil > 1) {
                System.out.println("\nPERINGATAN: Ditemukan " + jumlahHasil + " data dosen dengan usia yang sama!");
            }
        } else {
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan!");
        }
    }
}
