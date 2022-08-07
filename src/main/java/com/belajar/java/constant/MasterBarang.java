package com.belajar.java.constant;

public enum MasterBarang {
	// TODO : code here
	NASI_GORENG("Nasi Goreng", 15000), ES_TEH("Es Teh", 5000);

	private String namaBarang;
	private int hargaSatuan;

	private MasterBarang(String namaBarang, int hargaSatuan) {
		this.namaBarang = namaBarang;
		this.hargaSatuan = hargaSatuan;
	}

	public int getHargaSatuan() {
		return hargaSatuan;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

}
