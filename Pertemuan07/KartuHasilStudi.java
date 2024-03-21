package Pertemuan7;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
	private String semester;
	private double ips;
	private List<Matakuliah> daftarMatakuliah;
	
	public KartuHasilStudi(String semester) {
		
		this.semester = semester;
		this.daftarMatakuliah = new ArrayList<>();
		
	}
	
	public void addMatakuliah(Matakuliah matakuliah) {
		
		daftarMatakuliah.add(matakuliah);
	}
	
	public String display() {
		StringBuilder sb = new StringBuilder();
		for(Matakuliah mk : daftarMatakuliah) {
			sb.append(mk.display());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public List<Matakuliah> getDaftarMatakuliah(){
		return daftarMatakuliah;
	}
	public void hitungIPS() {
		double totalNilai = 0;
		int totalSks = 0;
		for(Matakuliah mk : daftarMatakuliah) {
			double bobot = mk.nilaiIndex()* mk.getSks();
			totalNilai+=bobot;
			totalSks+= mk.getSks();
		}
		
		ips = totalNilai / totalSks;
		
	}
}
