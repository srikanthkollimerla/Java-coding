//Implementing a queue using 2 stacks
import java.util.Stack;
import java.util.*;

public class MyQueue{
    Stack<Integer> snew,sold;

    public MyQueue(){
        snew = new Stack<Integer>();
        sold = new Stack<Integer>();   
    }

    public void pushing(int val)
    {
        snew.push(val);
        System.out.println("Pushed element: "+snew.peek());
    }

    public void shiftShack()
    {
        if(sold.isEmpty())
        {
            while(!snew.isEmpty())
            {
                sold.push(snew.pop());
            }
        }
    }
    public void display()
    {
        shiftShack();
        System.out.println("Peek Element: "+sold.peek());
    }

    public void popping()
    {
        shiftShack();
        System.out.println("Popped element: "+sold.pop());
    }

    public static void main(String[] args)
    {
        MyQueue s1 = new MyQueue();
        
        for(int i =0;i< 100;i++)
            s1.pushing(i);

        s1.popping();
        s1.display();
    }
}