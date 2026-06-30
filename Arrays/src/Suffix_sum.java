import java.util.Scanner;
public class Suffix_sum {
    static int[] suffixSum(int arr[]){
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
            arr[i]=arr[i]+arr[i+1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        //int arr[]=new int[n+1]; // for queries sum/ 1 based indexing
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){ // 0 based indexing
            arr[i]=sc.nextInt();
        }
        int ans[]=suffixSum(arr);
        System.out.println("Suffix sum array is : ");
        for(int i=0;i<n;i++){ // 0 based indexing
            System.out.print(ans[i]+" ");
        }

    }
}
