import java.util.Arrays;

public class AntrianPajak {
    private TransaksiPajak[] daftarTransaksi;
    private int jumlahTransaksi;

    public AntrianPajak(int kapasitas) {
        this.daftarTransaksi = new TransaksiPajak[kapasitas];
        this.jumlahTransaksi = 0;
    }

    public TransaksiPajak[] getDaftarTransaksi() {
        return daftarTransaksi;
    }

    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }

    public void tambahTransaksi(TransaksiPajak transaksi) {
        if (jumlahTransaksi < daftarTransaksi.length) {
            daftarTransaksi[jumlahTransaksi] = transaksi;
            jumlahTransaksi++;
        } else {
            System.out.println("Antrian sudah penuh, tidak dapat menambahkan transaksi.");
        }
    }

    public void bayarPajak(int kodeTransaksi, long nominalBayar, long denda, int bulanBayar) {
        TransaksiPajak transaksi = cariTransaksi(kodeTransaksi);
        if (transaksi != null) {
            transaksi.setNominalBayar(nominalBayar);
            transaksi.setDenda(denda);
            transaksi.setBulanBayar(bulanBayar);
            System.out.println("Pembayaran pajak berhasil dilakukan.");
        } else {
            System.out.println("Transaksi tidak ditemukan.");
        }
    }

    public void tampilkanInformasi() {
        System.out.println("Daftar Transaksi:");
        for (int i = 0; i < jumlahTransaksi; i++) {
            System.out.println(daftarTransaksi[i]);
        }
    }

    public TransaksiPajak cariTransaksi(int kodeTransaksi) {
        for (int i = 0; i < jumlahTransaksi; i++) {
            if (daftarTransaksi[i].getKode() == kodeTransaksi) {
                return daftarTransaksi[i];
            }
        }
        return null;
    }
}
