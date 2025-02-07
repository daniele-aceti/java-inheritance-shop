
import java.util.Random;

public class Prodotto {

    private int codice;

    private String nome;

    private String marca;

    private double prezzo;

    private double iva;

    //costruttore
    public Prodotto(String nome, String marca, double prezzo, double iva) {
        calcolaCodice();

        if (nome != null && marca != null) {
            this.nome = nome;
            this.marca = marca;
        } else {
            System.out.println("Inserisci un nome o una marca valida");
        }

        if (prezzo > 0) {
            this.prezzo = prezzo;
        } else {
            System.out.println("Zero non è un prezzo valido");
        }
        this.iva = iva;
    }

    public int calcolaCodice() {
        Random number = new Random();
        codice = number.nextInt(1000, 100000);
        return codice;
    }

    //setter
    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String setMarca(String marca) {
        this.marca = marca;
        return marca;
    }

    public double setIva(double iva) {
        this.iva = iva;
        return iva;
    }

    //solo in lettura
    public int getCodice() {
        return codice;
    }

    //getter 
    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }

    public String getMarca() {
        return marca;
    }

    public double calcolaIva() {
        switch (iva) {
            case 22.0:
                iva = prezzo * 1.22;
                break;
            case 1.22:
                iva = prezzo * 1.22;
                break;
            case 4.0:
                iva = prezzo * 1.04;
                break;
            case 1.04:
                iva = prezzo * 1.04;
                break;
            default:
                System.out.println("Imposta un valore dell'IVA valido");
        }
        return iva;
    }

    public double setPrezzo(double prezzo) {
        this.prezzo = prezzo;
        return prezzo;
    }

    public String toString() {
        return "nome: " + nome + " marca: " + marca + " prezzo con iva: " + iva + "Euro ";
    }

}
