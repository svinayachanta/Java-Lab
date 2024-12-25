package packagesAccessModifiers;

class publicCode 
{
    int a = 10;
    private int b = 20;
    protected int c = 30;
    public int d = 40;

    public void display()
    {
        System.out.println(a+b+c+d);
    }
}

public static void main(String args[])
{
    //publicCode c = new publicCode();
    public void show()
    {
        System.out.println(a+b+c+d);
    }
}