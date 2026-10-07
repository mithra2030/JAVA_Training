class BuildArrayfromPermutation{
    public static void main(String[]args){
        int[] nums={0,2,1,5,3,4};
        int n=nums.length;
        for(int i=0;i<n;i++){
            System.out.print(nums[nums[i]] + " ");
        }
    }
}