class Demo1
{
    int x ;
    public static void main(String[] args)
    {

        Demo1 d = new Demo1();
        d.x = 5;
        show(d);
        System.out.println("x="+d.x);
    }
    public static void show(Demo1 d)
    {
        d.x = 6;
    }
}
