public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KuePesanan("Lapis Legit", 10000, 2);
        daftarKue[1] = new KueJadi("Donat", 5000, 4);
        daftarKue[2] = new KuePesanan("Brownies", 12000, 1.5);
        daftarKue[3] = new KueJadi("Bolu Kukus", 4000, 6);
        daftarKue[4] = new KuePesanan("Cheesecake", 15000, 2);
        daftarKue[5] = new KueJadi("Kue Cubit", 3000, 5);
        daftarKue[6] = new KuePesanan("Klepon", 6000, 3);
        daftarKue[7] = new KueJadi("Kue Lumpur", 3500, 7);
        daftarKue[8] = new KuePesanan("Tiramisu", 20000, 1);
        daftarKue[9] = new KueJadi("Kastengel", 8000, 4);
        daftarKue[10] = new KuePesanan("Pukis", 7000, 1.2);
        daftarKue[11] = new KueJadi("Nastar", 10000, 3);
        daftarKue[12] = new KuePesanan("Donat Keju", 9000, 1.5);
        daftarKue[13] = new KueJadi("Martabak Mini", 4500, 5);
        daftarKue[14] = new KuePesanan("Red Velvet", 18000, 1);
        daftarKue[15] = new KueJadi("Pie Buah", 7500, 2);
        daftarKue[16] = new KuePesanan("Kue Lumpur Coklat", 8500, 2.3);
        daftarKue[17] = new KueJadi("Kue Pepe", 2500, 6);
        daftarKue[18] = new KuePesanan("Opera Cake", 22000, 1.1);
        daftarKue[19] = new KueJadi("Roll Cake", 9500, 2);

        double totalHarga = 0;
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;

        Kue kueTermahal = daftarKue[0];

        for (Kue kue : daftarKue) {
            System.out.println(kue);

            double hargaAkhir = kue.hitungHarga();
            totalHarga += hargaAkhir;

            if (kue instanceof KuePesanan) {
                totalHargaPesanan += hargaAkhir;
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            } else if (kue instanceof KueJadi) {
                totalHargaJadi += hargaAkhir;
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }

            if (hargaAkhir > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }

        System.out.println("\nTotal Harga Semua Kue: " + totalHarga);
        System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan);
        System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi);
        System.out.println("\nKue dengan Harga Terbesar:\n" + kueTermahal);
    }
}