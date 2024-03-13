package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(new BujurSangkar(4));
        
        // Inisialisasi segitiga dengan alas dan tinggi yang sesuai
        Segitiga segitiga = new Segitiga(3, 4);
        
        System.out.println("\n");

        double luasAlas = kubus.hitungLuasAlas();
        System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : " + luasAlas);

        double volumeKubus = kubus.hitungVolume();
        System.out.println("Volume Kubus dengan panjang sisi 4 satuan : " + volumeKubus);

        double hitungLuas = segitiga.hitungLuas();
        System.out.println("Luas Segitiga dengan alas 3 dan tinggi 4 satuan : " + hitungLuas);
    }
}
