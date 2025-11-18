public class OverloadedMethods {

    //string methods:
    //-substring(int start) - return type String - gives the part
    //of the string beginning at start until the end of the string
    //-substring(int start, int end) - return type String -
    //gives the part of the string beginning at start until
    //end (exclusive)
    //-length() - return type int - how many chars
    //-equals(String other) - return type boolean - true when
    //other is the same, false otherwise
    //new:
    //-indexOf(String substring) - returns int - gives the first
    //index where the substring occurs in the larger string,
    //or -1 if it doesn't appear in the string
    //-split(String del) - returns String array - each element
    //of the returned array is a portion of the original split by
    //the del String
    //-compareTo(String other) - returns int - used to alphabetize
    //strings
    // - returns 0 when other is the same as word
    // a negative number when the original string comes sequentially before other
    // a positive number when the original string comes sequentially after other

    public static void main(String [] args) {
        System.out.println(howManyLetters("banana", "a"));

        //1 bc that's the position of the first a
        System.out.println("banana".indexOf("a"));
        //2 bc that's the starting position of the first na
        System.out.println("banana".indexOf("na"));
        //-1 when the substring isn't in the string
        System.out.println("banana".indexOf("c"));

        String sentence = "mr lin and zach both don't like intellij";
        //split the sentence to separate each word that has a space next to it
        String [] words = sentence.split(" ");
        for (String s: words)
            System.out.println(s);

        String a = "potato";
        String b = "apple";

        //left to right, if the strings are already in order - get negative return
        //left to right, if the strings are out of order, get positive

        //returns positive - potato (a) comes alphabetically after apple (b)
        System.out.println(a.compareTo(b));

        //returns negative - apple (b) comes alphabetically before potato (a)
        System.out.println(b.compareTo(a));

        //returns 0 - same string
        System.out.println(a.compareTo("potato"));

        //call the version of max with 2 int params bc we pass 2 int arguments
        System.out.println( max(5, 10) );

        //3 args - call the version with 3 int params
        System.out.println( max(5, 10, 20) );

        //calls the print() that takes an int param
        print(25);
    }

    //warm up
    //count and return how many times letter occurs in word
    public static int howManyLetters(String word, String letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            //to get a single char, use consecutive indices for substring
            String currentLetter = word.substring(i, i+1);
            if (currentLetter.equals(letter)) {
                count++;
            }
        }
        //return after the loop finishes
        return count;
    }

    //overloaded methods - you can have two methods of the same name as long as
    //the method signatures are different
    //-method signature is the method name and set of parameters: data type, quantity, and sequence
    //-substring() is overloaded bc there's one version with one int param, another with two int params

    public static int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    //same method name, different param type, sequence, or quantity
    public static int max(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        return c;
    }

    //the param names don't get considered - this wouldn't work bc it conflicts with the first version
//    public static int max(int c, int d) {
//        return 0;
//    }

    //valid - bc one param is now a double
    public static int max(double a, int b) {
        if (a > b)
            return (int) a;
        return b;
    }

    //also valid - the sequence of params changes
    public static int max(int a, double b) {
        if (a > b)
            return a;
        return (int) b;
    }

    public static void print(String s) {
        System.out.println(s);
    }
    public static void print(int i) {
        //can call one overloaded method from another
        print("" + i);
    }

}
