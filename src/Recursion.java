public class Recursion {

    public static void main(String [] args) {
        System.out.println(exponent(3, 4));
        System.out.println(exponent(3, 0));

        System.out.println(expRecursive(3, 4));
        System.out.println(expRecursive(3, 0));


        //hi();

        countDownFrom(10);
        System.out.println();
        countUpTo(20);


        System.out.println();
        for (int i = 1; i <= 60; i++)
            System.out.print(fibL(i) + " ");

        System.out.println();
        for (int i = 1; i <= 60; i++)
            System.out.print(fibR(i) + " ");


    }

    //recursion - a method can call itself
    //-if you're not careful, infinite recursion can occur
    //(like an infinite loop)
    //-need a way to stop the recursive method calls

    public static void hi() {
        System.out.println("hi");
        hi();
    }

    //write this method to calculate the
    //exponent of any non-negative base and power
    public static int exponent(int base, int pow) {
        int product = 1;
        for (int i = 0; i < pow; i++) {
            product *= base;
        }
        return product;
    }

    // 2^4 = 2 * 2 * 2 * 2
    //     = 2 * 2^3
    // 2^3 = 2 * 2^2
    // 2^2 = 2 * 2^1
    // 2^1 = 2 * 2^0
    // 2^0 = 1
    //to stop a recursive method from
    // continuing to call itself, need to find the base case
    //-the base case is the simplest form of the problem
    //for exponents, the base case is when the pow is 0
    //bc any number raised to the 0th power is 1

    public static int expRecursive(int base, int pow) {
        if (pow == 0) {
            return 1;
        }
        //if the original base is 2 and pow is 4
        //it returns 2 * 2^3
        else {
            return base * expRecursive(base, pow - 1);
        }
    }

    //any recursive method can always be written with a loop
    //instead
    //-on tests, you're never forced to write your code
    //using recursive methods

    //print numbers in sequence decrementing from max down to 1
    public static void countDownFrom(int max) {

        //base case bc any number that you pass as max
        //should end with printing 1
        if (max == 1) {
            System.out.print(max);
        }
        else {
            System.out.print(max + " ");

            //when you make the recursive method call, change the argument
            //so that it will eventually reach the base case (max == 1)
            countDownFrom(max - 1);
        }
    }

    public static void countUpTo(int max) {
        if (max == 1)
            System.out.print(max + " ");
        else {
            countUpTo(max-1);

            //this print statement cannot run until AFTER
            //the recursive method call has finished
            //when you call countUpTo(3), 3 won't print until
            //after countUpTo(2) finishes

            System.out.print(max + " ");
        }
    }

    //fibonacci sequence - first two terms are 1
    //after that, every subsequent term is the sum
    //of the previous two
    // 1 1 2 3 5 8 13 21 34 55

    // f(1) = 1
    // f(2) = 1
    // f(3) = f(1) + f(2)
    // f(n) = f(n-1) + f(n-2)

    public static int fibR(int n) {
        if(n == 1 || n == 2)
            return 1;
        else
            return fibR(n-1) + fibR(n-2);
    }

    //try to write the same method using a loop instead of recursion
    public static int fibL(int n) {
        int prev2 = 0;
        int prev1 = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            prev2 = prev1;
            prev1 = current;
            current = prev2 + prev1;
        }
        return current;
    }
}
