package array_problems;

public class Rotate_Array {
	
	public static void rotate(int[]nums,int k){
		int n=nums.length;
		k = k % n;

		reverse(nums,0,n-1);
		reverse(nums,0,k-1);
		reverse(nums,k,n-1);
		}
		private static void reverse(int[]nums,int start,int end){
		while(start<end){
		int temp = nums[start]; 
		nums[start]=nums[end];  
		nums[end] = temp;
		 
		start++;
		end--;
		}
		}

		public static void main(String[]args){
		int[]nums={5,6,7,1,3,8,9};
		int k= 4;

		System.out.println("Original Array:");
		printArray(nums);
		rotate(nums, k);
		System.out.println("\nArray after rotating by"+k+"steps to the right:");
		printArray(nums);
		}
		private static void printArray(int[]arr){
			for (int num : arr) { 
		System.out.print(num + " ");
		}
		System.out.println();
		}


}
