/*
Finding second largest element in an array
Time complexity - O(n)
Space complexity - O(1)
 */
public class FindingSecondLargest {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 1, 6, 9, 2};
        int largest = arr[0], secondLargest = arr[0], arrLen = arr.length;
        for(int i = 0; i < arrLen; i++) {
            if(largest < arr[i]) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.print(secondLargest);
    }
}
