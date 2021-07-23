package C14_람다식.함수적인터페이스;

public class Member1 {
    private String name;
    private String id;

    public Member1() {
        System.out.println("Member() 실행");
    }

    public Member1(String id) {
        System.out.println("Member(String id) 실행");
        this.id = id;
    }

    public Member1(String name, String id) {
        System.out.println("Member(String name, String id) 실행");
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
