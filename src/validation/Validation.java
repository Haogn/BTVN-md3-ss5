package validation;

import java.util.Scanner;

public class Validation {

    /*
        ============ Yêu cầu đề bài ==========
         tạo lớp Validation kiểm tra sự chính xác của các dữ liệu sau :
         email : gmail.com
         số điện thoai : vietnam
         mật khẩu : bảo mật cao
         ngày tháng năm : dd/MM/yyyy
         validate chuỗi nhập vào có phải
         là số không  "217864" : bắt người dùng nhập đến khi nhập đúng số
         thị mới hiển thị, nếu ko là số thì nhâp lại ; */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Cau truc 1 lop validate cac du lieu sau ");
        int select;
        do {
            System.out.println("1. Validate email ");
            System.out.println("2. validate phone");
            System.out.println("3. validate password");
            System.out.println("4. validate ngay thang nam : dd/MM/yyyy");
            System.out.println("5. validate 1 chuoi nhap vao co phai so khong ?? ");
            System.out.println("6. ❌❌❌ Thoat chuong trinh");
            select = Integer.parseInt(sc.nextLine());


            switch (select) {
                case 1:
                    validateEmail();
                    break;
                case 2:
                    validatePhone();
                    break;
                case 3:
                    validatePassworld();
                    break;
                case 4:
                    validateDate();
                    break;
                case 5 :
                    break;
                case 6:
                    System.out.println("🖐🏻🖐🏻🖐🏻 Da thoat chuong trinh");
                    break;
            }
        } while (select != 6);

    }

    public static void validateEmail() {
        while (true) {
            System.out.println("\u001B[37mNhap vao email");
            String email = sc.nextLine();
            if (email.matches("^(?=.{6,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {
                System.out.println(email + " \u001B[33mHop le");
                break;
            } else {
                System.out.println(email + " \u001B[31mKhong hop le, vui long nhap lai");
            }
        }
    }

    public static void validatePhone() {
        while (true) {
            System.out.println("\u001B[37mNhap so dien thoai : ");
            String phoneNumber = sc.nextLine();
            if (phoneNumber.matches("^(\\+84|0084|0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$")){
                System.out.println(phoneNumber + " \u001B[33mHop le");
                break;
            } else {
                System.out.println(phoneNumber + " \u001B[31mKhong hop le, vui long nhap lai");

            }

        }
    }
    public static void validatePassworld() {
        while (true) {
            System.out.println("\u001B[37mNhap passworld : ");
            String passworld = sc.nextLine();
            if (passworld.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")){
                System.out.println(passworld + " \u001B[33mHop le");
                break;
            } else {
                System.out.println(passworld + " \u001B[31mKhong hop le, vui long nhap lai");

            }

        }
    }

    public static void validateDate() {
        while (true) {
            System.out.println("\u001B[37m dd/MM/yyyy : ");
            String date = sc.nextLine();
            if (date.matches("((18|19|20)[0-9]{2}[\\-.](0[13578]|1[02])[\\-.](0[1-9]|[12][0-9]|3[01]))|(18|19|20)[0-9]{2}[\\-.](0[469]|11)[\\-.](0[1-9]|[12][0-9]|30)|(18|19|20)[0-9]{2}[\\-.](02)[\\-.](0[1-9]|1[0-9]|2[0-8])|(((18|19|20)(04|08|[2468][048]|[13579][26]))|2000)[\\-.](02)[\\-.]29")){
                System.out.println(date + " \u001B[33mHop le");
                break;
            } else {
                System.out.println(date + " \u001B[31mKhong hop le, vui long nhap lai");

            }
        }
    }

}
