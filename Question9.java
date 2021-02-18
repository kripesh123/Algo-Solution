/*
* An integer array is said to be evenSpaced, if the difference between the largest value and the smallest
* value is an even number.
* Write a function isEvenSpaced(int[] a) that will return 1 if it is evenSpaced and 0 otherwise.
* If array has less than two elements, function will return 0. If you are programming in C or C++,
* the function signature is:
   int isEvenSpaced (int a[ ], int len) where len is the number of elements in the array.
 Examples
Array--Largest value--Smallest value--Difference--Return value
{100, 19, 131, 140}--140--19--140 -19 = 121--0
{200, 1, 151, 160}--200--1--200 -1 = 199--0
{200, 10, 151, 160}--200--10--200 -10 = 190--1
{100, 19, -131, -140}--100---140--100 - (-140 ) = 240--1
{80, -56, 11, -81}--80---81---80 - 80 = -161--0
* */
public class Question9 {
    public static void main(String[] args) {
        int[] a = {100, 19, -131, -140};
        System.out.println(isEvenSpaced(a));
    }
    public static int isEvenSpaced(int[] a) {
        int arrLength = a.length;
        if (arrLength < 2) {
            return 0;
        }
        int minValue = a[0],maxValue=a[0];
        for (int j : a) {
            if (j > maxValue) {
                maxValue = j;
            }
            if (j < minValue) {
                minValue = j;
            }
        }
        if ((maxValue - minValue) % 2 != 0) {
            return 0;
        }
        return 1;
    }
}
