
public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga() {
        return harga * jumlah * 2;
    }

    @Override
    public String toString() {
        return "KueJadi - " + super.toString() + ", Jumlah: " + jumlah + ", Total Harga: " + hitungHarga();
    }

    public double getJumlah() {
        return jumlah;
    }
}
