public class MyLinkedList {
    private Node head;

    // Add new node at the head (beginning)
    public void addAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add new node at the tail (end)
    public void addAtTail(int data) {
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

    // Print the linked list
    public void printList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.printList(); 

        list.addAtHead(5);
        list.printList(); 
    }
}
