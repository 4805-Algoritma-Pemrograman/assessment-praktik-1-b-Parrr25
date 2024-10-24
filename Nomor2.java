import java.util.Scanner;

public class bungalow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahTransaksi = 0;
        double totalPendapatan = 0.0;
        String lagi;

        do {
            // Input kode bungalow dan lama menginap
            System.out.print("Masukan kode bungalow [1/2/3]: ");
            int kode = input.nextInt();
            System.out.print("Lama menginap (malam): ");
            int lamaInap = input.nextInt();

            // Tambahan input.nextLine() untuk membersihkan buffer
            input.nextLine();

            // Variabel tarif per malam dan persen biaya pelayanan
            double tarif = 0.0;
            double persenBiayaPelayanan = 0.0;

            // Menentukan tarif dan persen biaya pelayanan berdasarkan kode bungalow
            switch (kode) {
                case 1:
                    tarif = 50000;
                    persenBiayaPelayanan = 0.30;
                    break;
                case 2:
                    tarif = 40000;
                    persenBiayaPelayanan = 0.20;
                    break;
                case 3:
                    tarif = 30000;
                    persenBiayaPelayanan = 0.10;
                    break;
                default:
                    System.out.println("Kode bungalow tidak valid.");
                    continue; // Kembali ke awal jika kode tidak valid
            }

            // Menghitung biaya menginap, biaya pelayanan, dan total biaya
            double biayaMenginap = lamaInap * tarif;
            double biayaPelayanan = biayaMenginap * persenBiayaPelayanan;
            double totalBiaya = biayaMenginap + biayaPelayanan;

            // Menambahkan total pendapatan dan jumlah transaksi
            totalPendapatan += totalBiaya;
            jumlahTransaksi++;

            // Output hasil transaksi
            System.out.println("Biaya menginap: " + biayaMenginap);
            System.out.println("Biaya pelayanan: " + biayaPelayanan);
            System.out.println("Total biaya: " + totalBiaya);

            // Tanya apakah ingin input lagi
            System.out.print("Input lagi (Y/N)? ");
            lagi = input.nextLine().toLowerCase();

        } while (lagi.equals("y"));

        // Output total transaksi dan pendapatan
        System.out.println("Jumlah transaksi penyewaan bungalow = " + jumlahTransaksi);
        System.out.println("Total pendapatan = " + totalPendapatan);

        input.close();
    }
}
