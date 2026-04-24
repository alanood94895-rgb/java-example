public class love6 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4));
        System.out.println(love6(4, 2));
    }

    public static boolean love6(int a, int b) {
        if (a == 6) {
            return true;
        }
        if (b == 6) {
            return true;
        }
        if (a + b == 6) {
            return true;
        }
        if (Math.abs(a - b) == 6) {
            return true;
        }
return false;
    }

}

