package Lecture3.HardCh1;

public class DecorationExample {
    public static void main(String[] args) {
        DecorableTree christmastree = new ChristmasTree();
//        christmastree.display();
        //    DecorableTree decoratedtree = new Garland(new Bulb(new Cand(christmastree)));
        DecorableTree decoratedtree = new Cand(christmastree);
        decoratedtree.display();
    }
}

