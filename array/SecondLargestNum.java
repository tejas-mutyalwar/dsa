public class SecondLargestNum {

    public static int getSecondLargest(int[] arr) {
        int l = 0;
        int sl = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > arr[l]) {
                sl = l;
                l = i;
            } else if (arr[i] < arr[l] && arr[i] > arr[sl]) {
                sl = i;
            }
        }
        return arr[sl];
    }

    public static int secondLargestElement(int[] nums) {
        int largest = -1;
        int secondLargest = -1;
        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num < largest && num > secondLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10, 7, 9, 8, 8, 9};
        System.out.println(secondLargestElement(arr));
    }

}
