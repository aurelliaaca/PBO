class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0): "jari-jari tidak boleh negatif dan nol";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

// mengganti output menjadi "jari-jari tidak boleh negatif dan nol"