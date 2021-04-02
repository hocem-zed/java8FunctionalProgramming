package functionalinterface;

import impertaive.Main;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class _Function {
    public static void main(String[] args) {

        // functional programming
        System.out.println(incrementFunc.apply(3));

        // methods chaining: increment the number 2 and multiply it by 10
        int result = incrementFunc.andThen(multiplyByTenFunc).apply(2);
        System.out.printf("Increment 2 by 1 and multiply by 10 = %d \n", result);
        System.out.println(addBy1AndMultiplyBy10.apply(4));

        int increment = increment(0);
        System.out.println(increment);

        // BiFunction: increment 2 by one and multiply it by 100 => 300
        result = incrementAndMultiply.apply(2, 100);
        System.out.println(result);
    }

    // Function: accepts argument and return result
    static Function<Integer, Integer> incrementFunc = number -> number + 1;

    static Function<Integer, Integer> multiplyByTenFunc = number -> number * 10;

    static Function<Integer, Integer> addBy1AndMultiplyBy10 =
            incrementFunc.andThen(multiplyByTenFunc);

    static int increment(int number) {
        return number + 1;
    }

    // BiFunction: accept 2 arguments and return a result
    static BiFunction<Integer, Integer, Integer> incrementAndMultiply = (incr, mult) -> ++incr * mult;
}
