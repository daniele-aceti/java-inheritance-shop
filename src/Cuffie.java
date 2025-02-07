
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

    public boolean setWireless(boolean wireless) {
        this.wireless = wireless;
        return wireless;
    }

    public String getColore() {
        return colore;
    }

    public String setColore(String colore) {
        this.colore = colore;
        return colore;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() + " marca: " + getMarca() + " prezzo con iva: " + getIva() + " Euro " + " colore: " + colore + " è wireless? " + wireless;
    }

}
