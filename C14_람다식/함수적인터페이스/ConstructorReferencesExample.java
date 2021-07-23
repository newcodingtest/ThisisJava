package C14_람다식.함수적인터페이스;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
    public static void main(String[] args){
        Function<String, Member1> function1 = Member1 :: new;
        Member1 member1 = function1.apply("angel");

        BiFunction<String, String, Member1> function2 = Member1 :: new;
        Member1 member2 = function2.apply("신천사","angel");
    }
}
