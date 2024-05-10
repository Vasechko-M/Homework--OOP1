public class Ravenclaw extends Students{
private  int smart;
private int wise;
private int witty;
private int fullOfCreativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public void printDescribe() {
        super.printDescribe();
        System.out.println("Ум: " + smart);
        System.out.println("Мудрость: " + wise);
        System.out.println("Остроумие: " + witty);
        System.out.println("Творчество: " + fullOfCreativity);
    }
    public int totalPoints() {
        return smart+wise+witty+fullOfCreativity;
    }
    public static void compareRavenclawStudents(Ravenclaw student1, Ravenclaw student2 ) {
        if (student1.totalPoints() > student2.totalPoints()) {
            System.out.println(student1.getName()+ " лучший Когтевранец, чем " + student2.getName());

        } else {
            System.out.println(student2.getName()+ " лучший Когтевранец, чем " + student1.getName());

        }
    }
}
