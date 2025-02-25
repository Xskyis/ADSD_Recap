package Tugas;

public class DataDosen03 {
    void dataSemuaDosen(Dosen03[] arrayOfDosen) {
        System.out.println("=DATA SEMUA DOSEN=");
        int index = 1;
        for (Dosen03 dosen03 : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + index);
            System.out.println("Kode      : " + dosen03.kode);
            System.out.println("Nama      : " + dosen03.nama);
            System.out.println("Jenis Kelamin : " + (dosen03.jenisKelamin ? "Laki-laki" : "Perempuan"));
            System.out.println("Usia      : " + dosen03.usia);
            System.out.println("-------------------------");
            index++;
        }
        System.out.println();
    }

    void jumlahDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;

        for (Dosen03 dosen03 : arrayOfDosen) {
            if (dosen03.jenisKelamin) {
                jumlahLakiLaki++;
            } else {
                jumlahPerempuan++;
            }
        }

        System.out.println("=JUMLAH DOSEN PER JENIS KELAMIN=");
        System.out.println("Jumlah Dosen Laki-laki   : " + jumlahLakiLaki);
        System.out.println("Jumlah Dosen Perempuan   : " + jumlahPerempuan);
        System.out.println("-------------------------");

        System.out.println();
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen03[] arrayOfDosen) {
        int jumlahLakiLaki = 0;
        int jumlahPerempuan = 0;
        int totalUsiaLakiLaki = 0;
        int totalUsiaPerempuan = 0;

        for (Dosen03 dosen03 : arrayOfDosen) {
            if (dosen03.jenisKelamin) {
                jumlahLakiLaki++;
                totalUsiaLakiLaki += dosen03.usia;
            } else {
                jumlahPerempuan++;
                totalUsiaPerempuan += dosen03.usia;
            }
        }

        System.out.println("=RERATA USIA DOSEN PER JENIS KELAMIN=");
        System.out.println("Rerata Usia Dosen Laki-laki   : " + (totalUsiaLakiLaki / jumlahLakiLaki));
        System.out.println("Rerata Usia Dosen Perempuan   : " + (totalUsiaPerempuan / jumlahPerempuan));
        System.out.println("-------------------------");

        System.out.println();
    }

    void infoDosenPalingTua(Dosen03[] arrayOfDosen) {
        Dosen03 dosenTertua = arrayOfDosen[0];

        for (Dosen03 dosen03 : arrayOfDosen) {
            if (dosen03.usia > dosenTertua.usia) {
                dosenTertua = dosen03;
            }
        }

        System.out.println("=INFO DOSEN PALING TUA=");
        System.out.println("Dosen Tertua");
        System.out.println("Kode      : " + dosenTertua.kode);
        System.out.println("Nama      : " + dosenTertua.nama);
        System.out.println("Jenis Kelamin : " + (dosenTertua.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia      : " + dosenTertua.usia);
        System.out.println("-------------------------");

        System.out.println();
    }

    void infoDosenPalingMuda(Dosen03[] arrayOfDosen) {
        Dosen03 dosenTermuda = arrayOfDosen[0];

        for (Dosen03 dosen03 : arrayOfDosen) {
            if (dosen03.usia < dosenTermuda.usia) {
                dosenTermuda = dosen03;
            }
        }

        System.out.println("=INFO DOSEN PALING MUDA=");
        System.out.println("Dosen Termuda");
        System.out.println("Kode      : " + dosenTermuda.kode);
        System.out.println("Nama      : " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin : " + (dosenTermuda.jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia      : " + dosenTermuda.usia);
        System.out.println("-------------------------");

        System.out.println();
    }
}
