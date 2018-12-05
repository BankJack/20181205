package test3;

import java.util.stream.IntStream;

public class Test5 {
    public static void main(String[] args) {
        //求1-100的和
        int sum = IntStream.rangeClosed(1,100).sum();
        //System.out.println(sum);
        IntStream.of(10,5,6,999,1000).filter(i -> i % 2 == 1).forEach(t->{
            t += 10;
            System.out.println(t);
        });

    }
}
