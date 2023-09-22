package baitap;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        // Viết một chương trình Java để kiểm tra xem hai chuỗi có giống nhau hay không,
        // sử dụng phương thức equals() của String.
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhap 1 doan van ban bat ky");
        String vb1 = sc.nextLine();
        System.out.println("Ban co the nhap lai chinh xac doan van ban ban vua nhap chu");
        String vb2 = sc.nextLine();
        if (vb1.equals(vb2)) {
            System.out.println("chinh xac");
        } else {
            System.out.println("khong trung khop");
        }
    }
}
