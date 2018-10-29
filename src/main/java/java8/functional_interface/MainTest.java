package java8.functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MainTest {

    // Tham số thứ 3 của phương thức này là MyFunction (Functional Interface).
    // Khi sử dụng phương thức này:
    // Bạn có thể truyền tham chiếu của một phương thức cho tham số thứ 3.
    // (Các phương thức phải cùng kiểu với MyFunction).
    public static int action(int a, int b, MyFunction func) {
        return func.doSomething(a, b);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(1);
        list.add(0);
        list.add(-2);
        list.add(3);

        // lệnh removeIf sẽ thực hiện duyệt từng phần tử,
        // nếu method test của Predicate trả về true thì sẽ remove phần tử đó khỏi list
        list.removeIf(t -> t < 0);

        list.forEach(t -> System.out.println(t));

        System.out.println("-----------------------------");
        // Sử dụng Predicate với cú pháp Lambda Expression
        // loại bỏ các phần tử lớn hơn 1
        list.removeIf(t -> t > 1);
        list.forEach(t -> System.out.println(t));

        List<String> listStr = Arrays.asList("stack", "JAVA", "demo", "Function");

        Function func = new FuncImpl();

        listStr.stream().map(t -> func.apply(t)).forEach(t -> System.out.println(t));
        System.out.println("-----------------------------");
        int a = 100;
        int b = 30;
        int c = action(a,b, MyMathUtils::sum);
        System.out.println(c);
    }
}
