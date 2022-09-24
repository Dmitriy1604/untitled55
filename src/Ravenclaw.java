import lombok.Data;


@Data
public class Ravenclaw  extends Hogwarts{
    private int mind;
    private  int wisdom;
    private int wit;
    private int creation;

    @Override
    public String toString() {
        return "Я " + fullName +
                "\nfaculty="+ "Ravenclaw" +
                "\nmind=" + mind +
                "\nwisdom=" + wisdom +
                "\n wit=" + wit +
                "\ncreation=" + creation +
                "\nmagic=" + magic +
                "\nteleport=" + teleport;
    }

    public Ravenclaw(String fullName, int magic, int teleport, int mind, int wisdom, int wit, int creation) {
        if (mind < 0 || mind > 100) {
            throw new RuntimeException("Неверное значение mind");
        }
        if (wisdom < 0 || wisdom > 100) {
            throw new RuntimeException("Неверное значение wisdom");
        }
        if (creation < 0 || creation > 100) {
            throw new RuntimeException("Неверное значение creation");
        }
        if (wit < 0 || wit > 100) {
            throw new RuntimeException("Неверное значение wit");
        }
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public void compareStudents(Ravenclaw studentSecond) {
        int powerOne = this.mind + this.wisdom + this.wit+ this.creation;
        int powerTwo = studentSecond.mind + studentSecond.wisdom + studentSecond.wit+ studentSecond.creation;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " Сильее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(this.fullName + " Сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " Такой же сильный, как " + studentSecond.fullName);
        }
    }
}
