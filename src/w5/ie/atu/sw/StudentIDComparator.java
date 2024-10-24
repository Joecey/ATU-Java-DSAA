package w5.ie.atu.sw;

import java.util.Comparator;

public class StudentIDComparator implements Comparator<Student> {
    public int compare(Student stu1, Student stu2){
        return stu1.getId().compareTo(stu2.getId());
    }
}
