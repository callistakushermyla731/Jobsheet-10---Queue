package TugasJobsheet10;

import java.util.Scanner;

import TugasJobsheet10.Mahasiswa04;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);

        int pilih;
        do {
            System.out.println("\n=== MENU KRS ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Jumlah Sudah Proses");
            System.out.println("8. Sisa Belum Proses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();

                    antrian.enqueue(new Mahasiswa04(nim, nama, prodi));
                    break;

                case 2:
                    antrian.dequeue2();
                    break;

                case 3:
                    antrian.print();
                    break;

                case 4:
                    antrian.peek2Depan();
                    break;

                case 5:
                    antrian.peekBelakang();
                    break;

                case 6:
                    antrian.jumlahAntrian();
                    break;

                case 7:
                    antrian.jumlahProses();
                    break;

                case 8:
                    antrian.sisaBelumProses();
                    break;

                case 9:
                    antrian.clear();
                    break;
            }
        } while (pilih != 0);
    }
}


