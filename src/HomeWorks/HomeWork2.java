package HomeWorks;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] array = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 12, -1, -9, -6, -3, -8, -5, -2, -7, -4, -1};
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("--------------211--------------");
        System.out.println();
        int sum = 0;
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
                count++;
            }
        }
        System.out.println(sum / count);
        System.out.println();
        System.out.println("--------------212--------------");
        System.out.println();
        int sum1 = 1;
        double count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum1 = sum1 * array[i];
                count1++;
            }
        }
        System.out.println(sum1 / count1);
        System.out.println();
        System.out.println("--------------213--------------");
        System.out.println();
        int sum2 = 1;
        double count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum2 = sum2 * array[i];
                count2++;
            }
        }
        System.out.println(sum2 / count2);
        System.out.println();
        System.out.println("--------------214--------------");
        System.out.println();
        int sum3 = 0;
        double count3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum3 = sum3 + array[i];
                count3++;
            }
        }
        System.out.println(sum3 / count3);
        System.out.println();
        System.out.println("--------------215--------------");
        System.out.println();
        int sum4 = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum4 = sum4 + array[i];
        }
        System.out.println(sum4);
        System.out.println();
        System.out.println("--------------216--------------");
        System.out.println();
        int sum5 = 1;
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] != 0) {
                sum5 = sum5 * array[i];
            }
        }
        System.out.println(sum5);
        System.out.println();
        System.out.println("--------------219--------------");
        System.out.println();
        int k = 3;
        int sum6 = 0;
        int count4 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                count4++;
            }
        }
        System.out.println(count4);
        System.out.println();
        System.out.println("--------------220--------------");
        System.out.println();
        int negative = 0;
        int positive = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                negative++;
            } else if (array[i] < 0) {
                positive++;
            }
        }
        System.out.println("positive : " + positive + " negative : " + negative);
        System.out.println();
        System.out.println("--------------227--------------");
        System.out.println();
        double kk = 2;
        int sum7 = 0;
        double count5 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % kk == 0) {
                sum7 = sum7 + array[i];
                count5++;
            }
        }
        System.out.println(sum7 / count5);
        System.out.println();
        System.out.println("--------------228--------------");
        System.out.println();
        int sum8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % kk == 0) {
                sum8 = sum8 + array[i];
            }
        }
        System.out.println(sum8);
        System.out.println();
        System.out.println("--------------229--------------");
        System.out.println();
        int sum9 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] - i > 0) {
                sum9 = sum9 + array[i];
            }
        }
        System.out.println(sum9);
        System.out.println();
        System.out.println("--------------231--------------");
        System.out.println();
        int sum10 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum10 = sum10 + array[i] * array[i];
            }
        }
        System.out.println(sum10);
        System.out.println();
        System.out.println("--------------232--------------");
        System.out.println();
        int count6 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count6++;
            }
        }
        System.out.println(count6);
        System.out.println();
        System.out.println("--------------233--------------");
        System.out.println();
        int sum11 = 1;
        int sum12 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                sum11 = sum11 * array[i];
                sum12 = sum12 + array[i];
            }
        }
        System.out.println("sum11 /*/ : " + sum11 + " sum12 /+/ : " + sum12);
        System.out.println();
        System.out.println("--------------234--------------");
        System.out.println();
        int sum13 = 0;
        double count7 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sum13 = sum13 + array[i];
                count7++;
            }
        }
        System.out.println(sum13 / count7);
        System.out.println();
        System.out.println("--------------235--------------");
        System.out.println();
        int sum14 = 0;
        int count8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum14 = sum14 + array[i] * array[i];
                count8++;
            }
        }
        System.out.println(sum14 / count8);
        System.out.println();
        System.out.println("--------------236--------------");
        System.out.println();
        int sum15 = 1;
        int count9 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum15 = sum15 * array[i];
                count9++;
            }
        }
        System.out.println("sum15 : " + sum15 + " count9 : " + count9);
        System.out.println();
        System.out.println("--------------237--------------");
        System.out.println();
        int count10 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count10++;
            }
        }
        System.out.println(count10);
    }
}
