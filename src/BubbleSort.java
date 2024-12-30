public class BubbleSort {
    public static void main(String[] args) {
        int num[] = { 6, 7, 1, 4, 2, 17 };
        int temp = 0;
        System.out.println("before Sorting");
        for (int nums : num) {
            System.out.print(nums + " ");
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After Sorting");
        for (int nums : num) {
            System.out.print(nums + " ");
        }
    }
}//O o Notations is Bubble sort is O(n2)

