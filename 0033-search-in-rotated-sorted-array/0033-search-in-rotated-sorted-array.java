class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the mid element is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which side is sorted
            if (nums[left] <= nums[mid]) { // Left side is sorted
                if (nums[left] <= target && target < nums[mid]) { // Target is in the sorted left part
                    right = mid - 1;
                } else { // Target is in the right part
                    left = mid + 1;
                }
            } else { // Right side is sorted
                if (nums[mid] < target && target <= nums[right]) { // Target is in the sorted right part
                    left = mid + 1;
                } else { // Target is in the left part
                    right = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }

}
