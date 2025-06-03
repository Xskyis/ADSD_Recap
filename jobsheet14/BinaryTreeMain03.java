public class BinaryTreeMain03 {
    public static void main(String[] args) {
        // BinaryTree03 bst = new BinaryTree03();

        // bst.add(new Mahasiswa03("244160121", "Ali", "A", 3.57));
        // bst.add(new Mahasiswa03("244160221", "Badar", "B", 3.85));
        // bst.add(new Mahasiswa03("244160185", "Candra", "C", 3.21));
        // bst.add(new Mahasiswa03("244160220", "Dewi", "B", 3.54));

        // System.out.println("Daftar semua mahasiswa (in order traversal): ");
        // bst.traverseInOrder(bst.root);

        // System.out.println("\nPencarian data mahasiswa:");
        // System.out.print("s:Cari mahasiswa dengan ipk: 3.54 : ");
        // String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan"; //
        // Assuming bst.find returns boolean
        // System.out.println(hasilCari);

        // System.out.print("s:Cari mahasiswa dengan ipk: 3.22 : ");
        // hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan"; // Assuming
        // bst.find returns boolean
        // System.out.println(hasilCari);

        // bst.add(new Mahasiswa03("244160131", "Devi", "A", 3.72));
        // bst.add(new Mahasiswa03("244160205", "Ehsan", "D", 3.37));
        // bst.add(new Mahasiswa03("244160170", "Fizi", "B", 3.46));
        // System.out.println("\nDaftar semua mahasiswa setelah penambahan 3
        // mahasiswa:");
        // System.out.println("InOrder Traversal:");
        // bst.traverseInOrder(bst.root);
        // System.out.println("\nPreOrder Traversal:");
        // bst.traversePreOrder(bst.root); // Assuming bst.traversePreOrder exists
        // System.out.println("\nPostOrder Traversal:");
        // bst.traversePostOrder(bst.root); // Assuming bst.traversePostOrder exists

        // System.out.println("\nPenghapusan data mahasiswa");
        // bst.delete(3.57); // Assuming bst.delete exists
        // System.out.println("Daftar semua mahasiswa setelah penghapusan 1 mahasiswa
        // (in order traversal):");
        // bst.traverseInOrder(bst.root);

        // BinaryTreeArray03 bta = new BinaryTreeArray03();
        // Mahasiswa03 mhs1 = new Mahasiswa03("244160121", "Ali", "A", 3.57);
        // Mahasiswa03 mhs2 = new Mahasiswa03("244160185", "Candra", "C", 3.41);
        // Mahasiswa03 mhs3 = new Mahasiswa03("244160221", "Badar", "B", 3.75);
        // Mahasiswa03 mhs4 = new Mahasiswa03("244160220", "Dewi", "B", 3.35);

        // Mahasiswa03 mhs5 = new Mahasiswa03("244160131", "Devi", "A", 3.48);
        // Mahasiswa03 mhs6 = new Mahasiswa03("244160205", "Ehsan", "D", 3.61);
        // Mahasiswa03 mhs7 = new Mahasiswa03("244160170", "Fizi", "B", 3.86);

        // Mahasiswa03[] dataMahasiswa = { mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null };
        // int idxLast = 6;
        // bta.populateData(dataMahasiswa, idxLast);
        // System.out.println("\nInOrder Traversal Mahasiswa: ");
        // bta.traverseInOrder(0);

        // Test BinaryTree03 dengan method baru
        BinaryTree03 bst = new BinaryTree03();
        
        // Test addRekursif()
        System.out.println("=== Test addRekursif() ===");
        bst.addRekursif(new Mahasiswa03("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa03("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa03("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa03("244160220", "Dewi", "B", 3.54));
        bst.addRekursif(new Mahasiswa03("244160131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa03("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa03("244160170", "Fizi", "B", 3.46));
        
        System.out.println("Data mahasiswa (InOrder Traversal):");
        bst.traverseInOrder(bst.root);
        
        // Test cariMinIPK() dan cariMaxIPK()
        System.out.println("\n=== Test cariMinIPK() dan cariMaxIPK() ===");
        Mahasiswa03 minIPK = bst.cariMinIPK();
        Mahasiswa03 maxIPK = bst.cariMaxIPK();
        
        System.out.println("Mahasiswa dengan IPK terkecil:");
        if (minIPK != null) minIPK.tampilInformasi();
        
        System.out.println("Mahasiswa dengan IPK terbesar:");
        if (maxIPK != null) maxIPK.tampilInformasi();
        
        // Test tampilMahasiswaIPKdiAtas()
        System.out.println("\n=== Test tampilMahasiswaIPKdiAtas() ===");
        bst.tampilMahasiswaIPKdiAtas(3.50);
        
        System.out.println("\n" + "=".repeat(50));
        
        // Test BinaryTreeArray03 dengan method baru
        System.out.println("=== Test BinaryTreeArray03 ===");
        BinaryTreeArray03 bta = new BinaryTreeArray03();
        
        // Test method add()
        System.out.println("\n--- Test method add() ---");
        bta.add(new Mahasiswa03("244160121", "Ali", "A", 3.57));
        bta.add(new Mahasiswa03("244160185", "Candra", "C", 3.41));
        bta.add(new Mahasiswa03("244160221", "Badar", "B", 3.75));
        bta.add(new Mahasiswa03("244160220", "Dewi", "B", 3.35));
        bta.add(new Mahasiswa03("244160131", "Devi", "A", 3.48));
        bta.add(new Mahasiswa03("244160205", "Ehsan", "D", 3.61));
        bta.add(new Mahasiswa03("244160170", "Fizi", "B", 3.86));
        
        System.out.println("InOrder Traversal setelah add():");
        bta.traverseInOrder(0);
        
        System.out.println("\nPreOrder Traversal:");
        bta.traversePreOrder(0);
        
        System.out.println("\n--- Test dengan populateData() ---");
        BinaryTreeArray03 bta2 = new BinaryTreeArray03();
        Mahasiswa03 mhs1 = new Mahasiswa03("244160121", "Ali", "A", 3.57);
        Mahasiswa03 mhs2 = new Mahasiswa03("244160185", "Candra", "C", 3.41);
        Mahasiswa03 mhs3 = new Mahasiswa03("244160221", "Badar", "B", 3.75);
        Mahasiswa03 mhs4 = new Mahasiswa03("244160220", "Dewi", "B", 3.35);
        Mahasiswa03 mhs5 = new Mahasiswa03("244160131", "Devi", "A", 3.48);
        Mahasiswa03 mhs6 = new Mahasiswa03("244160205", "Ehsan", "D", 3.61);
        Mahasiswa03 mhs7 = new Mahasiswa03("244160170", "Fizi", "B", 3.86);

        Mahasiswa03[] dataMahasiswa = { mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null };
        int idxLast = 6;
        bta2.populateData(dataMahasiswa, idxLast);
        
        System.out.println("InOrder Traversal dengan populateData():");
        bta2.traverseInOrder(0);
        
        System.out.println("\nPreOrder Traversal dengan populateData():");
        bta2.traversePreOrder(0);
    }
}
