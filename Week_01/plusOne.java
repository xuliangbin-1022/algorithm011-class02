class Solution {
    public int[] plusOne(int[] digits) {

        int len = digits.length;

        for (int i = len-1; i >= 0; i--) {
            if (digits[i] <= 8) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        digits = new int[len+1];
        digits[0] = 1;
        return digits;
    }
}