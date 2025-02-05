public class Smartphone extends Prodotto {

    private int codiceIMEI;

    private int memoria;

    public Smartphone(String nome, String marca, double prezzo, double iva, int codiceIMEI, int memoria){
        super(nome, marca, prezzo, iva);
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    public int getCodiceIMEI(){
        return codiceIMEI;
    }

    public void setCodiceIMEI(int codiceIMEI){
        this.codiceIMEI = codiceIMEI;
    }

    public int getMemoria(){
        return memoria;
    }

    public void setMemoria(int memoria){
        this.memoria = memoria;
    }

}
