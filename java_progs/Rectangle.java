class Box
{
    double length;
    double breadth;
    double p=0;
    double a=0;
Box(double l, double b)
{
    this.length =l;
    this.breadth =b;
}
double Perimeter()
{
    p= 2*(length+breadth);
    return p;
}
double Area()
{
    a= length*breadth;
    return a;
}
class Rectangle
{
    public static void main(String args[])
    {
        Box box = new Box(6.0,6.7);
        System.out.println("PERIMETER ="+box.Perimeter());
        System.out.println("AREA =" +box.Area());
    }
}
}