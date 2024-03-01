public class Titik{
    private float absis;
    private float ordinat;
    private static float counterTitik;

    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(float a, float o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    public void setAbsis(float a){
        absis = a;
    }

    public void setOrdinat(float o){
        ordinat = o;
    }

    public float getAbsis(){
        return absis;
    }

    public float getOrdinat(){
        return ordinat;
    }

    public static float getCounterTitik(){
        return counterTitik;
    }

    public float getJarakPusat(){
        return (float) Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    public void refleksiX(){
        ordinat = -(ordinat);
    }

    public void refleksiY(){
        absis = -(absis);
    }

    public Titik getRefleksiX(){
        Titik t = new Titik(absis, -(ordinat));
        return t;
    }

    public Titik getRefleksiY(){
        Titik t = new Titik(-(absis), ordinat);
        return t;
    }

}
