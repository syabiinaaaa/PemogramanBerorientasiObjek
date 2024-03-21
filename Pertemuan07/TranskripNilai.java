package Pertemuan7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
	
	private Date tglCetak;
	private double ipk;
	private List<KartuHasilStudi> kartuHasilStudi;
	private Mahasiswa mahasiswa;
	
	public TranskripNilai(Mahasiswa mahasiswa) {
		
		super();
		this.mahasiswa = mahasiswa;
		
		kartuHasilStudi = new ArrayList<KartuHasilStudi>();
		tglCetak = new Date();
	}
	
	public void hitungIPK() {
		double totalNilai = 0;
		int totalSks = 0;
		for(KartuHasilStudi khs : kartuHasilStudi) {
			for(Matakuliah mk : khs.getDaftarMatakuliah()) {
				double bobot = mk.nilaiIndex()* mk.getSks();
				totalNilai+=bobot;
				totalSks+= mk.getSks();
				
			}
			ipk = totalNilai / totalSks;
			
		}
		
	}
	
	public void addKHS(KartuHasilStudi khs) {
		kartuHasilStudi.add(khs);
	}
	
	public void display() {
		hitungIPK();
		
		System.out.println(mahasiswa.display());
		System.out.println("Tanggal Cetak: "+ tglCetak.toString());
		System.out.println("IPK: "+ipk);
		for (KartuHasilStudi khs : kartuHasilStudi) {
			
			System.out.println(khs.display());
		}
	}

}
