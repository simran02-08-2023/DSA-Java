import java.util.Scanner;

public class sum {
    static int Sum(int arr[], int i){
        int arr_sum=0;
        if(i==0) return (arr_sum+=arr[i]);
        arr_sum =Sum(arr,i-1);
        return arr_sum+arr[i];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array followed by its size to print");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        while(i<n){
            arr[i]=sc.nextInt();
            i++;
        }
        n-=1;
        System.out.println("Sum of the array is: "+Sum(arr,n));
    }
}
