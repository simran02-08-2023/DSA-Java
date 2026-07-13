import java.util.ArrayList;
import java.util.Scanner;

public class Leader {
    static ArrayList<Integer> findLeader(int[] arr){
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
            if(max<arr[i]){
                max=arr[i];
                ans.add(max);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array elements");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ans=findLeader(arr);
        System.out.println(ans);
    }
}
