class Large {
    public static void main(String[] args) {
        int arr[] = {12, 23, 45, 13, 24};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}