package C13_제네릭;

public class Container<T> {
    private T t;


    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }


}
