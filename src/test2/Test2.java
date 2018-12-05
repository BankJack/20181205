package test2;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<String,WorldCup> map = Data.getInstance().getData();

        Scanner input = new Scanner(System.in);
        System.out.println("请输入球队名称:");
        String team = input.next();

        Set<String> years = new HashSet<>();
        for (String key : map.keySet()) {
            WorldCup cup = map.get(key);
            if (cup.getWinner().equals(team)){
                years.add(key);
            }
        }

        if (years.size() > 0){
            for (String year : years) {
                System.out.println(year);
            }
        } else {
            System.out.println("没有获得过世界杯冠军");
        }

    }
}
