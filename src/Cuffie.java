
public class Cuffie extends Prodotto {

    private String colore;

    private boolean wireless;

    public Cuffie(String nome, String marca, double prezzo, double iva, String colore, boolean wireless) {
        super(nome, marca, prezzo, iva);
        if (colore != null) {
            this.colore = colore;
        } else {
            System.out.println("Inserisci un colore valido");
        }

        this.wireless = wireless;
    }

    public boolean getWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

}
