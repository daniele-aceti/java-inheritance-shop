
public class Shop {

    public static void main(String[] args) {

        Cuffie cuffie = new Cuffie("Cuffie-SR-0876", "Philps", 45, 1.22, "black", true);
        System.out.println("Code: " + cuffie.getCodice() + " Name: " + cuffie.getNome() + " prezzo iva inclusa " + cuffie.calcolaIva()
                + " color: " + cuffie.getColore() + "  wireless: " + cuffie.getWireless());

        Smartphone smartphone = new Smartphone("Telephone-N021", "Nokia", 130, 1.22, 1010101001, 256);
        System.out.println("Code: " + smartphone.getCodice() + " Name: " + smartphone.getNome() + " prezzo iva inclusa " + smartphone.calcolaIva()
                + " IMEI: " + smartphone.getCodiceIMEI() + "  memoria: " + smartphone.getMemoria() + "GB");

        Televisori televisore = new Televisori("TV-ANR0234", "Sharp", 399, 22, 65, true);
        System.out.println("Code: " + televisore.getCodice() + " Name: " + televisore.getNome() + " prezzo iva inclusa " + televisore.calcolaIva()
                + " dimensioni: " + televisore.getDimensioni() + "-pollici" + "  smartTv: " + televisore.getSmartTv());


        Carrello carrello = new Carrello(cuffie, smartphone, televisore);
        carrello.main();
        if(cuffie.getNome().equals("cuffie")){
                System.out.println(cuffie);
        }else if(smartphone.getNome().equals("smartphone")){
                System.out.println(smartphone);
        }else if (televisore.getNome().equals("televisore")){
                System.out.println(televisore);
        }

    }

}
