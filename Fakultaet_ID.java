
import java.util.Scanner;
class Fakultaet_ID{
    public static void main(String[] args){

        int FAK_ID=0;
        String BEREICH;
        Scanner in = new Scanner(System.in);
        do{
           System.out.println("Bitte Fakultaet ID Angabe= \n");
           FAK_ID = in.nextInt();
           switch(FAK_ID)
           {
                case 1: 
                case 2:
                case 3: 
                case 4:
                case 5: 
                case 6: 
                case 8: BEREICH="Technik";
                break;
                case 7:  
                case 9:
                case 10: 
                case 14: BEREICH="Wirtschaft";
                break;
                case 11: BEREICH="Soziales";
                break;
                case 12: BEREICH="Design";
                break;
                case 13: BEREICH="Studium Generale";
                break;
                default: BEREICH="unbekannt";      
                break;
           }
           System.out.println("die ermittelte Fakultaet gehoert zu dem Bereich: "+ BEREICH+"\n");

        }while(FAK_ID != 0);
        in.close();
        System.exit(0);
    }

}