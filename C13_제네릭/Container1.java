package C13_제네릭;

public class Container1<T,M> {
    private T t;
    private  M m;

    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }

    public M getKey() {
        return m;
    }
    public void setKey(M m) {
        this.m = m;
    }

}
