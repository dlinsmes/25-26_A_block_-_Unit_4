public class VariableScope {

    public static void main(String [] args) {
        int [] array  = {4, 7, 1, 3, 2};
        sort(array);
        for (int n: array)
            System.out.print(n + " ");
        System.out.println();

        String [] stuff = {"potato", "arya", "fork", "saidi", "bob", "fish", "bert"};
        sort(stuff);
        for (String s: stuff)
            System.out.println(s);

        System.out.println();

        String sentence = "sawyer lives in potato";
        String [] sWords = sentence.split(" ");
        sort(sWords);
        for (String s: sWords)
            System.out.println(s);


        //variable scope - parameters and variables local to methods only
        //exist within those methods
//        nums[0] = 4;
//        nums2[1] = 2;

        int a = 9;
        double b = 2.3;
        boolean c = false;
        String d = "not a potato";
        blah(a, b, c, d, array);
        System.out.println(a + " " + b + " " + c + " " + d);
        //for these data types (int, double, boolean, and string)
        //if you pass a value to a method and the method assigns them new values
        //the original variables are not affected

        //for arrays, any changes that a method makes to the array WILL be seen
        //elsewhere
        for (int n: array)
            System.out.print(n + " ");
    }

    public static void blah(int i, double d, boolean b, String s, int [] nums) {
        i = -1;
        d = 4;
        b = true;
        s = "potato";
        nums[0] = 100;
    }

    //warm up - implement the sorting alg of your choice
    //-try to write it from memory/logic, without looking
    //-increasing order
    public static void sort(int [] nums) {
        int [] nums2;
        for (int i = 0; i < nums.length; i++) {
            int swapI = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] < nums[swapI]) {
                    swapI = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[swapI];
            nums[swapI] = temp;
        }
    }
    //overloaded version of sort - different set of params
    public static void sort(String [] words) {
        for (int i = 0; i < words.length; i++) {
            int swapI = i;
            for (int j = i+1; j < words.length; j++) {
                if ( words[swapI].compareTo(words[j]) > 0 ) {
                    swapI = j;
                }
            }
            String temp = words[i];
            words[i] = words[swapI];
            words[swapI] = temp;
        }
    }
}
