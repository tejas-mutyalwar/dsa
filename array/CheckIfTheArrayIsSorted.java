public class CheckIfTheArrayIsSorted {

    public static void main(String[] args) {
        int[] arr = {1,3,4,6,8,9};
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
