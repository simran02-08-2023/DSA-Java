import java.util.*;

public class Union {
    static ArrayList<Integer> union(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;


        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (a[i] <= b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        while (j < n2) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size and elements of first sorted array:");
        int n1 = sc.nextInt();
        int[] a = new int[n1];

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter size and elements of second sorted array:");
        int n2 = sc.nextInt();
        int[] b = new int[n2];

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = union(a, b);
        System.out.println("Union of both arrays is: " + ans);

    }


}
