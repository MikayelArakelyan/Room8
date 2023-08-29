public class Main {
    public static void main(String[] args) {
        int a = 1, b = 5555, c = 1892;
        if (a == 1 || b == 1 || c == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println((a == 1 || b == 1 || c == 1) ? true : false);
        if (a % 2 != 0) {
            System.out.println("test");

        }


        switch (a) {
            case 1, 2, 3:
                System.out.println("Test");
        }

        while (a > -2) {
            System.out.println(a-- + "tester");
        }
    }
}