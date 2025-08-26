package Lec6_Arrays;
import java.util.Scanner;
public class FindtheMaximumandMinimumValue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxVal = arr[0];
        int minVal = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
        }
        System.out.println("The maximum value is: " + maxVal);
        System.out.println("The minimum value is: " + minVal);
        sc.close();
    }
}
