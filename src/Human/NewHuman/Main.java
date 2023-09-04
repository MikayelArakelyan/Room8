package Human.NewHuman;

public class Main {
    public static void main(String[] args) {
        NewStudent newStudent1 = new NewStudent();
        newStudent1.newName = "Mikayel";
        newStudent1.newSurname = "Arakelyan";
        newStudent1.newGender = 'm';
        newStudent1.newStudentCard = 123456;
        newStudent1.newYear = 1989;
        newStudent1.newIsArmenian = true;
        newStudent1.newMark = 66.6;

        NewStudent newStudent2 = new NewStudent();
        newStudent2.newName = "Ivan";
        newStudent2.newSurname = "Ivanov";
        newStudent2.newGender = 'm';
        newStudent2.newStudentCard = 234567;
        newStudent2.newYear = 1978;
        newStudent2.newIsArmenian = false;
        newStudent2.newMark = 82.3;

        NewStudent newStudent3 = new NewStudent();
        newStudent3.newName = "Hranush";
        newStudent3.newSurname = "Hakobyan";
        newStudent3.newGender = 'f';
        newStudent3.newStudentCard = 111111;
        newStudent3.newYear = 1958;
        newStudent3.newIsArmenian = true;
        newStudent3.newMark = 99.9;


        NewStudent newStudent4 = new NewStudent();
        newStudent4.newName = "Alla";
        newStudent4.newSurname = "Pugachova";
        newStudent4.newGender = 'f';
        newStudent4.newStudentCard = 012345;
        newStudent4.newYear = 1999;
        newStudent4.newIsArmenian = false;
        newStudent4.newMark = 41.8;
        System.out.println();
        System.out.println("-----------IsArmenian-----------");

        if (newStudent1.newIsArmenian == true) {
            System.out.println(newStudent1.newName);
        }
        if (newStudent2.newIsArmenian == true) {
            System.out.println(newStudent2.newName);
        }
        if (newStudent3.newIsArmenian == true) {
            System.out.println(newStudent3.newName);
        }
        if (newStudent4.newIsArmenian == true) {
            System.out.println(newStudent4.newName);
        }
        System.out.println();
        System.out.println("-----------Gender_Female-----------");
        System.out.println();
        if (newStudent1.newGender == 'f') {
            System.out.println(newStudent1.newName + " " + newStudent1.newSurname);
        }
        if (newStudent2.newGender == 'f') {
            System.out.println(newStudent2.newName + " " + newStudent2.newSurname);
        }
        if (newStudent3.newGender == 'f') {
            System.out.println(newStudent3.newName + " " + newStudent3.newSurname);
        }
        if (newStudent4.newGender == 'f') {
            System.out.println(newStudent4.newName + " " + newStudent4.newSurname);
        }
        System.out.println();
        System.out.println("-----------Lowest_Mark-----------");
        System.out.println();
        if (newStudent1.newMark < newStudent2.newMark && newStudent1.newMark < newStudent3.newMark && newStudent1.newMark < newStudent4.newMark) {
            System.out.println(newStudent1.newName + " : " + newStudent1.newMark);
        } else if (newStudent2.newMark < newStudent1.newMark && newStudent2.newMark < newStudent3.newMark && newStudent2.newMark < newStudent4.newMark) {
            System.out.println(newStudent2.newName + " : " + newStudent2.newMark);
        } else if (newStudent3.newMark < newStudent1.newMark && newStudent3.newMark < newStudent2.newMark && newStudent3.newMark < newStudent4.newMark) {
            System.out.println(newStudent3.newName + " : " + newStudent3.newMark);
        } else {
            System.out.println(newStudent4.newName + " : " + newStudent4.newMark);
        }
        System.out.println();
        System.out.println("-----------The_Eldest-----------");
        System.out.println();
        if (newStudent1.newYear < newStudent2.newYear && newStudent1.newYear < newStudent3.newYear && newStudent1.newYear < newStudent4.newYear) {
            System.out.println(newStudent1.newName + " : " + newStudent1.newSurname + " : " + newStudent1.newYear);
        } else if (newStudent2.newYear < newStudent1.newYear && newStudent2.newYear < newStudent3.newYear && newStudent2.newYear < newStudent4.newYear) {
            System.out.println(newStudent2.newName + " : " + newStudent2.newSurname + " : " + newStudent2.newYear);
        } else if (newStudent3.newYear < newStudent1.newYear && newStudent3.newYear < newStudent1.newYear && newStudent3.newYear < newStudent4.newYear) {
            System.out.println(newStudent3.newName + " : " + newStudent3.newSurname + " : " + newStudent3.newYear);
        } else {
            System.out.println(newStudent4.newName + " : " + newStudent4.newSurname + " : " + newStudent4.newYear);
        }
    }
}
