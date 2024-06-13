public class TransaksiPajak {
    int kode;
    long nominalBayar;
    long denda;
    int bulanBayar;
    Kendaraan kendaraan;

    public TransaksiPajak(int kode, long nominalBayar, long denda, int bulanBayar, Kendaraan kendaraan) {
        this.kode = kode;
        this.nominalBayar = nominalBayar;
        this.denda = denda;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;
    }
    public void setNominalBayar(long nominalBayar) {
        this.nominalBayar = nominalBayar;
    }

    public void setDenda(long denda) {
        this.denda = denda;
    }

    public void setBulanBayar(int bulanBayar) {
        this.bulanBayar = bulanBayar;
    }

    public int getKode() {
        return kode;
    }

    public long getNominalBayar() {
        return nominalBayar;
    }

    public long getDenda() {
        return denda;
    }

    public int getBulanBayar() {
        return bulanBayar;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }
}
