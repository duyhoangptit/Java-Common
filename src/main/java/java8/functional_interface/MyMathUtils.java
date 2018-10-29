package java8.functional_interface;

public class MyMathUtils {
    // Phương thức này có 2 tham số a, b và trả về kiểu int.
    // Phương thức này khác tên,
    // nhưng có cấu trúc giống với MyFunction.doSomething(int,int).
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }
}
