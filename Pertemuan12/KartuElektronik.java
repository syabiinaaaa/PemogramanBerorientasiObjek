package Pertemuan12;

import Pertemuan12.Kartu.kartu;

public class KartuElektronik implements kartu {
	private String kodeBank, pin;
	
	public KartuElektronik(String kodeBank, String pin) {
		super();
		this.kodeBank = kodeBank;
		this.pin = pin;
	}
	
	public boolean otentikasi1(String pinInput) {
		if(pin.equals(pinInput))
			return true;
		else
			return false;
	}
	
	public String encode(String pin) {
		return null;
	}

	@Override
	public boolean otentikasi(String pin) {
		// TODO Auto-generated method stub
		return false;
	}

}


