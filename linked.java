import java.util.Scanner;

public class linked {

    public static class Node {
        int d;
        Node next;

        Node() {
            this.d = 0;
            this.next = null;
        }

        Node(int d) {
            this.d = d;
            this.next = null;
        }

        Node create() {
            Scanner sc = new Scanner(System.in);
            int d = sc.nextInt();
            Node head = new Node(d);
            Node t = head;
            while (true) {
                d = sc.nextInt();
                if (d == -1)
                    break;
                t.next = new Node(d);
                t = t.next;
            }
            sc.close();
            return head;

        }

        void print(Node head) {
            Node t = head;
            while (true) {
                if (t == null) {
                    System.out.print("null");
                    break;
                }
                System.out.print(t.d + "->");
                t = t.next;
            }
        }
    }

    public static void main(String[] args) {
        Node hh = new Node();

        hh = hh.create();
        hh.print(hh);

    }
}
