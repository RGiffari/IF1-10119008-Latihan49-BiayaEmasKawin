package latihan.BiayaEmasKawin;

public class Emas {
    private static double harga = 570000;
    private double totalBerat;

    public void setTotalBerat(double totalBerat) {
        this.totalBerat = totalBerat;
    }

    public double getTotalBerat() {
        return totalBerat;
    }

    public double hitungTotal(double totalBerat){
        return harga * totalBerat;
    }

    public void tampilHasil(double totalHarga){
        System.out.println("harga emas : "+harga);
        System.out.println("total harga : "+totalHarga);
    }
}
