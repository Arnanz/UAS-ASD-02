public class Kendaraan {
    String noTNKB;
    String nama;
    String jenis;
    int cc;
    int tahun;
    int bulanHarusBayar;

    public Kendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }
    public String toString() {
        return "Kendaraan{" +
                "noTNKB='" + noTNKB + '\'' +
                ", nama='" + nama + '\'' +
                ", jenis='" + jenis + '\'' +
                ", cc=" + cc +
                ", tahun=" + tahun +
                ", bulanHarusBayar=" + bulanHarusBayar +
                '}';
    }
}
