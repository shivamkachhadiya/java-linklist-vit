class BlockSwapRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;
        int n = arr.length;

        int[] temp = new int[n];

        // Copy elements from d to end into temp starting at index 0
        for (int i = 0; i < n - d; i++) {
            temp[i] = arr[i + d];
        }

        // Copy first d elements to the end of temp
        for (int i = 0; i < d; i++) {
            temp[n - d + i] = arr[i];
        }

        // Print rotated array
        for (int i : temp) {
            System.out.print(i + " ");
        }
    }
}
