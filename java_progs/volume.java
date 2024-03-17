class box{
    double length;
    double width;
    double height;
    box(double l,double w,double h)
    {
        this.length=l;
        this.width=w;
        this.height=h;

    }
    double volume()
    {
        double vol = this.length * this.width * this.height;
        return vol;
    }
}
 class volume{
    public static void main(String[] args)
    {
        box box = new box (2.4,5.5,6.9);
        System.out.println("Volume ="+ box.volume());
    }
 }