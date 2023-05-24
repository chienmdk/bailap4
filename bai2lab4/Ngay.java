package bai2lab4;

class Ngay {
    public int ngay;
    public int thang;
    public int nam;

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}

