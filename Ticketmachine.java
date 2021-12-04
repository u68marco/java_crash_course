public class Ticketmachine {
    int ticketPrice;
    int alreadyPaid;
    int totalSum;

    //custom constructor
    public Ticketmachine(int tPrice) {
        ticketPrice = tPrice;
        alreadyPaid=0;
        totalSum=0;
    }
    // getter: Attribute alreadyPaid
    public int get_ticketPrice()
    {
        return ticketPrice;
    }
    public int get_alreadyPaid()
    {
        return alreadyPaid;
    }
    // getter: Attribute totalSum
    public int get_totalSum()
    {
        return totalSum;
    }
    public void insertMoney(int amount)
    {
        
        if(amount > 0) {
            alreadyPaid= alreadyPaid + amount;
        }
        else {
            System.out.println("bitte nur positive Menge eingeben.");
                
        }
    }
    public void printTicket()
    {
        System.out.println("###################");
        System.out.println("#Erstsemesterfeier#");
        System.out.println("######Ticket#######");
        System.out.println("#### 20 Cent ######\n");
        //  der Gesamtbetrag erhöht und der einbezahlte Betrag entsprechend reduziert. 
        alreadyPaid = alreadyPaid - ticketPrice;
        totalSum = totalSum + ticketPrice;
       
    }
    public String resetAlreadyPaid()
    {
        // gibt über den Returntype String den Restbetrag mit Angabe Cent aus. und setzt den einbezahlten Betrag auf 0 zurück. 
        String angabe = "Ausgabe Restgeld: " + alreadyPaid + " Cent";
        // setzt den einbezahlten Betrag auf 0 zurück.
        alreadyPaid = 0;
        return angabe;
    }
    public void processTicket()
    {
        // pruefen, ob ausreichend Betrag vorhanden ist 
                this.printTicket();
                /*
                System.out.println("Wollen Sie weitere Tickets?(j/n)");
               
                char decision = In.readChar();
                if (decision == 'j')
                {
                    this.printTicket();
                }
                if (decision == 'n')
                {
                    System.out.println("Ausgabe Restgeld: "+ alreadyPaid + "Cent");
                    System.out.println("Gesamtsumme: "+ totalSum + "Cent");
                    this.resetAlreadyPaid();
                    System.exit(0);
                }
                */


    }
    
}
