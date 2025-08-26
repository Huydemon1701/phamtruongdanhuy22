package Lec6_Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class ToDoListManagement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ds = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n1. Them cong viec");
            System.out.println("2. Xem danh sach");
            System.out.println("3. Xoa cong viec theo vi tri");
            System.out.println("0. Thoat");
            System.out.print("Chon: ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.print("Nhap cong viec: ");
                    String cv = sc.nextLine();
                    ds.add(cv);
                    break;
                case 2:
                    System.out.println("Danh sach cong viec:");
                    for (int i = 0; i < ds.size(); i++) {
                        System.out.println(i + ". " + ds.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Nhap vi tri can xoa: ");
                    int k = sc.nextInt();
                    if (k >= 0 && k < ds.size()) {
                        ds.remove(k);
                        System.out.println("Da xoa");
                    } else {
                        System.out.println("Vi tri khong hop le");
                    }
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (chon != 0);
    }
}
