/*
*A meera array is defined to be an array that contains at least one odd number and begins and ends with the same
* number of even numbers.So {4,8,6,3,2,9,8,11,8,13,12,12,6} is a Meera array because it begins with three even numbers
*  and ends with three even numbers and it contains at least one odd number.
The array {2,4,6,8,6} is not a meera array because it does not contain an odd number.
The array {2,8,7,10,-4,6} is not a Meera array because it begins with two even numbers but ends with three even numbers.
Write a function named isMeera that return 1 if its array argument is a meera array , otherwise it returns 0.
* */
public class Question14 {

    public static void main(String[] args) {
        int[] arr = {2,8,4,7,10,-4,6};
        System.out.println(isMeera(arr));
    }

    public static int isMeera(int[] a) {
        int firstIndex = 0;
        int lastIndex = 0;
        for ( int i = 0 ; i < a.length; i++) {
            if(a[i] % 2 != 0) {
                firstIndex = i;
                break;
            }
        }
        for (int j = a.length -1; j != 0; j--) {
            if(a[j] % 2 != 0){
                lastIndex = j;
                break;
            }
        }

        int rightEle = a.length-1 - lastIndex;
        for (int i = firstIndex -1; i != -1; i--) {
            if (a[i] % 2 != 0) {
                return 0;
            }
        }
        for (int j = lastIndex + 1; j < a.length; j++) {
            if (a[j] % 2 != 0) {
                return 0;
            }
        }

        if( rightEle == firstIndex) {
            return 1;
        }
        return 0;
    }
}
