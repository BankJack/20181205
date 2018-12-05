package test3;

import java.util.Arrays;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        /*for (Integer integer : integers) {
            System.out.println(integer);
        }*/

        //integers.stream().forEach(System.out::println);
        //integers.stream().forEach(i -> System.out.println(i));

        //输出偶数
        //integers.stream().filter(t-> t % 2 == 1).forEach(t -> System.out.println(t));

    }
}
