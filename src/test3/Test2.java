package test3;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {

        /*通过lambda表达式实现*/
        TreeSet<Employee> tree = new TreeSet<>(Comparator.comparing(Employee::getBirthday));

        //通过匿名实现类实现定制排序
        /*TreeSet<Employee> tree = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });*/
        Employee e1 = new Employee("张三5",28, LocalDate.of(2000,1,15));
        Employee e2 = new Employee("张三4",22, LocalDate.of(2002,3,15));
        Employee e3 = new Employee("张三3",26, LocalDate.of(2001,7,15));
        Employee e4 = new Employee("张三2",21, LocalDate.of(2008,2,15));
        Employee e5 = new Employee("张三1",28, LocalDate.of(2005,6,15));
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
