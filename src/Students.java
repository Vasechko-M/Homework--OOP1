public class Students {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public Students(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }
public void printDescribe () {
    System.out.println("Имя: " + name);
    System.out.println("Магическая сила: " + magicPower);
    System.out.println("Трансгессия на растояние: " + transgressionDistance);
}
    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public int totalPoints() {
        return magicPower+transgressionDistance;
    }
    public static void compareStudents(Students student1, Students student2 ) {
        if (student1.totalPoints() > student2.totalPoints()) {
            System.out.println(student1.getName()+ " обладает большей мощностью, чем " + student2.getName());

        } else {
            System.out.println(student2.getName()+ " обладает большей мощностью, чем " + student1.getName());

        }
    }



}
