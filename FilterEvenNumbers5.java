package Lec6_Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class FilterEvenNumbers5 {
    public static ArrayList<Integer> loc(int[] a) {
        ArrayList<Integer> ds = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) ds.add(a[i]);
        }
        return ds;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> kq = loc(arr);
        System.out.println(kq);
    }
}
