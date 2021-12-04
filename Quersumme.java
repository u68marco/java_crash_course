public class Quersumme {
  public static void main(String[] args) {
    
    int n=Integer.parseInt(args[0]);
    int a1=0,a2=0,a3=0,a4=0,q_sum=0;
     a1=n%10;
     n=n/10;
     a2=n%10;
     n=n/10;
     a3=n%10;
     n=n/10;
     a4=n%10;
     //get the quer summer
     q_sum=a1+a2+a3+a4;
    System.out.println("Eingabe:Positive ganze Zahl"+ n + "\n");  
    System.out.println("Ausgabe:Die quersumme ergibt sich aus:"+a1+"+"
                        +a2+"+"+a3+"+"+a4+"="+ q_sum); 
      }
}