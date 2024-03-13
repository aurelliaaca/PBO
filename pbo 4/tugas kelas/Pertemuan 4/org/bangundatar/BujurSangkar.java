/**
 * File : BujurSangkar.java 15/03/2023
 * Penulis : Fauzan Ramadhan Putra (24060121140140)
 * Deskripsi : representasi dasar dari objek bujur sangkar, turunan kelas poligon
 */

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas(){
		return panjangSisi * panjangSisi;
	}
	
	public double getPanjangSisi(){
		 return this.panjangSisi;
	}
}

