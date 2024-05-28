import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

class Guest {
    private String nama;
    private int umur;
    private String nik;
    private int jumlahRuangan;
    private final double harga = 500000.0;

    public Guest(String name, int umur, String nik, int jumlahRuangan) {
        this.nama = name;
        this.umur = umur;
        this.nik = nik;
        this.jumlahRuangan = jumlahRuangan;
    }

    public void hitungTotal() {
        double hargaAwal = harga * jumlahRuangan;
        double diskon = 0;
        double totalDiskon = 0;

        if (jumlahRuangan > 10) {
            diskon = 0.35;
        } else if (jumlahRuangan > 5) {
            diskon = 0.20;
        } else if (jumlahRuangan > 2) {
            diskon = 0.10;
        }

        totalDiskon = hargaAwal * diskon;

        Locale IND = new Locale("id", "ID");
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(IND);

        System.out.println("--------------------------------------------------");
        System.out.println("Nama Tamu: " + nama);
        System.out.printf("Harga Asli: %s\n", rupiah.format(hargaAwal));
        if (diskon > 0) {
            System.out.printf("Diskon Diterima: %d%%\n", Math.round(diskon * 100));
            System.out.printf("Potongan Harga: %s\n", rupiah.format(totalDiskon));
        } else {
            System.out.println("Tidak mendapatkan diskon");
        }
        System.out.printf("Total Tagihan: %s\n", rupiah.format(hargaAwal - totalDiskon));
    }
}

public class BGH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        for (int i = 1; i <= n; i++) {
            String name = in.nextLine();
            int umur = Integer.parseInt(in.nextLine());
            String nik = in.nextLine();
            int room = Integer.parseInt(in.nextLine());

            Guest temp = new Guest(name, umur, nik, room);
            temp.hitungTotal();
        }
        System.out.println("--------------------------------------------------");
    }
}