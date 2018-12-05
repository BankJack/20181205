package test1;

import java.util.Objects;

/**
 * 学生类
 * @author nick
 */
public class Student {
    private int stuNo;
    private String name;
    private int age;
    private char sex;

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Student(int stuNo, String name, int age, char sex) {
        this.stuNo = stuNo;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNo=" + stuNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return stuNo == student.stuNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stuNo);
    }
}
