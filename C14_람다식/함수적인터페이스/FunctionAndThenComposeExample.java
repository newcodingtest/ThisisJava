package C14_람다식.함수적인터페이스;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
    public static void main(String[] args){
        Function<Member, Address> functionA;
        Function<Address, String> functionB;
        Function<Member, String> functionAB;
        String city;

        functionA = (m) -> m.getAddress();
        functionB = (a) -> a.getCity();

        //functionA 안의 값을 먼저 처리하고 andThen의 functionB으로 전달
        functionAB = functionA.andThen(functionB);
        city = functionAB.apply(
                new Member("홍길동","hong",new Address("한국","서울"))
        );

        System.out.println("거주도시: "+city);

        //compose 안의 값을 먼저 처리하고 functionB로 전달 
        functionAB = functionB.compose(functionA);
        city = functionAB.apply(
                new Member("홍길동","hong",new Address("한국","서울"))
        );
        System.out.println("거주도시: " + city);

    }
}
