public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("=======TESTING=======");
        MyLinkedList test = new  MyLinkedList(10);
        test.addFirst(11);
        test.addFirst(12);
        test.addFirst(13);
        test.add(4,9);
        test.add(4,8);
        test.printList();
    }
}
