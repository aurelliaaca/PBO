public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    static double counterGaris;

    //konstruktor
    public Garis(){
      titikAwal = new Titik();
      titikAkhir = new Titik();
      counterGaris++;
    }
  
    public Garis(Titik titikAwal, Titik titikAkhir){
      this.titikAwal = titikAwal;
      this.titikAkhir = titikAkhir;
      counterGaris++;
    }
    
    //method getter dan setter
    public Titik getTitikAwal(){
      return this.titikAwal;
    }
  
    public Titik getTitikAkhir(){
      return this.titikAkhir;
    }
  
    static double getCounterGaris(){
      return counterGaris;
    }
  
    public void setTitikAwal(Titik titikAwal){
      this.titikAwal = titikAwal;
    }
  
    public void setTitikAkhir(Titik titikAkhir){
      this.titikAkhir = titikAkhir;
    }

    public double getPanjang(){
      double absis = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
      double ordinat = titikAkhir.getAbsis() - titikAwal.getAbsis();
      return Math.sqrt((absis*absis) + (ordinat*ordinat));
    }

    public double getGradien(){
      return titikAkhir.getOrdinat() - titikAwal.getOrdinat() / titikAkhir.getAbsis() - titikAwal.getAbsis();
    }

    public Garis getRefleksiY(){
      Titik titikAwalRefleksi = titikAwal.getRefleksiY();
      Titik titikAkhirRefleksi = titikAkhir.getRefleksiY();
      return new Garis(titikAwalRefleksi, titikAkhirRefleksi); 
    }

    public boolean isTegakLurus(Garis G){
      return getGradien() * G.getGradien() == -1;
    }
  }