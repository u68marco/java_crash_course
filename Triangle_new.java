 class Triangle_new {
    
    private  int lines=0;
    private  int stars=0;
    private  int dots=0;
    private  int length=0;
    private  int tree_trunk=1;

   public Triangle_new(int len)
   {
       // get the length 
       length=len;
     //calcuate sum of stars and number of lines
     for(int i = 1; i <= length; i++)
		{
			if(i % 2 != 0)
			{
				stars = stars + i; 
                lines++;
			}
		}
    // calculate sum of dots 2 option
        dots = lines * length - stars;
    
    }
   public void display_triangle()
   {
     int m= length/2;
     for (int i=1; i<=length; i+=2)
     {
       for (int k=0; k<m; k++)
       {
          System.out.print(".");
       }
       for (int j=1; j<i*2+1; j+=2)
       {
          System.out.print("*");
       }
       for (int k=0; k<m; k++)
       {
          System.out.print(".");
       }
       System.out.println(" ");
       m=m-1;  
     }  
    }
   public int get_length()
   {
      return length;
   }
   public int get_lines()
   {
       return lines;
   }
   public int get_stars()
   {
       return stars;
   }
   public int get_dots()
   {
       return dots;
   }
   public int get_tree_trunk()
   {
       return tree_trunk;
   }

   public void set_length(int l)
   {
      length=l;
      stars=0;
      lines=0;
      dots=0;
      //calcuate sum of stars and number of lines upon new length.
     for(int i = 1; i <= length; i++)
     {
       if(i % 2 != 0)
       {
         stars = stars + i; 
                 lines++;
       }
     }
     // calculate sum of dots 2 option
         dots = lines * length - stars;
     
   }

   public void display_tree()
   {
       this.display_triangle();
       int mm= length/2;
     for (int i=1; i<=length/2; i+=2)
     {
       for (int k=0; k<mm; k++)
       {
          System.out.print(".");
       }
       for (int j=1; j<=tree_trunk; j++)
       {
          System.out.print("*");
       }
       for (int k=0; k<mm; k++)
       {
          System.out.print(".");
       }
       System.out.println(" ");
     }  
    }
}
