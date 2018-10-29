package java8.functional_interface;

import java.util.function.Function;

public class FuncImpl<T extends String, R extends String> implements Function<T, R> {

    @Override
    public R apply(T t) {
        if(t!= null){
            String result = t.toUpperCase();

            R r = (R) result.toString();

            return r;
        }
        return null;
    }
}
