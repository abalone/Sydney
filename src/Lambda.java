import scala.Int;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by dihuibao on 1/11/14.
 */
public class Lambda {
    public static void main(String[] args) {
        Comparator<String> comparator = (first, second) -> Integer.compare(first.length(), second.length());

        Function<String, Integer> a = name -> {System.out.println(name); return name.length();};

        System.out.println(a.apply("hello"));
    }
}
