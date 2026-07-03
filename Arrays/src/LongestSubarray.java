import java.util.Scanner;

public class LongestSubarray {
    static int longestSum(int arr[], int k){
        // if there exists no such subarray it will return 0

        int left=0, right=0;
        int sum=arr[0];
        int maxlen=0;
        int n=arr.length;
        while(right<n){
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                if(maxlen>right-left+1) maxlen=maxlen;
                else maxlen=right-left+1;
            }
            right++;
            if(right<n) sum+=arr[right];
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target sum");
        int k=sc.nextInt();
        System.out.println("Longest length of subarray with sum "+k+" is: "+longestSum(arr,k));

    }
}
