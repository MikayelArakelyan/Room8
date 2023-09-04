package HomeWorks;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------------HomeWork2_Task1---------------");
        System.out.println();
        int[] array = new int[2];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("---------------HomeWork2_Task2---------------");
        System.out.println();
        int[] array1 = new int[25];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 1;
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("---------------HomeWork2_Task3---------------");
        System.out.println();
        int count = 0;
        for (int j = -20; j <= 20; j += 2) {
            count++;
        }
        int[] array2 = new int[count];
        int i = -20;
        for (int j = 0; j < array2.length; j++) {
            if (i <= 20) {
                array2[j] = i;
                i += 2;
            }
        }
        for (int x : array2) {
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println();
        System.out.println("---------------HomeWork3_Task4---------------");
        System.out.println();
        double[] doubles = {25, 12, 11.2, -5, -45, 15.5, 6.3, 467.1, 8, 55, 90.1, 35, 550};
        System.out.println("New double array");
        for (double x : doubles) {
            System.out.print(x + ", ");
        }
        System.out.println();
        System.out.println();
        for (int j = 0; j < doubles.length; j++) {
            if (doubles[j] % 5 == 0) {
                System.out.print(doubles[j] + ", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("---------------HomeWork3_Task5---------------");
        System.out.println();
        for (int j = 0; j < doubles.length; j++) {
            if (doubles[j] >= 24.12 && doubles[j] <= 467.23) {
                System.out.print(doubles[j] + ", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("---------------HomeWork3_Task6---------------");
        System.out.println();
        int count1 = 0;
        for (int j = 0; j < doubles.length; j++) {
            if (doubles[j] % 2 == 0) {
                count1++;
            }
        }
        System.out.println(count1);
        System.out.println();
        System.out.println("---------------HomeWork4_Task7---------------");
        System.out.println();
        int n = 21;
        int count2 = n;
        System.out.println("input N = " + n);
        System.out.println("Output");
        for (int j = 1; j < 21; j++) {
            System.out.println(n + " x " + j + " = " + count2);
            count2 = count2 + n;
        }
    }
}
