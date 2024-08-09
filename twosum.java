public class twosum{
    public static void main(String[] args) {
        //twosum a= new twosum();
        int[] nums = {1, 2, 3, 7};
        int target = 9;
        int[] result = twoSum(nums, target);  //static ki no use of object 
        // Print result
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
    
    public  static int[] twoSum(int[] nums, int target) 
    {
        int ans[]=new int[2];  //array size 2
        for(int i =0;i<nums.length;i++)
        {
            for(int j = i+1;j<nums.length;j++)
            {
                if (nums[i]+nums[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        
        }
        return ans;
    }
}