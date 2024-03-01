public class MTitik{
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik();

        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);
        t3.setAbsis(5);
        t3.setOrdinat(6);

        float counterTitik;
        float absis;
        float ordinat;

        counterTitik = Titik.getCounterTitik();
        System.out.println("jumlah objek titik : " + counterTitik);

        absis = t1.getAbsis();
        ordinat = t1.getOrdinat();
        System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);

        absis = t2.getAbsis();
        ordinat = t2.getOrdinat();
        System.out.printf("t2(%.1f, %.1f)\n", absis, ordinat);

        absis = t3.getAbsis();
        ordinat = t3.getOrdinat();
        System.out.printf("t3(%.1f, %.1f)\n", absis, ordinat);

        System.out.printf("jarak pusat titik : %.2f \n", t1.getJarakPusat());

        t3.refleksiX();
        t3.refleksiY();
        System.out.printf("Setelah refleksi : (%.1f, %.1f)\n", t3.getAbsis(), t3.getOrdinat());

        Titik t4 = t2.getRefleksiX();
        System.out.printf("Refleksi X : t4(%.1f, %.1f)\n", t4.getAbsis(), t4.getOrdinat());

        Titik t5 = t2.getRefleksiY();
        System.out.printf("Refleksi Y : t5(%.1f, %.1f)\n", t5.getAbsis(), t5.getOrdinat());


    }
}