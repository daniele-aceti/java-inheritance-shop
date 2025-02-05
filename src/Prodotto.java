import java.util.Random;

public class Prodotto{

    private int codice;

    private String nome;

    private String marca;

    private double prezzo;

    private double iva;


    //costruttore
    public Prodotto (String nome, String marca, double prezzo, double iva){
        calcolaCodice();
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public double calcolaIva(){
        double result = prezzo * iva;
        return result;
    }
    public int calcolaCodice(){
        Random number = new Random();
        codice =  number.nextInt(1000,100000);
        return codice;
    }

    //setter
    public String setNome(String nome){
        this.nome = nome;
        return nome;
    }

    public String setMarca(String marca){
        this.marca = marca;
        return marca;
    }
    
    public double setIva(double iva){
        this.iva = iva;
        return iva;
    }

    
    //solo in lettura
    public int getCodice(){
        return codice;
    }
    
    //getter 
    public String getNome(){
        return nome;
    }

    public double getPrezzo(){
        return prezzo;
    }
    
    public double getIva(){
        return iva;
    }

    public String getMarca(){
        return marca;
    }


}
