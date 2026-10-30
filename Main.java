
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String maSach, tenSach, tacGia;
        int namXuatBan, soLuong, loaiSach;
        double donGia, thanhTien, phiVanChuyen, tongTienNhap;

        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = sc.nextInt();

        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();

        thanhTien = donGia * soLuong;
        phiVanChuyen = thanhTien * 0.05;
        tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("\n===== THONG TIN SACH =====");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.printf("Don gia: %.0f VND\n", donGia);
        System.out.println("So luong: " + soLuong);

        System.out.printf("Thanh tien: %.0f VND\n", thanhTien);
        System.out.printf("Phi van chuyen: %.0f VND\n", phiVanChuyen);
        System.out.printf("Tong tien nhap: %.0f VND\n", tongTienNhap);

        // Bai 1: Kiem tra hop le
        System.out.println("\n===== BAI 1 =====");

        if (donGia > 0 && soLuong >= 0 && namXuatBan > 0
                && namXuatBan <= 2026) {
            System.out.println("Sach hop le");
        } else {
            System.out.println("Sach khong hop le");
        }

        // Bai 2: Phan loai gia
        System.out.println("\n===== BAI 2 =====");

        if (donGia < 50000) {
            System.out.println("Sach gia thap");
        } else if (donGia <= 100000) {
            System.out.println("Sach gia trung binh");
        } else if (donGia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }

        // Bai 3: Phan loai ton kho
        System.out.println("\n===== BAI 3 =====");

        if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong <= 5) {
            System.out.println("Sap het");
        } else if (soLuong <= 20) {
            System.out.println("Con it");
        } else {
            System.out.println("Con nhieu");
        }

        // Bai 4: Chon loai sach
        System.out.println("\n===== BAI 4 =====");

        System.out.println("1. Sach giao khoa");
        System.out.println("2. Sach tham khao");
        System.out.println("3. Sach chuyen nganh");
        System.out.println("4. Sach khac");

        System.out.print("Nhap loai sach: ");
        loaiSach = sc.nextInt();

        switch (loaiSach) {
            case 1:
                System.out.println("Sach giao khoa");
                break;
            case 2:
                System.out.println("Sach tham khao");
                break;
            case 3:
                System.out.println("Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Sach khac");
                break;
            default:
                System.out.println("Loai sach khong hop le");
        }

        sc.close();
    }
}
