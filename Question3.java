/*
* An integer is defined to be an even subset of another integer n if every even factor of m is also a factor of n.
For example 18 is an even subset of 12 because the even factors of 18 are 2 and 6 and these are both factors of 12.
But 18 is not an even subset of 32 because 6 is not a factor of 32.
Write a function with signature int isEvenSubset(int m, int n) that returns 1 if m is an even subset of n,
otherwise it returns 0.
* */
public class Question3 {

    public static void main(String[] args) {
        System.out.println(isEvenSubset(18,12));
    }

    public static int isEvenSubset(int m, int n) {
        for (int i = 2; i < m; i++) {
            if (i % 2 == 0 && m % i == 0 && n % i != 0) {
                return 0;
            }
        }
        return 1;
    }
}
