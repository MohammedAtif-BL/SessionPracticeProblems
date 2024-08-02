package LinkedList;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        this.head = null;
    }

    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if(head == null){
            head = newNode;
        } else {
            Node<T> temp = head;
            while(temp.next !=null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void addFirst(T data){
        Node<T> newNode = new Node<T>(data);
        newNode.next = head;
        head = newNode;
    }

    public void printData(){
        if(head == null){
            System.out.println("Linked List is Empty");
        } else {
            Node<T> temp = head;
            while(temp !=null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public void addAt(int index, T data){
        if(index < 0 ){
            System.out.println("Invalid Position");
        }
        if(index == 0 ){
            addFirst(data);
        } else {
            Node<T> newNode = new Node<T>(data);
            Node<T> temp = head;

            for (int i=0; i<index-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
}
