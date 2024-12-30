public class LinearAndBinarySearch {
    
    public static void main(String[] args) throws Exception {
        int left = 0;
        int nums[] = { 2, 4, 6, 8, 10 };
        int target = 8;
        int result = binarySearch(nums, target, left, nums.length - 1);

        if (result != -1)
            System.out.println("The element is found : " + result);
        else
            System.out.println("Element not found ");
    }

    private static int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;  
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target)
                return binarySearch(nums, target, mid + 1, right);

            else {
                return binarySearch(nums, target, left, mid - 1);
            }
        }
        return right;

    }

    public static int LinearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

        }
        return -1;
    }

    // public static int binarySearch(int[] nums, int target) {
    // int steps = 0;
    // int left = 0;
    // int right = nums.length - 1;
    // while (left <= right) {
    // steps++;
    // int mid = (left + right) / 2;
    // if (nums[mid] == target) {
    // System.out.println("Steps Taken by Binary" + steps);
    // return mid;

    // } else if (nums[mid] < target) { //6<8
    // left = mid + 1;
    // } else {
    // right = mid - 1;
    // }
    // }
    // return -1;
    // }

}
