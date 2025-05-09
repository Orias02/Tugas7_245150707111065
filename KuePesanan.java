public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    @Override
    public double hitungHarga() {
        return harga * berat;
    }

    @Override
    public String toString() {
        return "KuePesanan - " + super.toString() + ", Berat: " + berat + ", Total Harga: " + hitungHarga();
    }

    public double getBerat() {
        return berat;
    }
}