package Pertemuan7;

public class Mahasiswa {
	private String NRP;
	private String nama;
	
	public Mahasiswa() {
	}
	
	public Mahasiswa(String nrp, String nama) {
		
		super();
		NRP = nrp;
		this.nama = nama;
	}
	
	public String display() {
		return "NRP:" +NRP+ ", Nama: "+ nama; 
	}

}
