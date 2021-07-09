package C14_람다식.함수적인터페이스;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동", 90, 96),
            new Student("신용권",95, 93)
    );
    public static double avg(ToIntFunction<Student>function) {
        int sum = 0;
        for (Student student : list) {
            sum += function.applyAsInt(student);
        }
        double avg = (double)sum/list.size();
        return avg;
    }

    public static void main(String[] args){
        System.out.println(" [영어 평균 점수] ");
        double en = avg(s -> s.getEnglishScore());
        System.out.println(en);

        System.out.println(" [수학 평균 점수] ");
        double ma = avg(s -> s.getMathScore());
        System.out.println(ma);
    }
}
