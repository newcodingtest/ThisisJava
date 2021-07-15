package C14_람다식.함수적인터페이스;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student1> list = Arrays.asList(
            new Student1("홍길동","남자",90),
            new Student1("김순희","여자",90),
            new Student1("김자바","남자",95),
            new Student1("박한나","여자",92)
    );

    public static double avg(Predicate<Student1>predicate){
        int count = 0, sum = 0;
        for (Student1 student : list) {
            if(predicate.test(student)){
                count++;
                sum += student.getScore();
            }
        }
        return (double)sum/count;
    }
    
    public static void main(String[] args){
        double maleAvg = avg(t-> t.getSex().equals("남자"));
        System.out.println("maleAvg = " + maleAvg);
        
        double femaleAvg = avg(t -> t.getSex().equals("여자"));
        System.out.println("femaleAvg = " + femaleAvg);
    }
}
