public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3};

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // i + 1 = number of unique elements
        int k = i + 1;

        System.out.println("Array after removing duplicates:");

        for (int x = 0; x < k; x++) {
            System.out.print(arr[x] + " ");
        }

        System.out.println("\nNumber of unique elements: " + k);
    }
}
