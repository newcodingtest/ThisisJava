package C14_람다식.함수적인터페이스;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
    public static void main(String[] args){
        Consumer<Member> cm_A = (m) -> {
            System.out.println("consumer A: " +m.getName());
        };

        Consumer<Member> cm_B = (m) -> {
            System.out.println("consumer B: " +m.getId());
        };

        Consumer<Member> cm_AB = cm_A.andThen(cm_B);
        cm_AB.accept(new Member("홍길동","hong", null));

    }
}
