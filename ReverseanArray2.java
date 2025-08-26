package Lec6_Arrays;
import java.util.Scanner;
public class ReverseanArray2 {
    public static void daoNguoc(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int t = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = t;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        daoNguoc(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
