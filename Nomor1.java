import java.util.Scanner;

public class KomisiSalesman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Total penjualan salesman: ");
        int totalPenjualan = scanner.nextInt();

        double komisi = hitungKomisi(totalPenjualan);

        System.out.println("Komisi yang didapatkan = " + komisi);
    }

    public static double hitungKomisi(int totalPenjualan) {
        double komisi = 0;

        if (totalPenjualan <= 500000) {
            komisi = totalPenjualan * 0.1;
        } else {
            komisi = 500000 * 0.1 + (totalPenjualan - 500000) * 0.15;
        }

        return komisi;
    }
}
