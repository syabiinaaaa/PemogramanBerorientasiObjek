package Pertemuan12;

public class InterfaceMain {

	public class interfaceMain{
		public static void main(String[] args) {
			KartuElektronik kartu = new KartuElektronik("if111", "123");
			System.out.println("Otentikasi : " + kartu.otentikasi("123"));
		}
	}
}
