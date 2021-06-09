import java.util.Stack;
import java.util.*;
import java.util.Iterator;  
class StackofStack{

    int top;
    int max = 51;
    static int curPos = 0;
    ArrayList<Stack<Integer>> list=new ArrayList<Stack<Integer>>();

    //Stack<Integer> s1 = new Stack<Integer>();

    public void pushing(int num)
    {
        curPos++;
        
        if(((curPos/max)+1) > list.size())
        {
            Stack<Integer> s1 = new Stack<Integer>();
            s1.push(num);
            list.add(s1);
            System.out.println("list size: "+ list.size()+"curPos: "+ curPos);
        }
        else
        {
            list.get(curPos/max).push(num);
        }
        System.out.println("Element Added: " + list.get(curPos/max).peek());
    }

    public void popping()
    {
        System.out.println("Element Popped: " + list.get(curPos/max).peek());
        list.get(curPos/max).pop();
        curPos--;
    }
    public void display()
    {
        System.out.println("Last Element Added: " + list.get(curPos/max).peek());
        
        /*for(Stack ss: list)
        {
            System.out.println("last element added is "+ss.peek());
            
            Iterator it = ss.Iterator();
            while(it.hasNext())
            {
                Object values = it.next();
                System.out.println(values);
            }
        }*/
    }

}    

class SOS_Implement{

public static void main (String[] args)
    {   
        StackofStack s1 =  new StackofStack();
        
        for(int i =0;i< 100;i++)
            s1.pushing(i);

        s1.popping();
        s1.display();
    }

}