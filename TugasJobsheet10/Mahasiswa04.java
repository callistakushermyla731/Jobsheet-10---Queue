package TugasJobsheet10;

public class Mahasiswa04 {
    String nim, nama, prodi;

    public Mahasiswa04(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampil() {
        System.out.println(nim + " | " + nama + " | " + prodi);
    }
}
