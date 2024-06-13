import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int KAPASITAS_ANTRIAN = 100; // Misalnya kita tentukan kapasitas antrian maksimal 100 transaksi
        AntrianPajak antrianPajak = new AntrianPajak(KAPASITAS_ANTRIAN);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Masukkan Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan transaksi berdasarkan nama pemilik");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    masukkanKendaraan(scanner, antrianPajak);
                    break;
                case 2:
                    BayarPajak.bayarPajak(scanner, antrianPajak);
                    break;
                case 3:
                    TampilkanTransaksi.tampilkanTransaksi(antrianPajak);
                    break;
                case 4:
                    urutkanTransaksiNamaPemilik(antrianPajak);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void masukkanKendaraan(Scanner scanner, AntrianPajak antrianPajak) {
        System.out.println("Masukkan informasi kendaraan:");
        System.out.print("No. TNKB: ");
        String noTNKB = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis: ");
        String jenis = scanner.nextLine();
        System.out.print("CC: ");
        int cc = scanner.nextInt();
        System.out.print("Tahun: ");
        int tahun = scanner.nextInt();
        System.out.print("Bulan harus bayar: ");
        int bulanHarusBayar = scanner.nextInt();

        Kendaraan kendaraan = new Kendaraan(noTNKB, nama, jenis, cc, tahun, bulanHarusBayar);
        TransaksiPajak transaksi = new TransaksiPajak(antrianPajak.getJumlahTransaksi() + 1, 0, 0, 0, kendaraan);

        antrianPajak.tambahTransaksi(transaksi);

        System.out.println("Kendaraan berhasil dimasukkan.");
    }

    public static void urutkanTransaksiNamaPemilik(AntrianPajak antrianPajak) {
        TransaksiPajak[] daftarTransaksi = antrianPajak.getDaftarTransaksi();

        for (int i = 0; i < antrianPajak.getJumlahTransaksi() - 1; i++) {
            for (int j = 0; j < antrianPajak.getJumlahTransaksi() - i - 1; j++) {
                if (daftarTransaksi[j].getKendaraan().getNama().compareTo(daftarTransaksi[j + 1].getKendaraan().getNama()) > 0) {
                
                    TransaksiPajak temp = daftarTransaksi[j];
                    daftarTransaksi[j] = daftarTransaksi[j + 1];
                    daftarTransaksi[j + 1] = temp;
                }
            }
        }

        System.out.println("Daftar Transaksi setelah diurutkan berdasarkan nama pemilik:");
        for (TransaksiPajak transaksi : daftarTransaksi) {
            if (transaksi != null) {
                System.out.println(transaksi);
            }
        }
    }
}
