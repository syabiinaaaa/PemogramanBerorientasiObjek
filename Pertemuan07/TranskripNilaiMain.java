package Pertemuan7;

public class TranskripNilaiMain {
	
	public static void main(String[] args) {
		
		Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemograman 1", "A", 3);
		Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemograman 2", "AB", 3);
		Matakuliah mk3 = new Matakuliah("003", "Pemograman Berorientasi Objek", "A", 3);
		
		KartuHasilStudi khs = new KartuHasilStudi("20222");
		khs.addMatakuliah(mk1);
		khs.addMatakuliah(mk2);
		khs.addMatakuliah(mk3);
		
		Mahasiswa mhs = new Mahasiswa("223040074", "Syahbrina Dinova");
		
		TranskripNilai transkrip = new TranskripNilai(mhs);
		transkrip.addKHS(khs);
		transkrip.display();
		
	}

}
