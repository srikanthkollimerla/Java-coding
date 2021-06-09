import java.util.Stack;
import java.util.*;
import java.util.Iterator;  
class StackofStack{

    int top;
    int max = 50;
    static int curPos = 0;
    ArrayList<Stack<Integer>> list=new ArrayList<Stack<Integer>>();

    //Stack<Integer> s1 = new Stack<Integer>();

    public void pushing(int num)
    {
        curPos++;
        if((curPos/max+1) > list.size())
        {
            Stack<Integer> s1 = new Stack<Integer>();
            s1.push(num);
            list.add(s1);
        }
        else
        {
            list.get(curPos/max).push(num);
        }
    }

    public void display()
    {
        for(Stack ss: list)
        {
            System.out.println(ss.peek());
            /*
            Iterator it = ss.Iterator();
            while(it.hasNext())
            {
                Object values = it.next();
                System.out.println(values);
            }*/
        }
    }
}    

class SOS_Implement{

public static void main (String[] args)
    {   
        StackofStack s1 =  new StackofStack();
        s1.pushing(5);
        
        //System.out.println(s1.peek()+5);
    }

}