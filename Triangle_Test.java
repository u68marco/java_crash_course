import java.util.Scanner;
public class Triangle_Test {
    public static void main(String[] args) {
        
        Scanner ss = new Scanner(System.in);
         
        boolean ungerade_zahl = false;
        int zahl = 0;
       
        System.out.println("Bitte eine positive (n>0)ungerade Zahl eingeben!");
        while(!ungerade_zahl) {
            if(ss.hasNextInt()) 
            {
                zahl = ss.nextInt();
                if(zahl < 0)
                { System.out.println("Bitte eine positive Zahl eingeben!!!");}
                else if(zahl%2==0) 
                {
                System.out.println("Bitte eine positive ungerade Zahl eingeben!!!");
                }
                else
                {
                    ungerade_zahl = true;
                }
            } else {
                System.out.println("Bitte ganze Zahl eingeben!");
            }
        }
     // create triangle_new object 
     Triangle_new triangle_new = new Triangle_new(zahl);   
     // draw the triangle
     triangle_new.display_triangle();
     System.out.println("Anzahl der Sterne: "+ triangle_new.get_stars());
     System.out.println("Anzahl der Punkte: "+ triangle_new.get_dots());

    }
}
