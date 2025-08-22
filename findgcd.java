class findgcd {

    int gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return gcd(b % a, a);
        }
    }

    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return gcd(min, max);
    }

    public static void main(String[] args) {
        findgcd sol = new findgcd();
        int[] nums = { 2, 5, 6, 9, 10 };
        System.out.println("GCD of min and max: " + sol.findGCD(nums));
    }
}
