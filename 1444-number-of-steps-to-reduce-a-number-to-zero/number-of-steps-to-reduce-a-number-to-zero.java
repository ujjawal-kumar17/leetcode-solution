class Solution {
    public int numberOfSteps(int num) {
        return step(num,0);
    }
    private int step(int nums, int steps){
        if(nums==0){
            return steps;
        }
        if(nums%2==0){
            return step(nums/2,steps+1);
        }else{
            return step(nums-1,steps+1);
        }
    }
}