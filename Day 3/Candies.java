class Candies{
    public static void main(String[]args){
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        int greatest=0;
        int n=candies.length;
        for(int i=0;i<n;i++){
            if(candies[i]>=greatest){
                greatest=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=greatest){
                System.out.print("true ");
            }
            else{
                System.out.print("false ");
            }
        }
    }
}