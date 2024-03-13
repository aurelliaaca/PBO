/**
 * File : Kubus.java 15/03/2023
 * Penulis : Fauzan Ramadhan Putra (24060121140140)
 * Deskripsi : representasi dasar dari objek kubus
 */

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan){
		this.permukaan = permukaan;
	}
	
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi * panjangSisi;
	}
	
	public double hitungLuasAlas(){
		double luasAlas = permukaan.hitungLuas();
		return luasAlas;
	}
}