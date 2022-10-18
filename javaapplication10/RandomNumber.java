package javaapplication10;
import java.util.*;  
public class RandomNumber {
    public static void main(String[] args) {
        Random obj3=new Random();
        int x=obj3.nextInt(1000);
        System.out.println("The random number is: "+x);
        random obj4=new random(x);
        obj4.start();  
    }    
}
class square extends Thread
{
    int a;
    square(int i)
    {
        a=i;
    }
    public void run()
    {
        int square=a*a;
        System.out.println("the square of "+a+" is "+square);
    }
}
class cube extends Thread
{
    int a;
    cube(int i)
    {
        a=i;
    }
    @Override
    public void run()
    {
        int cube=a*a*a;
        System.out.println("the cube of "+a+" is "+cube);
    }
}
class random extends Thread
{
    int b;

    random(int i)
    {
        b=i;
    }
    @Override
    public void run()
    {
       
        if(b%2==0)
        {
            square obj=new square(b);
            obj.start();
        }
        else
        {
            cube obj1=new cube(b);
            obj1.start();
        }
    }
}