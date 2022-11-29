package Collection;

public class Product {
    private int id;
    private String Ten_SP;
    private double Gia;

    public Product(int id, String ten_SP, double gia) {
        this.id = id;
        Ten_SP = ten_SP;
        Gia = gia;
    }

    public Product() {
    }

    public Product(int id) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen_SP() {
        return Ten_SP;
    }

    public void setTen_SP(String ten_SP) {
        Ten_SP = ten_SP;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double gia) {
        Gia = gia;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Ten_SP='" + Ten_SP + '\'' +
                ", Gia=" + Gia +
                '}';
    }
}

