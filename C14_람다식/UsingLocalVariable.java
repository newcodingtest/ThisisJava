package C14_람다식;

public class UsingLocalVariable {
    void method(int arg){ //arg 매개변수는 final 특성을 가짐
        int localVar = 40; //localVar 는 final 특성을 가짐

        //arg = 13; final 특성 때문에 수정 불가
        //localVar =41; final 특성 때문에 수정 불가 
        
        //람다식
        MyFunctionalInterface fi =() -> {
            System.out.println(arg);
            System.out.println(localVar);
        };
        fi.method();
    }

}
