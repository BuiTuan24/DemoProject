import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien {
    String ten;
    int soBaoDanh;
    double diemToan, diemLy, diemHoa;

    public SinhVien(String ten, int soBaoDanh, double diemToan, double diemLy, double diemHoa) {
        this.ten = ten;
        this.soBaoDanh = soBaoDanh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public double getTongDiem() {
        return diemToan + diemLy + diemHoa;
    }

    @Override
    public String toString() {
        return "Số báo danh là: " + soBaoDanh +"," +
                "Họ và tên là: " + ten +"," +
                "Điểm toán là: " + diemToan + "," +
                "Điểm lý là: " + diemLy + "," +
                "Điểm hóa là: " + diemHoa + "," +
                "Tổng điểm là: " + getTongDiem();
    }
}

public class SapXepThiSinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng thí sinh: ");
        int n = scanner.nextInt();

        ArrayList<SinhVien> danhSach = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin thí sinh thứ " + (i+1));
            System.out.print("Nhập tên: ");
            String ten = scanner.next();
            System.out.print("Nhập số báo danh: ");
            int soBaoDanh = scanner.nextInt();
            System.out.print("Nhập điểm toán: ");
            double diemToan = scanner.nextDouble();
            System.out.print("Nhập điểm lý: ");
            double diemLy = scanner.nextDouble();
            System.out.print("Nhập điểm hóa: ");
            double diemHoa = scanner.nextDouble();

            SinhVien sv = new SinhVien(ten, soBaoDanh, diemToan, diemLy, diemHoa);
            danhSach.add(sv);
        }

        System.out.println("Danh sách thí sinh trước khi sắp xếp:");
        for (SinhVien sv : danhSach) {
            System.out.println(sv);
        }

        // Sắp xếp theo tổng điểm giảm dần
        Collections.sort(danhSach, (sv1, sv2) -> Double.compare(sv2.getTongDiem(), sv1.getTongDiem()));

        System.out.println("\nDanh sách thí sinh sau khi sắp xếp theo tổng điểm:");
        for (SinhVien sv : danhSach) {
            System.out.println(sv);
        }
    }
}