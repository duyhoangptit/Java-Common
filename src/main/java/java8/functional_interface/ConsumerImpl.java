package java8.functional_interface;

public class ConsumerImpl<T> implements ConsumerIF<T> {

    @Override
    public boolean accept(T t) {
        System.out.println(t);
        return t != null;
    }
}
