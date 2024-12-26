package _19multiThreading;

class MyThread extends Thread
{
    public void run()
    {
        int count = 1;
        while(true)
        {
            System.out.println(count++);
        }
    }
}

public class multiThreadingCode 
{
    public static void main(String args[]) throws Exception
    {
        MyThread t = new MyThread();
        t.start();
    }
}