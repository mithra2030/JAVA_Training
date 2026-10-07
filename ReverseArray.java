class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {1, 0, 3, 2, 0, 6};

        int index = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill the remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print the array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}