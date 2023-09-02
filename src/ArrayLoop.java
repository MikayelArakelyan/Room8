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


        int[] twins = {7, 5, 7, 4, 5};
        int x = 0;
        for (int i = 1; i < twins.length; i++) {
            x = x ^ twins[i];
        }

    }
}
