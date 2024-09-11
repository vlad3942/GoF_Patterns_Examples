package ru.vladislav.gof.examples.gof_patterns_examples.creative_patterns.n3_prototype.problem_and_solution;

import java.util.function.Function;

/**
 * @author Vladislav
 */
public class Main {
    public static void main(String[] args) {
        var some = timer(p -> new SomeClass());
        System.out.println(some);

        System.out.println("Clone...");
        var someCopy = timer(p -> {
            try {
                return (SomeClass) some.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(someCopy);

    }

    private static <T> T timer(Function<?, T> f) {
        long timeBegin = System.currentTimeMillis();
        System.out.println("timeBegin = " + timeBegin);
        T result = f.apply(null);
        long timeEnd = System.currentTimeMillis();
        System.out.println("timeEnd = " + timeEnd);
        System.out.println("Delta: " + (timeEnd - timeBegin) + "ms");
        return result;
    }
}
