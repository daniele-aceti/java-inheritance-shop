
public class Smartphone extends Prodotto {

    private int codiceIMEI;

    private int memoria;

    public Smartphone(String nome, String marca, double prezzo, double iva, int codiceIMEI, int memoria) {
        super(nome, marca, prezzo, iva);
        if (codiceIMEI > 0 && memoria > 0) {
            this.codiceIMEI = codiceIMEI;
            this.memoria = memoria;
        } else {
            System.out.println("Inserisci un codiceIMEI o una memoria valida");
        }

    }

    public int getCodiceIMEI() {
        return codiceIMEI;
    }

    public int setCodiceIMEI(int codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
        return codiceIMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    public int setMemoria(int memoria) {
        this.memoria = memoria;
        return memoria;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() + " marca: " + getMarca() + " prezzo con iva: " + getIva() + " Euro " + " codiceIMEI: " + codiceIMEI + " memoria " + memoria;
    }

}
