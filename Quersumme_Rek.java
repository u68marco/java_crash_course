
import java.util.Scanner;
import java.text.*;
public class Quersumme_Rek{

    public static int calculate(int n){
        return n<9 ? n:calculate(n/10) + n%10;
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
         
        boolean ganzeZahl = false;
        int zahl = 0;
        int Quersumme = 0;
        String ausgabe = "";
 
        System.out.println("Bitte ganze Zahl eingeben!");
        while(!ganzeZahl) {
            if(s.hasNextInt()) {
                zahl = s.nextInt();
                ganzeZahl = true;
            } else {
                System.out.println("Bitte ganze Zahl eingeben!");
            }
        }
 
        int hilfe = 0;
        while (zahl / Math.pow(10, hilfe) > 1) {
            hilfe++;
        }
 
        for (int j = 0; j < hilfe; j++) {
            Quersumme = calculate(zahl);
            if(ausgabe == "") {
                ausgabe = "Ausgabe:Die quersumme ergibt sich: " + (int)(zahl / Math.pow(10, j) % 10);
            } 
            else {
                ausgabe = ausgabe + " + " + (int)(zahl / Math.pow(10, j) % 10);
            }
        }
        ausgabe = ausgabe + " = " + Quersumme;
        System.out.println("Eingabe: Positive ganze Zahl: " + zahl);
        System.out.println(ausgabe);
    }
}