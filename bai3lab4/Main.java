package bai3lab4;

public class Main {
    public static void main(String[] args) {
        DiemHocVien[] lopHoc = new DiemHocVien[] {
                new DiemHocVien("Hoc Vien 1", 2002, 8.0, 9.0, 7.0, 8.0, 10.0),
                new DiemHocVien("Hoc Vien 2", 2002, 6.0, 5.0, 4.0, 6.0, 7.0),
                new DiemHocVien("Hoc Vien 3", 2002, 9.0, 9.0, 9.0, 9.0, 9.0),
                new DiemHocVien("Hoc Vien 4", 2002, 7.0, 6.0, 8.0, 6.0, 8.0),
                new DiemHocVien("Hoc Vien 5", 2002, 5.0, 8.0, 7.0, 6.0, 5.0),
                new DiemHocVien("Hoc Vien 6", 2002, 6.0, 6.0, 6.0, 5.0, 6.0),
                new DiemHocVien("Hoc Vien 7", 2002, 8.0, 8.0, 8.0, 8.0, 8.0),
                new DiemHocVien("Hoc Vien 8", 2002, 9.0, 9.0, 9.0, 9.0, 9.0),
                new DiemHocVien("Hoc Vien 9", 2002, 6.0, 5.0, 8.0, 5.0, 7.0),
                new DiemHocVien("Hoc Vien 10", 2002, 4.0, 6.0, 5.0, 7.0, 8.0),
        };

        int soLuongHocVienLamLuanVan = 0;
        int soLuongHocVienThiTotNghiep = 0;
        int soLuongHocVienPhaiThiLai = 0;
        String tenMonThiLai = "";

        for (DiemHocVien hocVien : lopHoc) {
            if (hocVien.laHocVienLamLuanVan()) {
                soLuongHocVienLamLuanVan++;
            } else if (hocVien.laHocVienThiTotNghiep()) {
                soLuongHocVienThiTotNghiep++;
            } else if (hocVien.phaiThiLai()) {
                if (hocVien.getDismMon1() < 5) {
                    tenMonThiLai += "Mon 1, ";
                }
                if (hocVien.getDismMon2() < 5) {
                    tenMonThiLai += "Mon 2, ";
                }
                if (hocVien.getDismMon3() < 5) {
                    tenMonThiLai += "Mon 3, ";
                }
                if (hocVien.getDismMon4() < 5) {
                    tenMonThiLai += "Mon 4, ";
                }
                if (hocVien.getDismMon5() < 5) {
                    tenMonThiLai += "Mon 5";
                }
                tenMonThiLai += "\n";
                soLuongHocVienPhaiThiLai++;
            }
        }

        System.out.println("So luong hoc vien lam luan van la: " + soLuongHocVienLamLuanVan);
        System.out.println("So luong hoc vien thi tot nghiep la: " + soLuongHocVienThiTotNghiep);
        System.out.println("So luong hoc vien phai thi lai la: " + soLuongHocVienPhaiThiLai);
        System.out.println("Ten cac mon thi lai la: " + tenMonThiLai);
    }
}
