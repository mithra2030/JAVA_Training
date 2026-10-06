 class CountOccurance{
    public static void main(String[] args) {
        int count =0;
        int nums[] ={1,2,3,2,1,0};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    break;
                }
            }
        }

System.out.println("no.of.occurance of duplicate elements in the array is: " +nums[0]+" "+count);
    }

}    

   