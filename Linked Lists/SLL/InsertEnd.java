public class InsertEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        static Node head = null;

        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " - ");
                temp = temp.next;
            }
            System.out.println("null");
        }

       public static void insertAtEnd(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(33);
        Node e = new Node(36);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node.head = a;        
        Node.insertAtEnd(18);     
        Node.display(Node.head); 
        // Node.insert(10);
        // Node.insert(20);
        // Node.display(Node.head);
    }
}
