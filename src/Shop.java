public class Shop {
    public static void main(String[] args) {

        
        Prodotto mouse = new Prodotto("Mouse-MG2", "samsung", 12, 1.22);
        System.out.println("Code: "+ mouse.getCodice() + " Name: " + mouse.getNome() + " prezzo iva inclusa " + mouse.calcolaIva());

        Cuffie cuffie = new Cuffie("Cuffie-SR-0876", "Philps", 45, 1.22, "black", true);
        System.out.println("Code: "+ cuffie.getCodice() + " Name: "  + cuffie.getNome() + " prezzo iva inclusa " + cuffie.calcolaIva()
                            + " color: " + cuffie.getColore() + "  wireless: " + cuffie.getWireless());

        Smartphone smartphone = new Smartphone("Telephone-N021", "Nokia", 130, 1.22, 1010101001, 256);
        System.out.println("Code: "+ smartphone.getCodice() + " Name: "  + smartphone.getNome() + " prezzo iva inclusa " + smartphone.calcolaIva()
        + " IMEI: " + smartphone.getCodiceIMEI() + "  memoria: " + smartphone.getMemoria()+"GB");


        Televisori tv = new Televisori("TV-ANR0234", "Sharp", 399, 1.22, 65, true);
        System.out.println("Code: "+ tv.getCodice() + " Name: "  + tv.getNome() + " prezzo iva inclusa " + tv.calcolaIva()
        + " dimensioni: " + tv.getDimensioni()+"-pollici" + "  smartTv: " + tv.getSmartTv());
    }


}
