/*
* An Sub array is defined to be an array in which each element is greater than sum of all elements after that.
*  See examples below:
{13, 6, 3, 2} is a Sub array. Note that 13 > 2 + 3 + 6, 6 > 3 + 2, 3 > 2.
{11, 5, 3, 2} is a NOT a Sub array. Note that 5 is not greater than 3 + 2.
Write a function named isSub that returns 1 if its array argument is a Sub array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is:
   int isSub (int [ ] a)
* */
public class Question8 {
    public static void main(String[] args) {
        int[] a = {11, 5, 3, 2};
        System.out.println(isSub(a));
    }

    public static int isSub (int [ ] a) {

        for (int i = 0; i < a.length; i++) {
            int currentValue = a[i];
            int totalSum = 0;
            for (int j = i+1; j < a.length; j++) {
                totalSum += a[j];
            }
            if (currentValue <= totalSum ) {
                return 0;
            }
        }
        return 1;
    }
}
