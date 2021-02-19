/*
*A Fibonacci number is a number in the sequence 1, 1, 2, 3, 5, 8, 13, 21,…. Note that first two Fibonacci numbers
* are 1 and any Fibonacci number other than the first two is the sum of the previous two Fibonacci numbers.
* For example, 2 = 1 + 1, 3 = 2 + 1, 5 = 3 + 2 and so on.
* Write a function named isFibonacci that returns 1 if its integer argument is a Fibonacci number,
* otherwise it returns 0. The signature of the function is int isFibonacci (int n).
* */
public class Question22 {

    public static void main(String[] args) {
        System.out.println(isFibonacci(22));
    }

    public static int isFibonacci(int n) {
//        int tempVal = (5 * n * n) + 4;
//        int tempVal2 = (5 * n * n) - 4;
//        double val = Math.sqrt(tempVal);
//        double val2 = Math.sqrt(tempVal2);
//        if (val%1==0 || val2 % 1 == 0) {
//            return 1;
//        }
        if (n == 1) {
            return 1;
        }

        int number = 0;
        int pprevious = 1;
        int previous = 1;

        while (number < n) {
            number = ((previous) + (pprevious));
            pprevious = previous;
            previous = number;
        }

        if (number == n) {
            return 1;
        }
        return 0;
    }


}
