public class ReverseLinkedList {
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
        public static void display(Node head)
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" - ");
                temp=temp.next;
            }
            System.out.println("null");
        }
         public static void reverse(Node head)
        {
            Node temp=head;
            if(temp==null)
            {
                
                return;
            }
            reverse(temp.next);
            System.out.print(temp.data+" - ");
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(33);
        Node e=new Node(36);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node.display(a);
        Node.reverse(a);
        System.out.println("null");

    }
    
}
