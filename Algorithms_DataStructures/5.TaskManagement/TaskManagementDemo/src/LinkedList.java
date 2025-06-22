public class LinkedList{
    static class Node {
    Task task;
    Node next;

    Node(Task task ){
        this.task = task;
        next = null;
    }
}
    Node head,tail;

    LinkedList(){
        head = null;
        tail = null;
    }

    public void insertAtBegin(Task task){
        Node newNode = new Node(task);

        if(head==null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next=head;
            head = newNode;
        }
    }
    public void insertAtEnd(Task data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAtPos(Task data , int index){
        Node newNode = new Node(data);

        Node temp = head;

        for(int i=0;i<index-1 && temp!=null;i++,temp=temp.next){}

        newNode.next = temp.next.next;
        temp.next = newNode;

    }

    public void deleteAtPos(int index) {
        if (head == null || index < 0) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            head = head.next;
            if (head == null) tail = null;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid index");
            return;
        }
        temp.next = temp.next.next;
        if (temp.next == null) tail = temp;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.task + "-->");
            temp = temp.next;
        }
        System.out.println();
    }
}