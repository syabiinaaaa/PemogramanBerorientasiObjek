package Pertemuan12;

public class Main {
	public static void main (String[] args) {
		Lingkaran lingkaran = new Lingkaran(10);
		System.out.println("== Lingkaran ==");
		System.out.println("Jari2 : " + lingkaran.getJari2());
		System.out.println("Luas : " + lingkaran.luas());
		
		Tabung tabung = new Tabung(10, 5);
		System.out.println("== Tabung ==");
		System.out.println("jari2 : " + tabung.getJari2()+ "Tinggi : " + tabung.getTinggi());
		System.out.println("luas: " + tabung.luas());
	}
}
