package baitap;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        // Viết một chương trình Java để kiểm tra xem một chuỗi có rỗng hay không,
        // sử dụng phương thức isEmpty() của String.
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Nhập 1 đoạn văn bản bất kỳ");
        String value = "";
        value= sc.nextLine();
        System.out.println(value.isEmpty());
    }
}
