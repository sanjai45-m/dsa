public class SelectionSort {
    public static void main(String[] args) {
        int num[] = { 5, 1, 6, 2, 4, 3 };
        int temp = 0;
        int minIndex = 0;
        System.out.println("Before Sorting");
        for (int nums : num) {
            System.out.print(nums + " ");
        }

        for (int i = 0; i < num.length - 1; i++) { // 0< 6 true
            minIndex = i; //
            for (int j = i + 1; j < num.length; j++) {   // 1
                if (num[minIndex] > num[j]) {     // 5>1  = true
                    minIndex = j;    //minIndex = 1 = j = n[0]
                }
                temp = num[minIndex];     //temp = 1
                num[minIndex] = num[i];    // num[minIndex] = 5
                num[i] = temp;          // 5 = num[i]

            }
        }

        System.out.println();
        System.out.println("After Sorting");
        for (int nums : num) {
            System.out.print(nums + " ");
        }
    }

}
//selection sort is  like takes a minimum value and compares with every element in the array
//and then move to the first and shifted place once it is smaller and the next iteration it goes without 
//wuthout 1st value of arraylist and check remaning which is smaller takes one value as a start and compare it