package w5.ie.atu.sw;

import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student> {
    public int compare(Student stu1, Student stu2) {
        if (stu1.getGpa() < stu2.getGpa()) {
            return 1;
        } else if (stu1.getGpa() > stu2.getGpa()) {
            return -1;
        } else {
            return 0;
        }
    }
}
