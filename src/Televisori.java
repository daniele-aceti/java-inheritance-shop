
public class Televisori extends Prodotto {

    private double dimensioni;

    private boolean smartTv;

    public Televisori(String nome, String marca, double prezzo, double iva, double dimensioni, boolean smartTv) {
        super(nome, marca, prezzo, iva);
        if (dimensioni > 0) {
            this.dimensioni = dimensioni;
        } else {
            System.out.println("Inserisci una dimensione valida");
        }
        this.smartTv = smartTv;
    }

    public double getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(double dimensioni) {
        this.dimensioni = dimensioni;
    }

    public boolean getSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }
}
