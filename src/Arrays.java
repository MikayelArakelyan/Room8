public class Arrays {
    public static void main(String[] args) {
        int[] array = {12, 35, 10, 98, 10, 75};
        int max = array[0];
        int index = 0;
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println("index: " + index);
        System.out.println();
    }
}
