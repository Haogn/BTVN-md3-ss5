package baitap;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        // Viết một phương thức Java để đảo ngược một chuỗi, sử dụng StringBuffer.
        Scanner sc= new Scanner(System.in) ;
        System.out.println("Nhap 1 doan van ban");
        String text = sc.nextLine();
        StringBuilder textBuilder = new StringBuilder(text) ;
        System.out.println( textBuilder.reverse());

    }
}
