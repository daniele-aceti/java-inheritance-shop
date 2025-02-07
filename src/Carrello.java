
import java.util.Scanner;

public class Carrello {

    private Cuffie cuffie;

    private Smartphone smartphone;

    private Televisori televisore;

    public Carrello(Cuffie cuffie, Smartphone smartphone, Televisori televisore) {
        this.cuffie = cuffie;
        this.smartphone = smartphone;
        this.televisore = televisore;
    }

    public void main() {
        //INSERIMENTO DA PARTE DELL'ULTENTE DI NOME DEL PRODOTTO E MARCA
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il nome del prodotto");
        String nomeProdotto = scan.nextLine();
        System.out.println("Inserisci il nome della Marca");
        String nomeMarca = scan.nextLine();
        //CUFFIE
        if (nomeProdotto.equals("cuffie")) {
            nomeProdotto = cuffie.setNome("cuffie");
            nomeMarca = cuffie.setMarca(nomeMarca);
            double ivaCuffie = cuffie.setIva(22);
            double prezzoCuffie = cuffie.setPrezzo(0);
            if (nomeMarca.equals("lg")) {
                prezzoCuffie = cuffie.setPrezzo(40);
                cuffie.calcolaIva();
            } else {
                prezzoCuffie = cuffie.setPrezzo(99);//posso inserire più prezzo a seconda della marca
                cuffie.calcolaIva();

            }
            System.out.println("Inserisci colore");
            String coloreCuffie = cuffie.setColore(scan.nextLine());
            System.out.println("Le cuffie sono wireless? scrivi true o false");
            boolean wirelessCuffie = cuffie.setWireless(scan.nextBoolean());
            cuffie = new Cuffie(nomeProdotto, nomeMarca, prezzoCuffie, ivaCuffie, coloreCuffie, wirelessCuffie);
        }
        //SMARTPHONE
        if (nomeProdotto.equals("smartphone")) {
            nomeProdotto = smartphone.setNome("smartphone");
            nomeMarca = smartphone.setMarca(nomeMarca);
            double ivaSmartphone = smartphone.setIva(22);
            double prezzoSmartphone = smartphone.setPrezzo(0);
            if (nomeMarca.equals("samsung")) {
                prezzoSmartphone = smartphone.setPrezzo(150);
                smartphone.calcolaIva();
            } else {
                prezzoSmartphone = smartphone.setPrezzo(199);//posso inserire più prezzo a seconda della marca
                smartphone.calcolaIva();
            }
            System.out.println("Inserisci il codice IMEI");
            int codiceIMEISmartphone = smartphone.setCodiceIMEI(scan.nextInt());
            System.out.println("Inserisci la memoria");
            int memoriaSmartphone = smartphone.setMemoria(scan.nextInt());
            smartphone = new Smartphone(nomeProdotto, nomeMarca, prezzoSmartphone, ivaSmartphone, codiceIMEISmartphone, memoriaSmartphone);
        }
        //TELEVISORE
        if (nomeProdotto.equals("televisore")) {
            nomeProdotto = televisore.setNome("televisore");
            nomeMarca = televisore.setMarca(nomeMarca);
            double ivaTelevisore = televisore.setIva(22);
            double prezzoTelevisore = televisore.setPrezzo(0);
            if (nomeMarca.equals("sharp")) {
                prezzoTelevisore = televisore.setPrezzo(199);
                televisore.calcolaIva();
            } else {
                prezzoTelevisore = televisore.setPrezzo(350);//posso inserire più prezzo a seconda della marca
                televisore.calcolaIva();
            }
            System.out.println("Inserisci la dimensione");
            double dimensioneTelevisore = televisore.setDimensioni(scan.nextDouble());
            System.out.println("E' una smartTV? scrivi true o false");
            boolean smartTvTelevisore = televisore.setSmartTv(scan.nextBoolean());
            televisore = new Televisori(nomeProdotto, nomeMarca, prezzoTelevisore, ivaTelevisore, dimensioneTelevisore, smartTvTelevisore);

        }
    }

    public void aggiungiProdotto() {
        Scanner nuovoProdotto = new Scanner(System.in);
        //nuovoProdotto.nextInt();
        System.out.println("Inserisci un nuovo prodotto rispondi true o false");
        boolean risposta = nuovoProdotto.nextBoolean();
        if (risposta) {
            main();
        } else {
            return;
        }
    }

}
