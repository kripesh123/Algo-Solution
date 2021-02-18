/*
*An array is said to be hollow if it contains 3 or more zeroes in the middle that are preceded and followed by
the same number of non-zero elements. Write a function named isHollow that  accepts an integer array and
returns 1 if it is a hollow array, otherwise it returns 0
Examples:
isHollow({1,2,4,0,0,0,3,4,5}) returns 1.
isHollow ({1,2,0,0,0,3,4,5}) returns 0.
isHollow ({1,2,4,9, 0,0,0,3,4, 5}) returns 0.
isHollow ({1,2, 0,0, 3,4}) returns 0.
If you are programming in Java or C#, the function signature is
int isHollow(int[ ] a).
If you are C or C++ programmer
int isHollow(int[ ] a, int len)
where len is the number of elements in the array.
* */
public class Question4 {

    public static void main(String[] args) {
        int [] a= {1,0,0,0,0,0,0,1,0};
        System.out.println(isHollow(a));
    }

    public static int isHollow(int[ ] a) {
        int index = 0;
        int lastIndex = 0;
        for ( int i = 0 ; i < a.length; i++) {
            if (a[i] == 0 ){
                index = i ;
                for ( int j = i ; j < a.length; j++) {
                    if (a[j] != 0 ){
                        lastIndex = j -1;
                        break;
                    }
                }
                break;
            }
        }
        int hollowDepth = lastIndex - index;
        if (hollowDepth >= 2 ) {
            int rightEle = a.length-1 - lastIndex;
            for (int i = index -1; i != -1; i--) {
                if (a[i] == 0) {
                    return 0;
                }
            }
            for (int j = lastIndex + 1; j < a.length; j++) {
                if (a[j] == 0) {
                    return 0;
                }
            }
            if( rightEle == index) {
                return 1;
            }
        }
        return 0;
    }
}
