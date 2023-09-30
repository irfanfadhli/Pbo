import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gajiDasar;
        double jamKerjaLembur;
        double gajiTotal;

        System.out.print("Masukkan gaji dasar karyawan: ");
        gajiDasar = scanner.nextDouble();
        System.out.print("Masukkan jumlah jam kerja lembur: ");
        jamKerjaLembur = scanner.nextDouble();

        // Hitung gaji total dengan tambahan lembur
        gajiTotal = gajiDasar + (jamKerjaLembur * 15); // Misalnya, tarif lembur per jam adalah 15.

        System.out.println("Gaji total karyawan adalah: " + gajiTotal);
    }
}
