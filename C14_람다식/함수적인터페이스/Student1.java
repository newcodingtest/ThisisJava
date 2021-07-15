package C14_람다식.함수적인터페이스;

public class Student1 {
    private String name;
    private String sex;
    private int Score;

    public Student1(String name, String sex, int Score){
        this.name = name;
        this.sex = sex;
        this.Score = Score;
    }

    public String getName(){return name;}
    public String getSex(){return sex;}
    public int getScore(){return Score;}
}
