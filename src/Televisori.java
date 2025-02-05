public class Televisori extends  Prodotto{

    private double dimensioni;

    private boolean smartTv;

    public Televisori (String nome, String marca, double prezzo, double iva, double dimensioni, boolean smartTv){
        super(nome, marca, prezzo,iva);
        this.dimensioni = dimensioni;
        this.smartTv = smartTv;
    }

    public double getDimensioni(){
        return dimensioni;
    }

    public void setDimensioni(double dimensioni){
        this.dimensioni = dimensioni;
    }

    public boolean getSmartTv(){
        return smartTv;
    }

    public void setSmartTv(boolean smartTv){
        this.smartTv = smartTv;
    }
}
