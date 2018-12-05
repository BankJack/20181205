package test3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
           list.add(i);
        }

        //求1-100的和
  /*      int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println(sum);*/

        int sum = list.stream().filter(t->
            t % 2 == 1
        ).mapToInt(t->t.intValue()).sum();
       // System.out.println(sum);


    }
}
