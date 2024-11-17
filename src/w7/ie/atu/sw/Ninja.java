package w7.ie.atu.sw;

public class Ninja implements Comparable<Ninja>{
    private String name;
    private int expertLevel;

    public Ninja(String name, int expertLevel){
        this.name = name;
        this.expertLevel = expertLevel;
    }

    public String getName() {
        return name;
    }

    public int getExpertLevel() {
        return expertLevel;
    }

    public int compareTo(Ninja other) {
        // there's a float.compare() function if needed
        if (this.expertLevel < other.getExpertLevel()) {
            return 1;   // other is greater than me
        } else if (this.expertLevel > other.getExpertLevel()) {
            return -1;  // other is less than me
        } else {
            return 0;
        }
    }
}


