package functionalinterface;

import java.util.List;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        List<Integer> list = List.of(14,2,35,4,15);
        // display only number > 10
        list.stream().filter(greaterThanTen).forEach(System.out::println);

        // exemple simple
        System.out.println(greaterThanTen.test(41));
    }

    static Predicate<Integer> greaterThanTen = number -> number > 10;
}
