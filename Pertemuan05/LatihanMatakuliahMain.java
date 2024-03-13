package Tugas_04;

public class LatihanMatakuliahMain {
	public static void main(String[] args) {
		
		LatihanMatakuliah mk1 = new LatihanMatakuliah("001", "Algoritma Pemograman 1", "A", 3);
		LatihanMatakuliah mk2 = new LatihanMatakuliah("002", "Algoritma Pemograman 2", "BC", 3);
		LatihanMatakuliah mk3 = new LatihanMatakuliah("003", "Pemograman Beorientasi Objek", "B", 3);
		
		System.out.println("---- DAFTAR MATAKULIAH ----");
		System.out.println(mk1.display());
		System.out.println(mk2.display());
		System.out.println(mk3.display());
		
		System.out.println("---- Nilai IPK ----");
		double bobotTotal = mk1.nilaiIndex() * mk1.getSks() + mk2.nilaiIndex()* mk2.getSks() + mk3.nilaiIndex()* mk3.getSks();
		int totalSks = mk1.getSks() + mk2.getSks() + mk3.getSks();
		double IPK = bobotTotal / totalSks;
		String format;
		String formattedIpk = String.format("%.2f", IPK);
		System.out.println("IPK: "+formattedIpk);
		
	}

}
