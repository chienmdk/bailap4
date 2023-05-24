package bai3lab4;

public class DiemHocVien {
    private String hoTen;
    private int namSinh;
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;
    private double diemMon4;
    private double diemMon5;

    public DiemHocVien(String hoTen, int namSinh, double diemMon1, double diemMon2, double diemMon3, double diemMon4, double diemMon5) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
        this.diemMon4 = diemMon4;
        this.diemMon5 = diemMon5;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public double tinhDiemTrungBinh() {
        return (diemMon1 + diemMon2 + diemMon3 + diemMon4 + diemMon5) / 5.0;
    }

    public boolean coMonDuoi5Diem() {
        return (diemMon1 < 5 || diemMon2 < 5 || diemMon3 < 5 || diemMon4 < 5 || diemMon5 < 5);
    }

    public boolean coMonDuoi7Diem() {
        return (diemMon1 < 7 || diemMon2 < 7 || diemMon3 < 7 || diemMon4 < 7 || diemMon5 < 7);
    }

    public boolean laHocVienLamLuanVan() {
        return (!coMonDuoi5Diem() && tinhDiemTrungBinh() > 7);
    }

    public boolean laHocVienThiTotNghiep() {
        return (tinhDiemTrungBinh() <= 7 && !coMonDuoi5Diem());
    }

    public boolean phaiThiLai() {
        return coMonDuoi5Diem();
    }

    public String toString() {
        return hoTen + " - Nam sinh: " + namSinh + " - Diem mon 1: " + diemMon1 + " - Diem mon 2: " + diemMon2 + " - Diem mon 3: " + diemMon3 + " - Diem mon 4: " + diemMon4 + " - Diem mon 5: " + diemMon5;
    }

	public int getDismMon5() {
		return 0;
	}

	public int getDismMon4() {
		return 0;
	}

	public int getDismMon3() {
		return 0;
	}

	public int getDismMon2() {
		return 0;
	}

	public int getDismMon1() {
		return 0;
	}
}
