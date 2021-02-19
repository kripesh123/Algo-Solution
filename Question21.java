/*
*  Write a function named minDistance that returns the smallest distance between two factors of a number.
* For example, consider 1001 = 1*7*11*13. Its factors are 1, 7, 11, 13, 77, 91, 143 and 1001.
* minDistance(1001) would return 2 because the smallest distance between any two factors is 2 (13 - 11 = 2).
* As another example, minDistance(8) would return 1 because the factors of 8 are 1, 2, 4, 8 and the smallest distance
* between any two factors is 1 (2 - 1 = 1). Also, minDistance(15) would return 2 since the factors of 15 are 1, 3, 5,15
* and the smallest distance between any two factors is 2 (5 - 3 = 2).The function signature is int minDistance(int n).
* */
public class Question21 {

    public static void main(String[] args) {
        System.out.println(minDistance(15));
    }

    public static int minDistance(int n) {
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                index++;
            }
        }
        int[] arr = new int[index];
        int tempIndex = 0;
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                arr[tempIndex] = j;
                tempIndex++;
            }
        }

        int distance = arr[arr.length-1];
        for (int i= 0; i<arr.length-1;i++) {
            for (int j=i+1;j<arr.length;j++) {
                int temp = -(arr[i] - arr[j]);
                if (temp < distance) {
                    distance = temp;
                }
            }
        }
        return distance;
    }
}
