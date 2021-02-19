/*
* A twinoid is defined to be an array that has exactly two even values that are adjacent to one another.
For example {3, 3, 2, 6, 7} is a twinoid array because it has exactly two even values (2 and 6) and they are adjacent to one another.
The following arrays are not twinoid arrays.
{3, 3, 2, 6, 6, 7} because it has three even values.
{3, 3, 2, 7, 6, 7} because the even values are not adjacent to one another
{3, 8, 5, 7, 3} because it has only one even value.
Write a function named isTwinoid that returns 1 if its array argument is a twinoid array. Otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isTwinoid (int [ ] a);
If you are programming in C or C++, the function signature is
int isTwinoid(int a[ ], int len) where len is the number of elements in the array.
* */
public class Question02 {

    public static void main(String[] args) {
        int[] array= {3, 3, 2, 6, 5, 7};
        System.out.println(isTwinoid(array));
    }

    public static int isTwinoid(int[] a) {
        int count = 0;
        for (int j : a) {
            if (checkEven(j)) {
                count++;
            }
        }

        if(count == 2) {
            for (int i = 0; i < a.length; i++) {
                boolean isEven = checkEven(a[i]);
                boolean isNextEven = a.length - 1 != i && checkEven(a[i + 1]);
                if (isEven && isNextEven) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static boolean checkEven(int val) {
        return val % 2 == 0;
    }
}
