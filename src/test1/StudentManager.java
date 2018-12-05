package test1;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    //学生的集合
    private List<Student> list = new ArrayList<>();

    /**
     * 添加学生
     * @param stu 要添加的学生
     * @return true如果添加成功
     */
    public boolean add(Student stu){
        return list.add(stu);
    }

    public boolean modify(Student stu){
        for (int i = 0; i < list.size(); i++) {
            Student student =  list.get(i);
            /*
            * 任何一个学生的学号是唯一的，不重复的
            * 我们可以修改学生的任何信息，但是不能够修改学号
            * */
            if (student.getStuNo() == stu.getStuNo()){
                Student o = list.set(i,stu);
                return o == null ? false : true;
            }
        }
        return false;
    }

    /**
     * 根据学号查询学生
     * @param stuNo
     * @return
     */
    public Student getStudent(int stuNo){
        for (int i = 0; i < list.size(); i++) {
            Student student =  list.get(i);
            if (student.getStuNo() == stuNo){
                return student;
            }
        }
        return null;
    }

    /**
     * 根据学生对象删除学生信息
     * @param stu
     * @return
     */
    public boolean remove(Student stu){
        return list.remove(stu);
    }

    /**
     * 返回所有学生信息
     * @return
     */
    public List<Student> getAll(){
        return list;
    }

}
