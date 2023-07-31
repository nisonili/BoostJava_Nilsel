package com.nilsel;

public class MaasOzelListesi {

	double[] maasListesi;
	int boyut = 0;

	/**
	 * Aldığımız maaş bilgilerini kaydedelim:
	 * 
	 */

	public void add(double maasDizi) {

		if (maasListesi == null) {
			maasListesi = new double[1]; // {ilk ogr.}
			maasListesi[0] = maasDizi;
		} // if

		else {
			double[] tmp = new double[boyut + 1]; // listenin kapasitesi +1

			for (int i = 0; i < boyut; i++) {
				tmp[i] = maasListesi[i];
			}

			tmp[boyut] = maasDizi;

			maasListesi = tmp;

		} // for

		boyut++;
	}// add_methodu

	/**
	 * diziyi listeleyecek
	 * 
	 */

	public double list(int sayi) {

		return (maasListesi[sayi]);

	}

} // for
