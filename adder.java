class Adder
{
static int add(int a, int b)
{
return a+b;
}

static double add( double a, double b)
{
return a+b;
}
 
public static void main(String [] a)
{
Adder obj=new Adder();
obj.add(10,10);
obj.add(10,10);

obj.add(10.5,10.9);
}}
       
       