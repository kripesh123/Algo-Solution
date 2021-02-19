/*
* Write a function named factorTwoCount that returns the number of times that 2 divides the argument.
* For example, factorTwoCount(48) returns 4 because 48/2=24 24/2=12 12/2=6 6/2=3 2 does not divide 3 evenly.
* Another example: factorTwoCount(27) returns 0 because 2 does not divide 27.
* The function signature is int factorTwoCount(int n)
* * */
public class Question15 {
    public static void main(String[] args) {
        int aa = 12;
        System.out.println(factorTwoCount(aa));
    }

    public static int factorTwoCount(int n) {
        int divCount = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                divCount++;
                n = n / 2;
            } else {
                break;
            }
        }
        return  divCount;
    }
}
