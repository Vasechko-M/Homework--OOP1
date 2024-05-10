public class Griffindor extends Students{
private  int characterized;
private int nobility;
private int courage;

    public Griffindor(String name, int magicPower, int transgressionDistance, int characterized, int nobility, int courage) {
        super(name, magicPower, transgressionDistance);
        this.characterized = characterized;
        this.nobility = nobility;
        this.courage = courage;
    }

    @Override
    public void printDescribe() {
        super.printDescribe();
        System.out.println("Благородство: " + characterized);
        System.out.println("Честь: " + nobility);
        System.out.println("Храбрость: " + courage);
    }
    public int totalPoints() {
        return characterized+nobility+courage;
    }
    public static void compareGriffindorStudents(Griffindor student1, Griffindor student2 ) {
        if (student1.totalPoints() > student2.totalPoints()) {
            System.out.println(student1.getName()+ " лучший Гриффиндорец, чем " + student2.getName());

        } else {
            System.out.println(student2.getName()+ " лучший Гриффиндорец, чем " + student1.getName());

        }
    }
}
