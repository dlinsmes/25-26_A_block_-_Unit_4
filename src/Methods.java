public class Methods {

    public static void main(String [] args) {

        //write code that will calculate the sum of values
        //between 2 provided numbers:
        //ex 4 and 8 --> 4 + 5 + 6 +7 + 8
        int small = 4;
        int big = 8;

        int sum = 0;
        for (int i = small; i <= big; i++) {
            sum += i;
        }
        System.out.println("sum between " + small + " and " + big
        + " is " + sum);

        //methods aka functions let you define code that can
        //be reused multiple times throughout the program

        //call (use) the method and we pass two int values
        //-to pass a value means to provide the function with
        //data that matches the defined parameters
        //-arguments (values passed) need to match the data type,
        //quantity, and sequence of the defined parameters
        //-this method call will trigger the method code to run,
        //but nothing is done with the returned value
        sumBtwn(10, 20);

        //save the returned value from the method call to the
        //s2 variable
        //-the variable type needs to match the method return
        //type
        int s2 = sumBtwn(20, 50);
        System.out.println(s2);

        //can directly print the method call, but this won't
        //save the returned value for later use
        System.out.println(sumBtwn(100, 106));

        //you can treat a method call like a variable of the
        //matching return type and pass one method call to
        //another
        //want the sum between 1-10 and 100
        int bigSum = sumBtwn( sumBtwn(1, 10),  100 );
        System.out.println(bigSum);

        System.out.println(flipCoin());

        print("hi");

        //print() doesn't return anything
        //String s = print("hi");

        printFactorial(8);

        //void return - can't be saved
        //int y = printFactorial(8);
    }

    //define methods inside the class but outside of main()
    //-for now, all method definitions start with public static
    //- int is the return type - the method will produce data
    //of this type - methods can have void returns (like main)
    //which means that the method doesn't produce any data
    //- sumBtwn is the method name - use this to call (use) this
    //method elsewhere
    //int s and int b are parameters - variables that get used
    //by the method - treat like variable declarations
    public static int sumBtwn(int s, int b) {

        int sum = 0;
        for (int i = s; i <= b; i++) {
            sum += i;
        }

        return sum;

        //there will be red until the method has a return statement
        //returning data of the correct return type
    }

    //parameters are optional - if the method needs input,
    //add parameters
    public static String flipCoin() {
        //a method can have multiple return statements, but
        //as soon as one is reached, the method stops there
        //and no further code gets executed
        if (Math.random() > .5) {
            return "Heads";
            //any code after the return won't get reached
            //System.out.println("fdasfdas");
        }
        return "Tails";
    }

    //void - no return
    public static void print(String s) {
        System.out.println(s);
    }

    public static void printFactorial(int n) {
        int product = 1;
        for (int i = 1; i <= n; i++)
            product *= i;

        //-can call methods in other methods
        //-print wants a string argument - to convert a num to
        //a string, just add an empty string
        print(""+product);
    }
}
