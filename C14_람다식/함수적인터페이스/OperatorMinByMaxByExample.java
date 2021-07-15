package C14_람다식.함수적인터페이스;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
    public static void main(String[] args){
        BinaryOperator<Fruit>opt;
        Fruit fruit;

        opt = BinaryOperator.minBy((f1,f2)->Integer.compare(f1.getPrice(), f2.getPrice()));
        fruit = opt.apply(new Fruit("딸기",6000), new Fruit("수박",10000));
        System.out.println(fruit.getName());

        opt= BinaryOperator.maxBy((f1,f2)->Integer.compare(f1.getPrice(), f2.getPrice()));
        fruit = opt.apply(new Fruit("딸기",6000), new Fruit("수박",10000));
        System.out.println(fruit.getName());
    }
}
