package test1;

import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * 课程
 * @author nick
 */
public class Course {
    private int courseNo;
    private String courseName;
    /*学生选课信息*/
    private Set<Student> set;

    public int getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<Student> getList() {
        return set;
    }

    public void setList(Set<Student> set) {
        this.set = set;
    }

    public Course(int courseNo, String courseName) {
        this.courseNo = courseNo;
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseNo == course.courseNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseNo);
    }
}
