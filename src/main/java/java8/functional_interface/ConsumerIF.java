package java8.functional_interface;

@FunctionalInterface
public interface ConsumerIF<T> {
    boolean accept(T t);
}
