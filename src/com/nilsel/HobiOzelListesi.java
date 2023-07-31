package com.nilsel;

public class HobiOzelListesi {

	boolean[][] hobiListesi = new boolean[2][4];
	int boyut = 0;

	public void add(boolean[] hobiler) {

		if (boyut >= hobiListesi.length) {

			// Hobi listesi boyutu yetmiyorsa, yeni bir büyük dizi oluşturup eski verileri
			// kopyala

			boolean[][] tmp = new boolean[boyut + 1][hobiler.length];

			for (int i = 0; i < boyut; i++) {
				tmp[i] = hobiListesi[i];
			}

			tmp[boyut] = hobiler;
			hobiListesi = tmp;
		} else {

			// Hobi listesi boyutu yeterliyse doğrudan verileri ekleyebiliriz
			hobiListesi[boyut] = hobiler;
		}

		boyut++; // Toplam kişi sayısını artır
	}

}
