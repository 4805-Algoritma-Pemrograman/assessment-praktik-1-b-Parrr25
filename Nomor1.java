
import java.util.Scanner;

public class Komisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input total penjualan
        System.out.print("Total penjualan salesman: ");
        double totalPenjualan = input.nextDouble();
        
        double komisi = 0.1;
        double batasPenjualan = 500000;
        
        // Jika total penjualan kurang dari atau sama dengan 500.000
        if (totalPenjualan <= batasPenjualan) {
            komisi = totalPenjualan * 0.10;
        } else {
            // Komisi untuk 500.000 pertama
            komisi = batasPenjualan * 0.1;
            // Komisi untuk sisa penjualan di atas 500.000
            komisi += (totalPenjualan - batasPenjualan) * 0.15;
        }
        
        // Menampilkan hasil komisi
        System.out.println("Total penjualan salesman: " + totalPenjualan);
        System.out.println("Komisi yang didapatkan = " + komisi);
        
        input.close();
    }
}
