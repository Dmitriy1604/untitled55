import lombok.Data;

@Data
public class Slytherin extends Hogwarts {
    private int cunning;

    @Override
    public String toString() {
        return "Я " + fullName +
                "\nfaculty="+ "Slytherin" +
                "\ncunning=" + cunning +
                " \ndetermination=" + determination +
                " \nambition=" + ambition +
                " \nresourcefulness=" + resourcefulness +
                " \nlustForPower=" + lustForPower +
                " \nmagic=" + magic +
                " \nteleport=" + teleport ;
    }

    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public void compareStudents(Slytherin studentSecond) {
        int powerOne = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int powerTwo = studentSecond.cunning + studentSecond.determination + studentSecond.ambition + studentSecond.resourcefulness + studentSecond.lustForPower;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " Сильее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(this.fullName + " Сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " Такой же сильный, как " + studentSecond.fullName);
        }

    }

    public Slytherin(String fullName, int magic, int teleport,int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {


        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.cunning =cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;

    }
}
