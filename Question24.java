/*
* Write a method named getExponent(n, p) that returns the largest exponent x such that p^x evenly divides n.
* If p is <= 1 the method should return -1. For example, getExponent(162, 3) returns 4 because 162 = 21 * 34,
* therefore the value of x here is 4.The method signature is int getExponent(int n, int p)
* Examples:if n is and p is return because
* 27   3  3 3^3 divides 27 evenly but 3^4 does not.
* 28   3  0 3^0 divides 28 evenly but 31 does not.
* 280  7  1 7^1 divides 280 evenly but 72 does not.
* -250 5  3 5^3 divides -250 evenly but 54 does not.
* 18   1 -1 if p <=1 the function returns -1.
* 128  4  3 4^3 divides 128 evenly but 44 does not.
* */
public class Question24 {

    public static void main(String[] args) {
        System.out.println(getExponent(27, 3));
    }

    public static int getExponent(int n, int p) {
        int count = 0;
        if (n<0) {
            n = -n;
        }
        if (p <= 1) {
            return -1;
        }
        while (n>1) {
            if (n%p==0) {
                count++;
                n = n / p;
            } else {
                break;
            }
        }
        return count;
    }
}
