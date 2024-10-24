import java.util.Scanner;

public class BungalowRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double totalPendapatan = 0.0;
        int jumlahTransaksi = 0;
        boolean inputLagi = true;

        while (inputLagi) {
            System.out.print("Masukan kode bungalow [1/2/3]: ");
            int kodeBungalow = scanner.nextInt();
            double tarifPerMalam = 0.0;
            double biayaPelayananPersentase = 0.0;

            // Menentukan tarif per malam dan biaya pelayanan berdasarkan kode bungalow
            switch (kodeBungalow) {
                case 1:
                    tarifPerMalam = 50000;
                    biayaPelayananPersentase = 0.30;
                    break;
                case 2:
                    tarifPerMalam = 40000;
                    biayaPelayananPersentase = 0.20;
                    break;
                case 3:
                    tarifPerMalam = 30000;
                    biayaPelayananPersentase = 0.10;
                    break;
                default:
                    System.out.println("Kode bungalow tidak valid. Silakan coba lagi.");
                    continue; // Kembali ke awal loop jika kode tidak valid
            }

            System.out.print("Lama menginap (malam): ");
            int lamaMenginap = scanner.nextInt();
            
            // Menghitung biaya menginap, biaya pelayanan, dan total biaya
            double biayaMenginap = lamaMenginap * tarifPerMalam;
            double biayaPelayanan = biayaMenginap * biayaPelayananPersentase;
            double totalBiaya = biayaMenginap + biayaPelayanan;

            // Update total pendapatan dan jumlah transaksi
            totalPendapatan += totalBiaya;
            jumlahTransaksi++;

            System.out.print("Input lagi (Y/N)?: ");
            char input = scanner.next().charAt(0);
            inputLagi = (input == 'Y' || input == 'y');
        }

        // Menampilkan hasil
        System.out.println("Jumlah transaksi penyewaan bungalow = " + jumlahTransaksi);
        System.out.printf("Total pendapatan = %.1f\n", totalPendapatan);
        
        scanner.close();
    }
}
