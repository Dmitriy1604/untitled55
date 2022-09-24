import lombok.Data;


@Data



public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    @Override
    public String toString() {
        return "Я " + fullName +
                "\nfaculty="+ "Hufflepuff" +
                "\nindustriousness=" + industriousness +
                " \nloyalty=" + loyalty +
                "\nhonesty=" + honesty +
                " \nmagic=" + magic +
                " \nteleport=" + teleport;
    }

    public Hufflepuff(String fullName, int magic, int teleport, int industriousness, int loyalty, int honesty) {
        if (industriousness < 0 || industriousness > 100) {
            throw new RuntimeException("Неверное значение industriousness");
        }
        if (loyalty < 0 || loyalty > 100) {
            throw new RuntimeException("Неверное значение loyalty");
        }
        if (honesty < 0 || honesty > 100) {
            throw new RuntimeException("Неверное значение honesty");
        }

        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void compareStudents(Hufflepuff studentSecond) {
        int powerOne = this.industriousness + this.loyalty + this.honesty;
        int powerTwo = studentSecond.industriousness + studentSecond.loyalty + studentSecond.honesty;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " Сильее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(this.fullName + " Сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " Такой же сильный, как " + studentSecond.fullName);
        }
    }
}
