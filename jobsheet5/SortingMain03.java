public class SortingMain03 {
    public static void main(String[] args) {
        // int a[] = {20, 10, 2, 7, 12};
        // Sorting03 dataurut1 = new Sorting03(a, a.length);

        // System.out.println("Data awal 1");
        // dataurut1.tampil();
        // dataurut1.bubbleSort();
        // System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASCENDING)");
        // dataurut1.tampil();

        // int b[] = {30, 20, 2, 8, 14};
        // Sorting03 dataurut2 = new Sorting03(b, b.length);

        // System.out.println("Data awal 2");
        // dataurut2.tampil();
        // dataurut2.SelectionSort();
        // System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASCENDING)");
        // dataurut2.tampil();

        int c[] = {40, 10, 4, 9, 3};
        Sorting03 dataurut3 = new Sorting03(c, c.length);

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah dirutkan dengan INSERTION SORT (ASCENDING)");
        dataurut3.tampil();
    }
}
