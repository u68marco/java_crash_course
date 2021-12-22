public class Cuboid {

private double length_a ;
private double width_b ;
private double height_c ;
private int count=0;

public Cuboid()
{
    length_a=1.0;
    width_b=1.0;
    height_c=1.0;
    count++;
}
public Cuboid(double l)
{
  length_a=l;
  width_b=l;
  height_c=l;
  count++;
}

public Cuboid(double l, double m, double n)
{
  length_a=l;
  width_b=m;
  height_c=n;
  count++;
}

public Cuboid(Cuboid cbl)
{
  length_a=cbl.length_a;
  width_b=cbl.width_b;
  height_c=cbl.height_c;
  count++;
}
public double getA()
{
    return length_a;
}
public double getC() {
    return height_c;
}
public double getB() {
    return width_b;
}

public int getCount() {
    return count;
}
public boolean isCube()
{
     //if((length_a==width_b)&&(width_b==height_c)&&(height_c==length_a))
    return (length_a==width_b)&&(width_b==height_c)&&(height_c==length_a)? true:false;
}

public double getVolume()
{
    return length_a*height_c*width_b;
}

public boolean hasSameVolume(Cuboid cub)
{
    return this.getVolume() == cub.getVolume() ? true:false;
}
boolean isSame(Cuboid cub)
{
    return (length_a==cub.length_a)&&(width_b==cub.width_b)&&(height_c==cub.height_c)? true:false;
}

public boolean fitsInto(Cuboid cub)
{

    return (length_a > cub.length_a)&&(width_b > cub.width_b)&&(height_c > cub.height_c)? true:false;

}

}
