package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 课程管理类
 */
public class CourseManager {
    private List<Course> list = new ArrayList<>();

    /**
     * 添加课程
     * @param course
     * @return
     */
    public boolean add(Course course){
        return list.add(course);
    }

    /**
     * 修改课程信息
     * @param course
     * @return
     */
    public boolean modify(Course course){
        for (int i = 0; i < list.size(); i++) {
            Course course1 =  list.get(i);
            if (course.getCourseNo() == course1.getCourseNo()){
                Course o = list.set(i,course);
                return o == null ? false : true;
            }
        }
        return false;
    }

    /**
     * 删除课程信息
     * @param course
     * @return
     */
    public boolean remove(Course course){
        return list.remove(course);
    }

    /**
     * 查询学生的选课信息
     * @param stu
     * @return
     */
    public List<Course> findByStu(Student stu){
        List<Course> courseList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Course course =  list.get(i);
            Set<Student> list = course.getList();//该门课被哪些学生选择了
            for (Student student : list) {//遍历学生集合
                if (student.getStuNo() == stu.getStuNo()){ //判断这个集合中有没有该学生
                    courseList.add(course);
                    break;
                }
            }
        }
        return courseList;
    }

    /**
     * 根据课程编号查找选择该课程的学生信息
     * @param courseNo
     * @return
     */
    public Set<Student> findCourseStudent(int courseNo){
        for (int i = 0; i < list.size(); i++) {
            Course course =  list.get(i);
            if (course.getCourseNo() == courseNo){
                return course.getList();
            }
        }
        return null;
    }

    /**
     * 为指定课程添加选课学生
     * @param course
     * @param student
     * @return
     */
    public boolean addStudent2Course(Course course,Student student){
        for (int i = 0; i < list.size(); i++) {
            Course course1 =  list.get(i);
            if (course.getCourseNo() == course1.getCourseNo()){
                Set<Student> studentSet = course1.getList();//学生集合
                return studentSet.add(student);
            }
        }
        return false;
    }

    /**
     * 从课程中移除学生选择信息
     * @param course
     * @param student
     * @return
     */
    public boolean removeStudentFromCourse(Course course,Student student){
        for (int i = 0; i < list.size(); i++) {
            Course course1 =  list.get(i);
            if (course.getCourseNo() == course1.getCourseNo()){
                Set<Student> studentSet = course1.getList();//学生集合
                return studentSet.remove(student);
            }
        }
        return false;
    }
}
