public class DeleteNthFromLast {
    public static class Node{
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;

        }
        public static void display(Node head)
        
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"  - ");
                temp=temp.next;

            }
            System.out.println("null");
        }
        public static Node  del (Node head,int n)
        {
            Node slow=head;
            Node fast=head;
            for(int i=1;i<=n;i++)
            {
                 if (fast == null) return head;
                fast=fast.next;

            }
            if(fast==null)
            {
                head=head.next;
                return head;

            }
            while(fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=slow.next.next;
            return head;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node.display(a);
        Node x= Node.del(a, 3);
        Node.display(x);
    }
    
}
