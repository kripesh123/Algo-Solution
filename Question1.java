/*
* A balanced array is defined to be an array where for every value n in the array, -n also is in the array.
For example {-2, 3, 2, -3} is a balanced array. So is {-2, 2, 2, 2}. But {-5, 2, -2} is not because 5 is not in the array.
Write a function named isBalanced that returns 1 if its array argument is a balanced array. Otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isBalanced (int [ ] a);
If you are programming in C or C++, the function signature is
int isBalanced(int a[ ], int len) where len is the number of elements in the array.
* */
public class Question1 {

    public static void main(String[] args) {
        int[] array = {-5, 2, -2} ;
        System.out.println(isBalanced(array));
    }

    public static int isBalanced(int[] a) {
        for (int current : a) {
            /* Only if Array's sort is allowed
                Arrays.sort(a);
                int index = Arrays.binarySearch(a,(-1)*current );
                */
            int index = searchIndex(a, (-1) * current);
            if (index < 0) {
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
