package latihan.BiayaEmasKawin;

/*
 * @author Raihan Giffari
 *
 * Nama  : Raihan Giffari
 * Nim   : 10119008
 * Kelas : IF1
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Emas emas = new Emas();
        System.out.println("Program Perhitungan harga Emas");
        System.out.print("Masukkan berat (gram) : ");
        emas.setTotalBerat(scan.nextDouble());
        emas.tampilHasil(emas.hitungTotal(emas.getTotalBerat()));
    }
}
