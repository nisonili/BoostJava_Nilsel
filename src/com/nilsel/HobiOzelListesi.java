package com.nilsel;

public class HobiOzelListesi {

	String[] hobiListesi;
	int boyut = 0;

	public void add(String hobi) {

		if (hobiListesi == null) {
			hobiListesi = new String[1]; //
			hobiListesi[0] = hobi;
		} // if

		else {
			String[] tmp = new String[boyut + 1]; // listenin kapasitesi +1

			for (int i = 0; i < boyut; i++) {
				tmp[i] = hobiListesi[i];
			}

			tmp[boyut] = hobi;

			hobiListesi = tmp;

		} // for

		boyut++;
	}// add_methodu

	public String list(int sayi) {

		return (hobiListesi[sayi]);

	}

}
