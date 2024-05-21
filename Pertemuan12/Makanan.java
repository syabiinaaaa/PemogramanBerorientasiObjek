package Pertemuan12;

public class Makanan extends Barang{
	private String jumlah;
	
	public Makanan(String nama, double harga, String jumlah) {
		super(nama, harga);
		this.jumlah = jumlah;
	}
	
	@Override
	public void pesan() {
		System.out.println("Makanan: " + nama + " Berhasil dipesan.");
	}
	
	@Override
	public void batal() {
		System.out.println("Riwayat Pemesanan " + nama + " dibatalkan.");
	}

	@Override
	public void tampilkanInfo() {
		System.out.println("Makanan " + nama);
		System.out.println("Harga: IDR  " + harga);
		System.out.println("Jumlah " + jumlah);
	}
}
