import lombok.Data;


@Data

class Gryffindor extends Hogwarts {
    private int honour;
    private  int nobility;
    private  int bravery;



    public void compareStudents(Gryffindor studentSecond) {
        int powerOne = this.honour + this.nobility + this.bravery;
        int powerTwo = studentSecond.honour + studentSecond.nobility + studentSecond.bravery;
        if (powerOne > powerTwo) {
            System.out.println(this.fullName + " Сильее чем " + studentSecond.fullName);
        } else if (powerTwo > powerOne) {
            System.out.println(this.fullName + " Сильнее чем " + this.fullName);
        } else {
            System.out.println(this.fullName + " такой же сильный, как " + studentSecond.fullName);
        }
    }

    public Gryffindor(String fullName,int magic, int teleport,  int honour, int nobility, int bravery){
        if (honour < 0 || honour > 100) {
            throw new RuntimeException("Неверное значение honour");
        }
        if (honour < 0 || honour > 100) {
            throw new RuntimeException("Неверное значение nobility");
        }
        if (honour < 0 || honour > 100) {
            throw new RuntimeException("Неверное значение bravery");
        }
        this.fullName = fullName;
        this.magic = magic;
        this.teleport = teleport;
        this.honour = honour;
        this.nobility = nobility;
        this.bravery = bravery;
    }


    @Override
    public String toString() {
        return "Я " + fullName +
                "\nfaculty="+ "Gryffindor" +
                "\nhonour=" + honour +
                "\nnobility=" + nobility +
                " \nbravery=" + bravery +
                "\nmagic= " + magic +
                "\nteleport= " + teleport;

    }
}

