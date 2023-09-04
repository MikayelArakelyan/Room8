public class ArrayLoop {
    public static void main(String[] args) {
        int[] array = {152, 62, 120, 25, 11, 221, 78, 12};
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[result.length - 1 - i] = array[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        System.out.println();


        int[] array1 = {152, 62, 120, 25, 11, 221, 78, 12};
        int[] result1 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            result1[result1.length - 1 - i] = array1[i];
        }
        for (int i = 0; i < result1.length; i++) {
            int finalResult = 0;
            while (result1[i] != 0) {
                finalResult = finalResult * 10 + result1[i] % 10;
                result1[i] = result1[i] / 10;
            }
            result1[i] = finalResult;
            System.out.println(result1[i]);
        }
        System.out.println();


        int[] twins = {7, 51, 78, 46, 5};
        int[] twins1 = {-88, 7, 51, 78, 46, 5};
        int x = 0;
        int y = 0;
        for (int i = 0; i < twins.length; i++) {
            x = x + twins[i];
        }
        for (int i = 0; i < twins1.length; i++) {
            y = y + twins1[i];
        }
        System.out.println(y - x);
        for (int i = 0; i < twins.length; i++) {
            x = x ^ twins[i];
        }
        for (int i = 0; i < twins1.length; i++) {
            y = y ^ twins1[i];
        }
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println(y - x);
        System.out.println("*********************************");
        int temp = 0;
        for (int i = 0; i < twins1.length; i++) {
            for (int j = 1; j < twins1.length - i; j++) {
                if (twins1[j] < twins1[j - 1]) {
                    temp = twins1[j];
                    twins1[j] = twins1[j - 1];
                    twins1[j - 1] = temp;
                }
            }
        }
        System.out.print("*** ");
        for (int i = 0; i < twins1.length; i++) {
            System.out.print(twins1[i] + " *** ");
        }
    }
}
