class Box
{
    double length;
    double width;
    double height;
Box(double l,double w, double h)
{
    this.length=l;
    this.width=w;
    this.height=h;
}
double volume()
{
    double vol= this.length * this.width * this.height;
    return vol;
}
}
class file
{
    public static void main(String args[]) {

    
    Box box = new Box(4.5, 3.4,6.5);
    System.out.println("Volume="+box.volume());
}
}