import java.util.Scanner;

public class PenyewaanBungalow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalPendapatan = 0;
        int jumlahTransaksi = 0;
        boolean inputLagi = true;

        while (inputLagi) {
            // Input kode bungalow
            System.out.print("Masukkan kode bungalow [1/2/3]: ");
            int kodeBungalow = scanner.nextInt();
            System.out.print("Lama menginap (malam): ");
            int lamaMenginap = scanner.nextInt();

            double tarifPerMalem = 0;
            double biayaPelayananPersen = 0;

            // Menentukan tarif dan biaya pelayanan berdasarkan kode bungalow
            switch (kodeBungalow) {
                case 1:
                    tarifPerMalem = 50000;
                    biayaPelayananPersen = 0.30; // 30%
                    break;
                case 2:
                    tarifPerMalem = 40000;
                    biayaPelayananPersen = 0.20; // 20%
                    break;
                case 3:
                    tarifPerMalem = 30000;
                    biayaPelayananPersen = 0.10; // 10%
                    break;
                default:
                    System.out.println("Kode bungalow tidak valid.");
                    continue; // Kembali ke awal loop
            }

            // Hitung biaya menginap dan biaya pelayanan
            double biayaMenginap = lamaMenginap * tarifPerMalem;
            double biayaPelayanan = biayaMenginap * biayaPelayananPersen;
            double totalBiaya = biayaMenginap + biayaPelayanan;

            // Update total pendapatan dan jumlah transaksi
            totalPendapatan += totalBiaya;
            jumlahTransaksi++;

            // Tanyakan apakah ingin input lagi
            System.out.print("Input lagi (Y/N)?: ");
            char input = scanner.next().charAt(0);
            inputLagi = (input == 'Y' || input == 'y');
        }

        // Output
        System.out.printf("Jumlah transaksi penyewaan bungalow = %d\n", jumlahTransaksi);
        System.out.printf("Total pendapatan = %.1f\n", totalPendapatan);

        scanner.close();
    }
}
