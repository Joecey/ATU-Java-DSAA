package w5.ie.atu.sw;

import java.util.Date;

// in order to use Comparable interface, a compareTo method must be created!
public class Student {
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
}
