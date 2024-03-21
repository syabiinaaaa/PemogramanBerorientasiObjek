package Pertemuan7;

public class Matakuliah {
	private String kode;
	private String nama;
	private String index;
	private int sks;
	
	public Matakuliah(String kode, String nama, String index, int sks) {
		
		super();
		this.kode = kode;
		this.nama = nama;
		this.index = index;
		this.sks = sks;
	}
	
	public int getSks() {
		return sks;
	}
	
	public double nilaiIndex() {
		double nilai = 0;
		switch(index) {
		case "A": nilai = 4;
				  break;
		case "AB": nilai = 3.5;
				  break;
		case "B": nilai = 3;
				  break;
		case "BC": nilai = 2.5;
				   break;
		case "C": nilai = 2;
				  break;
		case "D": nilai = 1;
				  break;
		}
		
		return nilai;
	}

	public String display() {
		return kode + " - "+ nama + " - "+ index;
	}

}
