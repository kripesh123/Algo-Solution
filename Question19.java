/*
*An array is defined to be a Bean array if it meets the following conditions
* a. If it contains a 9 then it also contains a 13.
* b. If it contains a 7 then it does not contain a 16.
* So {1, 2, 3, 9, 6, 13}  and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are Bean arrays.
*  The following arrays are not Bean arrays:
* a. { 9, 6, 18} (contains a 9 but no 13)
* b. {4, 7, 16} (contains both a 7 and a 16)
* Write a function named isBean that returns 1 if its array argument is a Bean array,
* otherwise it returns 0.If you are programming in Java or C#, the function signature isint isBean (int[ ] a).
* */
public class Question19 {
    public static void main(String[] args) {
        int[] arr =  {4, 7, 16};
        System.out.println(isBean(arr));
    }
    public static int isBean(int[] a) {
        int j = 1,k = 1;
        for (int c: a) {
            if (c == 9) {
                if (searchIndex(a, 13) == -1) {
                    j = 0;
                }
            }
            if (c == 7) {
                if (searchIndex(a, 16) != -1) {
                    k = 0;
                }
            }
            if (j == 0 || k == 0) {
                return 0;
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
