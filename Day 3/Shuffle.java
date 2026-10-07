class Shuffle{
    public static void main(String[]args){
        int[] nums={2,5,1,3,4,7};
        int n=3;
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
            System.out.print(nums[i+n]+" ");
        }
    }
}