package Recursion;

class NumberPower {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        System.out.println(x + "^" + y + "= " + power(x,y));

    }

    public static int power(int x, int y) {
        if(y == 0) {
            return 1;
        } else if (y == 1) {
            return x;
        } else {
            int a = power(x*x, y / 2);
            if (y % 2 == 1) {
                a *= x;
            }
            return a;
        }
    }
}