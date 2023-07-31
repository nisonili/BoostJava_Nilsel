package com.nilsel;

public class OgrenciOzelListesi {

	String[] ogrenciListesi;
	int boyut = 0;

	/**
	 * Aldığımız öğrenci bilgilerini kaydedelim:
	 * 
	 */
	public void add(String ogrenci) {

		if (ogrenciListesi == null) {
			ogrenciListesi = new String[1]; // {ilk ogr.}
			ogrenciListesi[0] = ogrenci;
		} // if

		else {
			String[] tmp = new String[boyut + 1]; // listenin kapasitesi +1

			for (int i = 0; i < boyut; i++) {
				tmp[i] = ogrenciListesi[i];
			}

			tmp[boyut] = ogrenci;
			ogrenciListesi = tmp;

		} // for

		boyut++;
	}// add_methodu

	public int length() {

		return boyut;

	}

	/**
	 * diziyi listeleyecek
	 * 
	 */

	public String list(int sayi) {

		return (ogrenciListesi[sayi]);

	}

}
