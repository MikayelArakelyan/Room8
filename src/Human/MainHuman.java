package Human;

public class MainHuman {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Mikayel";
        human.surname = "Arakelyan";
        human.year = 1989;
        System.out.println(human.name + " " + human.surname);

        Human human1 = new Human();
        human1.name = "Ani";
        human1.surname = "Simonyan";
        human1.year = 1999;
        System.out.println(human1.name + " " + human1.surname);

        if (human1.year < human.year) {
            System.out.println(human1.name);
        } else {
            System.out.println(human.name);
        }

        Student student = new Student();
        student.name = "Mikayel";
        student.surname = "Arakelyan";
        student.year = 1989;
        student.mark = 54;
        double a = student.summery(2, 8);
        student.summery(2, 8);
        System.out.println(student.summery(2,9));
        System.out.println(a);
        student.fullName();
        student.printInfo();
        student.setName("Vigen");
        System.out.println(student.getName());
        student.year=-25;
        System.out.println(student.year);
        student.setYear(-25);
        System.out.println(student.getYear());

    }
}
