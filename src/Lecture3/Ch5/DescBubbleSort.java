package Lecture3.Ch5;

public class DescBubbleSort extends TemplateMethodBubbleSort {
    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1 > i2;
    }
}
