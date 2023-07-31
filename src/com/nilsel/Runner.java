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

				boolean hobiDizi[][] = null;
				int hobiIndex = -1;

				for (int j = 0; j < ogrenciList.length(); j++) {
					if (hobiSecim.equals(ogrenciList.list(j))) {
						hobiDizi = new boolean[j][4];
						hobiIndex = j;
						break; // tekrar dönmemesi için
					}
				}

				if (hobiIndex != -1) {
					System.out.println("Yürümekten hoşlanır mısın[E/H]?:");
					String cevap1 = sc.nextLine();
					hobiDizi[hobiIndex][0] = cevap1.equalsIgnoreCase("E");

					// ----------
					System.out.println("Kitap okumaktan hoşlanır mısın[E/H]?:");
					String cevap2 = sc.nextLine();
					hobiDizi[hobiIndex][1] = cevap2.equalsIgnoreCase("E");

					// ----------
					System.out.println("Spor rutinlerin var mı[E/H]?:");
					String cevap3 = sc.nextLine();
					hobiDizi[hobiIndex][2] = cevap3.equalsIgnoreCase("E");

					// ----------
					System.out.println("Kod yazmaktan hoşlanır mısın[E/H]?:");
					String cevap4 = sc.nextLine();
					hobiDizi[hobiIndex][3] = cevap4.equalsIgnoreCase("E");
				} else {
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

				System.out.println(" Ad\t| Hobileri\t\t| Maaş Beklentisi");

				for (int i = 0; i < ogrenciList.length(); i++) {

					System.out.print(ogrenciList.list(i));
					System.out.println();

					// System.out.println(hobiList.list(i));
					// System.out.println();

					System.out.println(maasList.list(i));
					System.out.println();

					System.out.println();
				}
				break;

//
//				System.out.println("Sınıf Listesi:");
//
//				ogrenciList.list();
			}
		}
	}
}
