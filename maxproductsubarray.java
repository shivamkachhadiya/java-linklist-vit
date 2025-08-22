public class maxproductsubarray {
    public static void main(String[] args) {
        int[] arr = { 6, 9, 2, 3, -2, 4 };
        int n = arr.length;

        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            if (current < 0) {
                // Swap max and min when current is negative
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max(current, maxProduct * current);
            minProduct = Math.min(current, minProduct * current);

            result = Math.max(result, maxProduct);

        }
        System.out.println("Maximum product of subarray: " + result);
    }

}
