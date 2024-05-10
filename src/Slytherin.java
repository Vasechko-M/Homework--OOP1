public class Slytherin extends Students{
private int cunning;
private int determination;
private int ambition;
private int resourcefulness;
private int thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public void printDescribe() {
        super.printDescribe();
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + determination);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Жажда власти " + thirstForPower);
    }
    public int totalPoints() {
        return cunning+determination+ambition+resourcefulness+thirstForPower;
    }
    public static void compareSlytherinStudents(Slytherin student1, Slytherin student2 ) {
        if (student1.totalPoints() > student2.totalPoints()) {
            System.out.println(student1.getName()+ " лучший Слизеринец, чем " + student2.getName());

        } else {
            System.out.println(student2.getName()+ " лучший Слизеринец, чем " + student1.getName());

        }
    }
}
