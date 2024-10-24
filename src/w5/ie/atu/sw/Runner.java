package w5.ie.atu.sw;

import java.util.Comparator;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Comparable Interface");
        ComparableStudent stu1 = new ComparableStudent("John", new Date(), 3.5f);
        ComparableStudent stu2 = new ComparableStudent("Bob", new Date(), 4.0f);
        ComparableStudent stu3 = new ComparableStudent("Billy", new Date(), 1.2f);
        ComparableStudent stu4 = new ComparableStudent("Emma", new Date(), 3.5f);

        System.out.println("Compare stu1 to stu2: " + stu1.compareTo(stu2));
        System.out.println("Compare stu1 to stu3: " + stu1.compareTo(stu3));
        System.out.println("Compare stu2 to stu3: " + stu2.compareTo(stu3));
        System.out.println("Compare stu1 to stu4: " + stu1.compareTo(stu4) + "\n");

        System.out.println("Comparator Interface");
        Student st1 = new Student("John", new Date(), 3.5f, "8");
        Student st2 = new Student("Bob", new Date(), 4.0f, "10");
        Student st3 = new Student("Billy", new Date(), 1.2f, "2");
        Student st4 = new Student("Emma", new Date(), 3.5f, "100");

        StudentGPAComparator studentGPAComparator = new StudentGPAComparator();
        StudentIDComparator studentIDComparator = new StudentIDComparator();
        System.out.println("Compare stu1 to stu2: " + studentGPAComparator.compare(st1, st2));
        System.out.println("Compare stu2 to stu4: " + studentIDComparator.compare(st2, st4) + "\n");


    }
}
