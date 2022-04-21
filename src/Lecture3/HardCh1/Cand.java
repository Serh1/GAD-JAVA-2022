package Lecture3.HardCh1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cand implements DecorableTree {
    private DecorableTree decorableTree;
    private List<List<String>> tree;
    private int size = 10;

    public Cand(DecorableTree decorableTree) {
        this.decorableTree = decorableTree;
        this.tree = this.getTree();
        this.size = 10;
    }

    @Override
    public List<List<String>> getTree() {
        List<List<String>> copytree = decorableTree.getTree();
        System.out.println(copytree.get(3).get(7));
        System.out.println("AICI");

        List<String> row;
        for (int i = 0; i < size; i++) {
            row = new ArrayList<>();
            for (int j = 0; j < size * 2; j++) {
                if (j==(size-i)) row.remove("<");
                if (j==(size+i)) row.add("C");
                row.add(" ");
            }
            copytree.add(Collections.unmodifiableList(row));
        }
        return Collections.unmodifiableList(copytree);
    }


    @Override
    public void display() {
        for (int i = 0; i < tree.size(); i++) {
            for (int j = 0; j < tree.get(i).size(); j++) {
                System.out.print(tree.get(i).get(j));
            }
            System.out.println(". ");
        }

    }
}
