public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter", 45, 67,14,36,87);
        Gryffindor ronUizly = new Gryffindor("Ron Uizly", 23, 45,56,34,56);
        Ravenclaw jayJank = new Ravenclaw("Jay Jank", 34,67,23,45,67,78);
        Ravenclaw pandaPatil =  new Ravenclaw("Panda Patil", 45,67,45,23,78,90);
        Hufflepuff zarahriaSmith = new Hufflepuff("Zarahria Smith",45,67, 23,12,23);
        Hufflepuff sedrikDiggory = new Hufflepuff("Sedrik Diggory",45,67, 23,12,23);
        Slytherin dragoMalfoy  = new Slytherin("Drago Malfoy",34,56,23,34,56,67,34);
        Slytherin gregoryGoyl  = new Slytherin("Gregory Goyl",23,45,45,56,67,23,45);
        harryPotter.compareStudents(ronUizly);
        Hogwarts.compareStudents(harryPotter, dragoMalfoy);
        System.out.println();
        jayJank.compareStudents(pandaPatil);
        Hogwarts.compareStudents(jayJank,pandaPatil);
        System.out.println();
        zarahriaSmith.compareStudents(sedrikDiggory);
        Hogwarts.compareStudents(zarahriaSmith,sedrikDiggory);
        System.out.println();
        dragoMalfoy.compareStudents(gregoryGoyl);
        Hogwarts.compareStudents(dragoMalfoy,sedrikDiggory);
        System.out.println();
    }

}