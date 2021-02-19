/*
*  A fancy number is a number in the sequence 1, 1, 5, 17, 61, … .Note that first two fancy numbers are 1 and any fancy
* number other than the first two is sum of the three times previous one and two times the one before that.
* See below:1,1, 3*1+2*1=5 3*5+2*1=17 3*17+2*5=61 Write a function named isFancy that returns 1 if its integer
*  argument is a Fancy number, otherwise it returns 0.The signature of the function is int isFancy(int n).
* */
public class Question23 {
    public static void main(String[] args) {
        System.out.println(isFancy(60));
    }

    public static int isFancy(int n) {
        if (n == 1) {
            return 1;
        }

        int number = 0;
        int pprevious = 1;
        int previous = 1;

        while (number < n) {
            number = ((3*previous) + (2*pprevious));
            pprevious = previous;
            previous = number;
        }

        if (number == n) {
            return 1;
        }
        return 0;
    }
}
