class Amoeba
{
    boolean female;
    boolean male;
    int size;
    public Amoeba(){};
    public Amoeba(boolean female)
    {
        this.female = female;
        size = 1;
    }
   public boolean isFemale()
    {
        if(this.female == true)
         {
             return true;
         }
        else{
            return false;
        }
    }
    public int getSize()
     {
         return size;
     }  
    public void setSize(int s)
    {
        this.size+=s;
    } 
    public Amoeba feed()
    {
        this.size +=1;
        return this;
    } 
    public Amoeba hunger()
    {
        this.size -=1;
        if(this.size<1)
          {
              this.size = 1;
          }
        return this;
    }
    public Amoeba split()
    {
       Amoeba new_amo = new Amoeba();
        if(this.size<5)
        {
            return null;
        }else
        {
          new_amo.female = this.female;
          new_amo.size = Math.round(this.size)/2;
          this.size = this.size - new_amo.size;
          return new_amo;
        }
    }

    public Amoeba join(Amoeba other)
    {
        Amoeba new_amo = new Amoeba();
        if(this.female == other.isFemale() || this.size == other.getSize())
        {
            return null;
        }
        else
        {
            new_amo.female = this.female;
            new_amo.size = 1;
            return new_amo;
        }
    }
    public Amoeba attack(Amoeba other)
    {
        if(this.female == false && other.isFemale() == false && this.size != other.getSize())
        {
            if(this.size < other.size)
            {
               
                other.setSize(this.size); 
                this.size = 1;
            }else
            {
               
                this.size +=other.getSize();
                other.setSize(1);
            }

        }
        return this;
    }
    
}