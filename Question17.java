/*
* A Nice array is defined to be an array where for every value n in the array, there is also an element n-1 or n+1 in the array.
* For example, {2, 10, 9, 3} is a Nice array because 2=3-1 10=9+1 3=2+1 9=10-1 Other Nice arrays include
* {2, 2, 3, 3, 3}, {1, 1, 1, 2, 1, 1} and {0, -1, 1}.
* The array {3, 4, 5, 7} is not a Nice array because of the value 7 which requires that the array contains either
* the value 6 (7-1) or 8 (7+1) but neither of these values are in the array.Write a function named
* isNice that returns 1 if its array argument is a Nice array.Otherwise it returns a 0.
* If you are programming in Java or C#, the function signature is int isNice(int[ ] a).
* */
public class Question17 {

    public static void main(String[] args) {
        int[] arr = {0, -1, 1};
        System.out.println(isNice(arr));
    }

    public static int isNice(int[ ] a) {
        for (int i: a) {
            int index1 = searchIndex(a, i+1);
            if (index1 == -1) {
                int index2 = searchIndex(a, i - 1);
                if (index2 == -1) {
                    return 0;
                }
            }
        }
        return 1;

    }
    public static int searchIndex(int[] a, int target) {
        /* Java 8 Stream
        return IntStream.range(0, a.length)
                .filter(i -> target == a[i])
                .findFirst()
                .orElse(-1);*/
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
