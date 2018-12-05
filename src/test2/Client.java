package test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Map<String,WorldCup> map = Data.getInstance().getData();


        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        String year = input.next();

        WorldCup cup = map.get(year);
        if (cup != null)
            System.out.println(cup);
        else
            System.out.println("没有举办世界杯");
    }
}
