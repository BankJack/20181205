package test3;

import java.time.LocalDate;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        Employee e1 = new Employee("张三5",28, LocalDate.of(2000,1,15));
        Employee e2 = new Employee("张三4",22, LocalDate.of(2000,1,15));
        Employee e3 = new Employee("张三3",26, LocalDate.of(2000,1,15));
        Employee e4 = new Employee("张三2",21, LocalDate.of(2000,1,15));
        Employee e5 = new Employee("张三1",28, LocalDate.of(2000,1,15));
        TreeSet<Employee> tree = new TreeSet<>();
        tree.add(e1);
        tree.add(e2);
        tree.add(e3);
        tree.add(e4);
        tree.add(e5);

        for (Employee employee : tree) {
            System.out.println(employee);
        }
    }
}
