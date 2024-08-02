package LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.printData();

        list.addFirst(11);
        list.addFirst(33);
        list.printData();

        list.addAt(2,45);
        list.printData();

    }
}
