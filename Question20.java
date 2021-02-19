/*
* A wave array is defined to an array which does not contain two even numbers or two odd numbers in adjacent locations.
*  So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0, 5} and {2} are all wave arrays.
* But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent to each other.
* Also {3, 4, 9, 11, 8} is not a wave array because the odd numbers 9 and 11 are adjacent to each other.
* You can assume array has at least one element. Write a function named isWave that returns 1 if its array
* argument is a Wave array, otherwise it returns 0.If you are programming in Java or C#,
* the function signature is int isWave (int [ ] a)
* * */
public class Question20 {

    public static void main(String[] args) {
        int[] arr ={3, 4, 9, 11, 8};
        System.out.println(isWave(arr));
    }

    public static int isWave(int[] a) {
        for(int i = 0; i < a.length-1; i++) {
            if (a[i] % 2 == 0 && a[i+1] % 2 == 0) {
                return 0;
            } else if (a[i] % 2 != 0 && a[i+1] % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }
}
