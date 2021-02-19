/*
* Write a function called goodSpread that returns 1 if no value in its array argument occurs more than 3 times
* in the array. For example, goodSpread(new int[] {2,1,2,5,2,1,5,9} returns 1 because no value occurs more than three times.
* But goodSpread(new int[] {3,1,3,1,3,5,5,3} return 0 because the value 3 occurs four times.
* */
public class Question13 {

    public static void main(String[] args) {
        int[] arr = {3,1,3,1,3,5,5,3};
        System.out.println((goodSpread(arr)));
    }

    public static int goodSpread(int[] a) {
        int count = 0;
        int[] newArr = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int k : a) {
                if (a[i] == k) {
                    count++;
                }
            }
            newArr[i] = count;
            count = 0;
        }
        for (int k : newArr) {
            if(k > 3) {
                return 0;
            }
        }
        return 1;
    }
}
