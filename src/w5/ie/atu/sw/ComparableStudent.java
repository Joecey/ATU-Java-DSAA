package w5.ie.atu.sw;

import java.util.*;

// in order to use Comparable interface, a compareTo method must be created!
public class ComparableStudent implements Comparable<ComparableStudent> {
    private String name;
    private Date dob;
    private float gpa = 0.00f;

    // new constructor
    public ComparableStudent(String sName, Date dDate, float gpa) {
        this.name = sName;
        this.dob = dDate;
        this.gpa = gpa;
    }

    public float getGpa() {
        return this.gpa;
    }

    // now our Comparable method (we can use the implement methods functionality
    public int compareTo(ComparableStudent other) {
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
