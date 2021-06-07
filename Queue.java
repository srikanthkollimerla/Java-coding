import java.util.Scanner;

class Queue{

    class Node
    {
        int data;
        Node next;


        public Node (int data)
        {
            this.data = data;
            this.next = null;
        }

    }

    public Node head = null;
    public Node tail = null;

    public void push (int data)
    {
        Node temp = new Node(data);
        if(head == null)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            tail.next = temp;
            tail = temp;
        }
        System.out.println("Added data: "+temp.data);
        
    }

    public void pop ()
    {
        if(head==null)
        {
            System.out.println("Underflow");
        }
        else
        {   
            System.out.println("removed number:" + head.data);
            head=head.next;
        }
    }

    public void peek()
    {
        if(head==null)
        {
            System.out.println("Underflow");
        }
        else
        {   
            System.out.println("Top number:" + tail.data);
        }
    }

    public void display()
    {
        Node tt = head;
        int i = 1;
        while(tt!=null)
        {
            System.out.println("number["+i+"]: " + tt.data);
            tt=tt.next;
            i++;
        }
    }


    public static void main (String[] args)
    {
        Queue q1 = new Queue();
        q1.push(5);
        q1.push(55);
        q1.push(42);
        q1.pop();
        q1.display();
        q1.push(4);
        q1.pop();
        q1.display();
    }
}