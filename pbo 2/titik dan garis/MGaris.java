public class MGaris{
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Garis g1;

        t1 = new Titik();
        t2 = new Titik();
        g1 = new Garis(t1,t2);

        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);

        double counterGaris = Garis.getCounterGaris();
        System.out.println("jumlah objek garis : " + counterGaris);

        System.out.println("Panjang garis g1 : " + g1.getPanjang());

        System.out.println("Gradien g1 : " + g1.getGradien());
        
        Garis g2 = g1.getRefleksiY();
        Titik awalRefleksi = g2.getTitikAwal();
        Titik akhirRefleksi = g2.getTitikAkhir();
        System.out.println("Refleksi Y : awal g2(" + awalRefleksi.getAbsis() +","+ awalRefleksi.getOrdinat()+")");
        System.out.println("Refleksi Y : akhir g2(" + akhirRefleksi.getAbsis() +","+ akhirRefleksi.getOrdinat()+")");

        System.out.println("Is tegak lurus : " + isTegakLurus(g2));
    }
}