public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Harry Potter", 90, 95, 55, 74, 74);
        Griffindor hermiona = new Griffindor("Hermione Granger", 85, 90, 54, 68, 45);
        Griffindor ron = new Griffindor("Ron Weasley", 86, 75, 15, 48, 35);

        Slytherin draco = new Slytherin("Draco Malfoy", 85, 80, 84, 65, 98, 32, 45);
        Slytherin graham = new Slytherin("Graham Montague", 84, 89, 95, 95, 45, 48, 47);
        Slytherin gregory = new Slytherin("Gregory Goyle", 95, 86, 15, 54, 89, 65, 74);

        Hufflepuff zacharias = new Hufflepuff("Zacharias Smith", 75, 70, 85, 64, 75);
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 79, 78, 85, 65, 74);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 83, 65, 36, 69, 85);

        Ravenclaw zhou = new Ravenclaw("Zhou Chang", 87, 85, 85, 85, 69, 69);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 89, 81, 36, 69, 98, 87);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 91, 68, 74, 12, 23, 36);

        ron.printDescribe();
        Griffindor.compareGriffindorStudents(harry, hermiona);
        Ravenclaw.compareRavenclawStudents(zhou, marcus);
        Students.compareStudents(zacharias, padma);


    }
}