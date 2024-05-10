public class Hufflepuff extends Students{
private  int hardworking;
private int loyal;
private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public void printDescribe() {
        super.printDescribe();
        System.out.println("Трудолюбие: " + hardworking);
        System.out.println("Верность " + loyal);
        System.out.println("Честность " + honest);
    }
    public int totalPoints() {
        return hardworking+loyal+honest;
    }
    public static void compareHufflepuffStudents(Hufflepuff student1, Hufflepuff student2 ) {
        if (student1.totalPoints() > student2.totalPoints()) {
            System.out.println(student1.getName()+ " лучший Пуффендуец, чем " + student2.getName());

        } else {
            System.out.println(student2.getName()+ " лучший Пуффендуец, чем " + student1.getName());

        }
    }
}
