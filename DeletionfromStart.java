public class DeletionfromStart {

    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at end
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Delete from start
    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // Display list
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        DeletionfromStart list = new DeletionfromStart();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Before Deletion:");
        list.display();

        list.deleteFromStart();

        System.out.println("After Deletion:");
        list.display();
    }
}