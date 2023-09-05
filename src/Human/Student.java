package Human;

public class Student {
    public String name;
    public String surname;
    public int year;
    public double mark;
    public boolean isArmenian;
    public char gender;

    public double summery(int x, int z) {
        int y = x + z;
        return y;
    }

    public void fullName() {
        System.out.println(name + " " + surname);
    }

    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Mark : " + mark);
        System.out.println("Is Armenian : " + isArmenian);
        System.out.println("Year : " + year);
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public int setYear(int v) {
        if (!(year < 0)) {
            return v;
        } else {
            return -1;
        }
    }

    public int getYear() {
        return year;
    }

}
