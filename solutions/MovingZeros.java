//283. Move Zeroes https://leetcode.com/problems/move-zeroes/description/
class MovingZeros {
    public void moveZeroes(int[] nums) {
        int length = nums.length;          
        int swaps = 0;                      
        for (int i = 0; i<length; i++){     
            if(nums[i]==0){
                swaps++;
            } else if (swaps!=0){
                nums[i-swaps]=nums[i];
                nums[i]=0;
            }
        }
    }
}

/*
Swapping
if found 0 -> move to nums.length (end)
move every value forward <- one 

[0,1,0,3,12]
 ^
          ^
[1,0,3,12,0]
 - ^   ^  -
[1,3,12,0,0]

1: Move element first before ending in zero to prevent loss data
2: Scale the position to how many swaps 
*/
