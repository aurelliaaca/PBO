package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        // Untuk contoh sederhana, kita anggap segitiga adalah sembarang
        // Sehingga, kita tidak memiliki informasi sisi-sisi lainnya
        // Anda bisa menyesuaikan dengan segitiga yang spesifik
        return -1;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
