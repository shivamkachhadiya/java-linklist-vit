public class maxprodsubarray2 {

    static int maxproduct(int arr[]) {
        int maxprod = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int mul = 1;
            for (int j = i; j < n; j++) {
                mul = mul * arr[j];
                maxprod = Math.max(maxprod, mul);

            }
        }

        return maxprod;

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, 4 };
        System.out.println(maxproduct(arr));

    }

}
