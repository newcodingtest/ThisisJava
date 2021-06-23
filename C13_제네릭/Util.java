package C13_제네릭;

public class Util {

    private String t1;

    public String get(Object t, String t1){
        if(t.equals(t1)){
            return t1;
        }else{
            return null;
        }
    }

    public String get() {
        return t1;
    }
}
