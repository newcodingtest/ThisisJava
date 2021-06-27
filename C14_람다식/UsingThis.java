package C14_람다식;

public class UsingThis {
    public int outterField = 10;

    class Inner{
        int innerField = 20;

        void method(){
            MyFunctionalInterface fi = () -> {
                System.out.println("outterField : " + outterField);
                System.out.println("UsingThis.this : " + UsingThis.this.outterField+"\n"); //바깥 객체의 참조를 얻기위해 클래스명.this 사용

                System.out.println("innerField = " + innerField);
                System.out.println("this.innerField: " + this.innerField+"/n"); //람다식 내부에서 this는 Inner 객체를 참조
            };
            fi.method();
        }
    }
}
