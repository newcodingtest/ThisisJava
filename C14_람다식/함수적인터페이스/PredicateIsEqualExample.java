package C14_람다식.함수적인터페이스;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
    public static void main(String[] args){
        Predicate<String> predicate;

        predicate = Predicate.isEqual(null);
        System.out.println("null, null: " +predicate.test(null));

        predicate = Predicate.isEqual("JAVA8");
        System.out.println("null, JAVA8: " + predicate.test(null));

        predicate = Predicate.isEqual(null);
        System.out.println("null, Java8: " + predicate.test("Java8"));

        predicate = Predicate.isEqual("Java7");
        System.out.println("Java7, Java7: " + predicate.test("Java7"));
    }
}
