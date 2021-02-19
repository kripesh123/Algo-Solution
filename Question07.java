/*
* An isSym (even/odd Symmetric) array is defined to be an array in which even numbers and odd numbers appear
in the same order from “both directions”. You can assume array has at least one element. See examples below:
{2, 7, 9, 10, 11, 5, 8} is a isSym array.
Note that from left to right or right to left we have even, odd, odd, even, odd, odd, even.
{9, 8, 7, 13, 14, 17} is a isSym array.
Note that from left to right or right to left we have {odd, even, odd, odd, even, odd}.
However, {2, 7, 8, 9, 11, 13, 10} is not a isSym array.
From left to right we have {even, odd, even, odd,  odd, odd, even}.
From right to left we have {even, odd,  odd, odd, even, odd, even},
Which is not the same.
Write a function named isSym that returns 1 if its array argument is a isSym array, otherwise it returns 0.
If you are programming in Java or C#, the function signature is:
   int isSym (int [ ] a)
* */
public class Question07 {
    public static void main(String[] args) {
        int[] a = {2, 7, 8, 9, 11, 13, 10};
        System.out.println(isSym(a));
    }

    public static int isSym (int [ ] a) {
       int arrayLength = a.length;
       int[] forward = new int[arrayLength];
       int[] reverse = new int[arrayLength];

       for (int i = 0; i < arrayLength; i++) {
           forward[i] = a[i] % 2 == 0 ? 1 : 0;
       }
       int index = 0;
       for (int j = arrayLength - 1; j >= 0; j--) {
           reverse[index] = a[j] % 2 == 0 ? 1 : 0;
           index++;
       }
       for (int k = 0; k < arrayLength; k++) {
           if (forward[k] != reverse[k]){
               return 0;
           }
       }
       return 1;
    }
}
