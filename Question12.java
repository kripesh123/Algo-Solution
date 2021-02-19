/*
* Write a function named countDigit that returns the number of times that a given digit appears in apositive number.
*  For example countDigit(32121, 1) would return 2 because there are two 1s in 32121.
* Other examples:countDigit(33331, 3) returns 4 countDigit(33331, 6) returns 0countDigit(3, 3) returns 1
* The function should return -1 if either argument is negative,
* so countDigit(-543, 3) returns -1.The function signature is int countDigit(int n, int digit)
* Hint: Use modulo base 10 and integer arithmetic to isolate the digits of the number.
* */
public class Question12 {
    public static void main(String[] args) {
        System.out.println(countDigit(533343,3));
    }

    public static int countDigit(int n, int digit) {
        int count = 0;

        if (n < 0){
            return -1;
        }

        while (n > 1) {
            if (n % 10 == digit) {
                count ++;
            }
            n = n / 10;
        }
        return count;
    }
}
