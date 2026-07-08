import java.util.Scanner;

public class Array_Print {
    static void print(int[] arr, int i){
        if(i==0) {
            System.out.print(arr[0]+" ");
            return;
        }
        print(arr,i-1);
        System.out.print(arr[i]+" ");

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
        print(arr, n);
    }
}
