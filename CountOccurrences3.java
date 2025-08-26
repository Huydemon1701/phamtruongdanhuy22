package Lec6_Arrays;
import java.util.Scanner;
public class CountOccurrences3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) dem++;
        }
        System.out.println("So " + x + " xuat hien " + dem + " lan");
    }
}
