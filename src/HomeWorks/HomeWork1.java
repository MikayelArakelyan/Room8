package HomeWorks;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("--------------WeekDays-SwitchCase--------------");
        int x = 7;

        switch (x) {
            case 1, 3, 5:
                System.out.println("Day off");
                break;
            case 2, 4, 6:
                System.out.println("Training day");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("No such week day");

        }
        System.out.println("--------------TreeAngel-Type1--------------");

        int row = 5;
        int element = row;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < element; j++) {
                System.out.print("*");
            }
            element--;
            System.out.println();


        }
        System.out.println("--------------TreeAngel-Type2--------------");

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------Matrix-Array--------------");
        System.out.println();
        int[][] aa = {{100, 101, 102, 103, 104}, {110, 111, 112, 113, 114}, {120, 121, 122, 123, 124}, {130, 131, 132, 133, 134}, {140, 141, 142, 143, 144}};

        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                System.out.print(" " + aa[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------Matrix-ArrayLine1--------------");
        System.out.println();
        for (int i = 0; i < aa.length; i++) {
            System.out.print("---");
            for (int j = 0; j < aa[i].length; j++) {

                if (i == j) {
                    System.out.print(" " + aa[i][j] + " ");
                }
                System.out.print("---");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------Matrix-ArrayLine2--------------");
        System.out.println();
        for (int i = 0; i < aa.length; i++) {
            System.out.print("---");
            for (int j = 0; j < aa[i].length; j++) {

                if (i + j == aa.length - 1) {
                    System.out.print(" " + aa[i][j] + " ");
                }
                System.out.print("---");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------Matrix-TreeAngel1--------------");
        System.out.println();
        for (int i = 0; i < aa.length; i++) {
            System.out.print("---");
            for (int j = 0; j < aa[i].length; j++) {

                if (i <= j && i + j >= aa.length - 1) {
                    System.out.print(" " + aa[i][j] + " ");
                } else {
                    System.out.print("-----");
                }
                System.out.print("---");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------Matrix-TreeAngel2--------------");
        System.out.println();
        for (int i = 0; i < aa.length; i++) {
            System.out.print("---");
            for (int j = 0; j < aa[i].length; j++) {
                if (i >= j) {
                    System.out.print(" " + aa[i][j] + " ");
                } else {
                    System.out.print("-----");
                }
                System.out.print("---");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("--------------Matrix-TreeAngel3--------------");
        System.out.println();
        for (int i = 0; i < aa.length; i++) {
            System.out.print("---");
            for (int j = 0; j < aa[i].length; j++) {

                if (i <= aa.length / 2 && i <= j && i + j < aa.length) {
                    System.out.print(" " + aa[i][j] + " ");
                } else {
                    System.out.print("-----");
                }
                System.out.print("---");
            }
            System.out.println();
        }
    }
}
