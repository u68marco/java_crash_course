import java.util.Scanner;
public class Ticketmachine_Test {
    public static void main(String[] args)
    {
        int amount = 0;
        int ticketPrice = 20;
        Scanner ss = new Scanner(System.in);
        System.out.println("Bitte Muenze einwerfen: ");
        amount = ss.nextInt();
        if(amount<0)
        {
            System.out.println("Bitte nur gueltige Muenze Wert eingeben!");
            System.exit(0);
        }
        // create class object tkm, and set the ticketPrice with 20 cent.
        Ticketmachine tkm = new Ticketmachine(ticketPrice);
        // call the class method insertMoney() to iniate the class attribute alreadyPaid.
        tkm.insertMoney(amount);
        // to run the ticketMachine 
        while(true)
        {
            // check if the already paid amount bigger or equal the ticket price. when yes, call 
            // the class method processTicket() to print a ticket.
            if(tkm.get_alreadyPaid() >= tkm.get_ticketPrice())
               {
                   
                   tkm.processTicket();
                   System.out.println("Wollen Sie weitere Tickets?(j/n)");
                   char decision = In.readChar();
                   if (decision == 'j')
                    {
                       if(tkm.get_alreadyPaid() < tkm.get_ticketPrice()){
                        System.out.println("Bitte Muenze einwerfen: ");
                         amount = ss.nextInt();
                         tkm.insertMoney(amount);
                       }
                       else
                       {
                        tkm.processTicket();
                       }
                    }
                   if (decision == 'n')
                    {
                        System.out.println("Ausgabe Restgeld: "+ tkm.resetAlreadyPaid());
                        System.out.println("Gesamtsumme: "+ tkm.get_totalSum() + "Cent");
                        break;
                    }  
               }
            else
            {
                System.out.println("Wollen Sie weitere Tickets?(j/n)");
                char decision = In.readChar();
                if (decision == 'j')
                {
                    System.out.println("Bitte Muenze einwerfen: ");
                    amount = ss.nextInt();
                    tkm.insertMoney(amount);
                }
                if (decision == 'n')
                {
                    System.out.println("Ausgabe Restgeld: "+ tkm.resetAlreadyPaid() + "Cent");
                    System.out.println("Gesamtsumme: "+ tkm.get_totalSum() + "Cent");
                    break;
                }

            }

        }
    }
}
