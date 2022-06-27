class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 0) {
            return new int[]{};
        }
        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            if(target == numbers[left] + numbers[right])
                return new int[]{left + 1, right + 1};
            if(numbers[left] + numbers[right] < target)
                left++;
            else
                right--;
        }
        return new int[]{};
    }
}
