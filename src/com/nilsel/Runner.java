package com.nilsel;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		OgrenciOzelListesi ogrenciList = new OgrenciOzelListesi();

		HobiOzelListesi hobiList = new HobiOzelListesi();

		MaasOzelListesi maasList = new MaasOzelListesi();

		boolean status = true;

		while (status) {

			System.out.println("***************************");
			System.out.println();
			System.out.println("** ÖĞRENCİ BİLGİ SİSTEMİ **");
			System.out.println();
			System.out.println("***************************");
			System.out.println();
			System.out.println("1- Sınıf Arkadaşı Tanımla");
			System.out.println("2- Hobilerini Gir");
			System.out.println("3- Maaş Beklentilerini Gir");
			System.out.println("4- Sınıf Listesi");
			System.out.println("0- Ç I K I Ş");
			System.out.println();

			System.out.print("Seçiniz......: ");
			int secim = sc.nextInt();

			sc.nextLine();

			switch (secim) {

			case 1:

				System.out.print("Kaç öğrenci tanımlayacaksınız?....: ");

				int ogrenciSayisi = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < ogrenciSayisi; i++) {

					System.out.print((i + 1) + ". öğrenci ismi giriniz: ");

					String isim = sc.nextLine();

					ogrenciList.add(isim);
				}

				break;

			case 2:

				System.out.println("Kimin hobileri?");
				String hobiSecim = sc.nextLine();

				for (int j = 0; j < ogrenciList.length(); j++) {
					if (hobiSecim.equals(ogrenciList.list(j))) {

						break; // tekrar dönmemesi için
					}
				}

				System.out.println("Yürümekten hoşlanır mısın[E/H]?:");
				String cevap1 = sc.nextLine();
				if (cevap1.equalsIgnoreCase("E")) {

					hobiList.add("Yürümek");
				}

				System.out.println("Kitap okumaktan hoşlanır mısın[E/H]?:");
				String cevap2 = sc.nextLine();
				if (cevap2.equalsIgnoreCase("E")) {

					hobiList.add("Kitap okumak");
				}
				System.out.println("Spor rutinlerin var mı[E/H]?:");
				String cevap3 = sc.nextLine();
				if (cevap3.equalsIgnoreCase("E")) {

					hobiList.add("Spor");
				}
				System.out.println("Kod yazmaktan hoşlanır mısın[E/H]?:");
				String cevap4 = sc.nextLine();

				if (cevap4.equalsIgnoreCase("E")) {

					hobiList.add("Kod yazmak");
				}

				else {

					System.out.println("Bu isimde bir öğrenci bulunamadı.");
				}

				break;

			case 3:

				System.out.println("Maaş beklentilerini giriniz:");

				double[] maasDizi = new double[4];

				for (int i = 0; i < ogrenciList.length(); i++) {
					System.out.print((ogrenciList.list(i)) + "nin maaş beklentisi : ");
					double maas = sc.nextDouble();
					maasDizi[i] = maas;
					maasList.add(maas);

				}

				break;

			case 4:

				System.out.println("No\t Adı\t Hobileri\t Maas Beklentisi");

				for (int i = 0; i < ogrenciList.length(); i++) {

					System.out.println(
							i + "\t" + ogrenciList.list(i) + "\t" + hobiList.list(i) + "\t\t" + maasList.list(i));

				}

				break;

			case 0:

				status = false;

				System.err.println("Çıkış yapıldı");

			default:
				System.out.println("Lütfen geçerli bir seçim yapınız!");

				break;

			} // switch

		} // while
		sc.close();
	}

}
