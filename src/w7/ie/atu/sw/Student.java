package w7.ie.atu.sw;

import w5.ie.atu.sw.ComparableStudent;

import java.util.Date;

// in order to use Comparable interface, a compareTo method must be created!
public class Student implements Comparable<Student>{
    private String name;
    private Date dob;
    private float gpa = 0.00f;
    private String id;

    // new constructor
    public Student(String sName, Date dDate, float gpa, String id) {
        this.name = sName;
        this.dob = dDate;
        this.gpa = gpa;
        this.id = id;
    }

    public float getGpa() {
        return this.gpa;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public String getId() {
        return id;
    }

    // now our Comparable method (we can use the implement methods functionality
    public int compareTo(Student other) {
        // there's a float.compare() function if needed
        if (this.gpa < other.getGpa()) {
            return 1;   // other is greater than me
        } else if (this.gpa > other.getGpa()) {
            return -1;  // other is less than me
        } else {
            return 0;
        }
    }
}
