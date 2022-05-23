package Lecture8_Functional.Ch2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {




    }
    @Test
    public void predicate_1(){
        Predicate<String> p1 = s -> s.isEmpty();
        Predicate<String> notPredicate = null;
        Assert.assertFalse(notPredicate.test(""));
        Assert.assertTrue(notPredicate.test("Not empty!"));
    }

    @Test
    public void predicate_2(){
        Predicate<String> p1 = s -> s!= null;
        Predicate<String> p2 = s -> !s.isEmpty();
        Predicate<String> p3 = null;

        Assert.assertFalse(p3.test(""));
        Assert.assertFalse(p3.test(null));
        Assert.assertFalse(p3.test("Not empty!"));
    }
}
