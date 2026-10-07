
class Large{
    public static void main(String[] args) {
       int  nums[] ={1,2,6,5,7,10,11};
        int max=0;
        for(int i=1;i<nums.length;i++){
                if(nums[i]>max){
                    max=nums[i];
                }
        }
        System.out.println("Second largest element is:"+max);
    }
}