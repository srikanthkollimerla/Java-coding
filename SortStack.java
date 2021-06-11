//Sort the Stack 
//logic is to find the max element by popping every element into temp and then putting back the max element into the main stack and incrementing the stepcount, the next time elements are pooped into the temporary stack above the step count

import java.util.*;
import java.util.Stack;
import java.util.Iterator; 

class SortStack {
    Stack<Integer> main; 
    Stack<Integer> temp; 

    public SortStack()
    {
        main = new Stack<Integer>();
        temp = new Stack<Integer>();
    }

    public void pushing(int val)
    {
        main.push(val);
        System.out.println("Pushed element: "+main.peek());
    }
    public void sort()
    {
        if(main.size()==0 || main.size() == 1)
            return;

        int fstep = 0;
        int size = main.size();
        while(true)
        {   
            //System.out.println("size: "+main.size());
            int max = Integer.MIN_VALUE;    
            while(main.size()!=fstep)    
            {
                if(main.peek()>max)
                {
                    if(max!=Integer.MIN_VALUE)
                    {
                        temp.push(max);
                    }
                    max = main.pop();
                }
                else
                {
                    temp.push(main.pop());
                }
            }
            main.push(max);  //to push the big element

            while(!temp.isEmpty())
            {
                main.push(temp.pop());
            }
            fstep++;

            if(fstep == size)
                return;

        }
    }

    public void display()
    {
        Iterator it = main.iterator();
            while(it.hasNext())
            {
                Object values = it.next();
                System.out.println(values);
            }
    }

    public void peeking()
    {
        System.out.println("Peek value: "+main.peek());
    }

    public static void main(String[] args)
    {
        SortStack s1 = new SortStack();
        s1.pushing(34);
        s1.pushing(6);
        s1.pushing(77);
        s1.pushing(1);

        s1.sort();
        s1.display();
        s1.peeking();
    }
}