package w8.ie.atu.sw;

public class RevisionExercises {
    public static void main(String[] args) {
        System.out.println("Week 8 - revision exercises");
        //Declaration 1
        Legume legume = new JumpingBean("Big jumper");
        Bean bean = (Bean) legume;
        bean.grow();

        // Declaration 2
        Legume legume2 = new JumpingBean("Big jumper 2");
        legume2 = new Pea("Pea pea");
        legume2.grow();
        legume2.mush(); // won't work as it still has the methods of Legume or JumpingBean

        // Declaration 3
        Legume legume3 = new JumpingBean("Big jumper 3");
        Pea pea = (Pea) legume3;    // down-casting but, jumpingBean can't be down-casted to Pea as it's on another line?
        pea.mush();
    }
}
