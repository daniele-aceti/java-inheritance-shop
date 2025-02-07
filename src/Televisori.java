
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

    public double setDimensioni(double dimensioni) {
        this.dimensioni = dimensioni;
        return dimensioni;
    }

    public boolean getSmartTv() {
        return smartTv;
    }

    public boolean setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
        return smartTv;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() + " marca: " + getMarca() + " prezzo con iva :" + getIva() + " Euro " + " dimensioni: " + dimensioni + " è smartTv? " + smartTv;
    }

}
