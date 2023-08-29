public class Test {
    public static void main(String[] args) {
        int x = -2845000;
        int result = 0;
        System.out.println(x);
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        System.out.println(result);
    }
}
