package com.belajar.java.entity;

public class OrderDetail {

	private String namaBarang;
	private int hargaSatuan;
	private int jumlah;
	private int totalHarga;

	public OrderDetail(String namaBarang, int hargaSatuan, int jumlah) {
		this.namaBarang = namaBarang;
		this.hargaSatuan = hargaSatuan;
		this.jumlah = jumlah;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public int getHargaSatuan() {
		return hargaSatuan;
	}

	public void setHargaSatuan(int hargaSatuan) {
		this.hargaSatuan = hargaSatuan;
	}

	public int getJumlah() {
		return jumlah;
	}

	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}

	public int getTotalHarga() {
		return totalHarga;
	}

	public void setTotalHarga(int totalHarga) {
		this.totalHarga = totalHarga;
	}

}
