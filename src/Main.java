public class Main {
    public static void main(String[] args) {
        int row = 5;
        int element = row;

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j < element; j++) {
                System.out.print("*");
            }
            element--;
            System.out.println();
        }
        int[][] aa = {{15, 53, 68, 49, 87}, {11, 51, 62, 41, 84}, {21, 52, 67, 94, 88}, {91, 15, 26, 54, 68}, {10, 50, 62, 41, 18}};
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                System.out.print(aa[i][j] + " ");
            }
            System.out.println();
        }
    }

}