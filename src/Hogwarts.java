import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public abstract class Hogwarts {
    String fullName;
    int magic;
    int teleport;

    public static void compareStudents(Hogwarts studentFirst, Hogwarts studentSecond){
        int powerOne = studentFirst.magic + studentFirst.teleport;
        int powerTwo = studentSecond.magic+ studentSecond.teleport;
        if (powerOne>powerTwo) {
            System.out.println(studentSecond.fullName + " Сильее чем " + studentFirst.fullName);
        } else if (powerTwo>powerOne){
            System.out.println(studentSecond.fullName + " Сильнее чем " + studentFirst.fullName);
        } else {
            System.out.println(studentFirst.fullName + " такой же сильный, как "+ studentSecond.fullName);
        }
    }

    public void  setMagic(int magic) {
        if (magic<0 || magic>100){
            throw new RuntimeException("Веденено неверное значение");
        }
        this.magic = magic;
    }
    public  void setTeleport(int teleport) {
        if(teleport<0 || teleport>100) {
            throw new RuntimeException("Веденено неверное значение");
        }
        this.teleport = teleport;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
