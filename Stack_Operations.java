import java.util.Scanner;

class Stack{
    int arrSize = 50;
    int top;
    int[] arr = new int[arrSize];


    Stack(){
        top = -1;
    }

    public boolean isEmpty(){
        return (top<0);
    }

    public void pop(){
        if(top==-1)
        {
            System.out.println("Undeflow");
        }
        else
        {
            System.out.println("Item popped: "+arr[top--]);
        }
    }

    public void push(int num){
        top++;
        if(top - 1 ==arrSize)
        {
            System.out.println("Overflow");
            top--;
            return;
        }
        else
        {
            arr[top] = num;
        }
    }

    public int peek(){
        if(top<0)
        {
            System.out.println("Undeflow");
            return -1;
        }
        return arr[top];
    }

    public void display(){
        for(int i=top;i>=0;i--)
        {
            System.out.println(i+" "+arr[i]);
        }
    }
}

public class Stack_Operations{
    public static void main (String[] args)
    {
        Stack s1 = new Stack();
        s1.push(5);
        s1.push(5);
        s1.push(55);
        s1.push(42);
        s1.peek();
        s1.pop();
        s1.peek();
        s1.display();
    }
} 
