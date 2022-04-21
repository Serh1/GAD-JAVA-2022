package Lecture5.Ch3;

public class Main {
    public static void main(String[] args) {
        String rootValue = "a";
        GenericList<String> list = new GenericList<>(rootValue);
        for(int i = 1; i<10;i++){
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0)+i))));
        }
        list.println();

        GenericNode<Integer> head = new GenericNode<>(1);
        GenericNode<Integer> node1 = new GenericNode<>(2);
        GenericNode<Integer> node2 = new GenericNode<>(3);
        GenericNode<Integer> node3 = new GenericNode<>(4);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        GenericNode<Integer> current = head;
        for(int i = 1; i<5;i++) {
            System.out.println(current.getValue() +" -> "+ current.getNext()); // Does not have a neam next node
            current = current.getNext();
        }


    }
}
