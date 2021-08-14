package CodingExercises;

public class SinglyLinkedList<T> {

    public int size;
    public Node headNode;

    public SinglyLinkedList() {
        headNode = null;
        size = 0;
    }

    public boolean isEmpty(){
        return headNode == null;
    };

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;

        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        if(isEmpty()) {
            insertAtHead(data);
            return;
        }

        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        Node lastNode = headNode;
        while (lastNode.nextNode != null) {
            lastNode = lastNode.nextNode;
        }
        lastNode.nextNode = newNode;
        size++;
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = headNode;
        System.out.print("Linked List data - ");
        while(temp.nextNode != null) {
            System.out.print(temp.data.toString() + " -> ");
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }

    public boolean search(T data) {
        boolean exists = false;

        Node firstNode = headNode;
        while (firstNode.nextNode != null) {
            if (firstNode.data.equals(data)) {
                return true;
            }
            firstNode = firstNode.nextNode;
        }

        if (firstNode.data.equals(data))
            exists = true;

        return exists;
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.printList();

        int itemToSearch = 0;


        System.out.println("Item " + itemToSearch + " exists in the system - " + list.search(itemToSearch));

    }

}

class Node<T> {
    public T data;
    public Node nextNode;
}