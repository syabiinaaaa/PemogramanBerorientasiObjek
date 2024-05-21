package Pertemuan12;

import Pertemuan12.InterfacePesan.Pesan;

public class Barang implements Pesan {
	protected String nama;
	protected double harga;
	
	public Barang (String nama, double harga) {
		this.nama = nama;
		this.harga = harga;
	}
	
	public void tampilkanInfo() {
	}
	
	@Override
	public void pesan() {
	}
	
	@Override
	public void batal() {
		
	}

}

