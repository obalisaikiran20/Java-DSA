public class NodeKFromLast {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        public static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " - ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static Node nth(Node head, int n) {
            Node slow = head;
            Node fast = head;
            for (int i = 1; i <= n; i++) {
                if (fast == null) return null;
                fast = fast.next;
            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
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

        Node.display(a);

        int k = 3;
        Node result = Node.nth(a, k);
        if (result != null) {
            System.out.println(k + "th node from last is: " + result.data);
        } else {
            System.out.println("The list is shorter than " + k + " elements.");
        }
    }
}
