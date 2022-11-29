package Collection;

import java.util.*;

public class ProductManage {
    private ArrayList<Product> danhsach;

    public ProductManage(ArrayList<Product> danhsach) {
        this.danhsach = danhsach;
    }

    public ProductManage() {
        this.danhsach = new ArrayList<Product>();
    }

    public void display(){
        for (Product pd: danhsach) {
            System.out.println(pd);
        }
    }

    public boolean delete(int pdID){
        for (int i = 0; i<danhsach.size(); i++) {
           if (danhsach.get(i).getId() == pdID) {
               danhsach.remove(i);
               return true;
           }
        }
        return false;
    }

    public boolean check(Product pd){
        return this.danhsach.contains(pd);
    }

    public void addProduct(Product pd){
        this.danhsach.add(pd);
    }

    public void Seach(String ten) {
        for (Product pd : danhsach) {
            if (pd.getTen_SP().indexOf(ten) >= 0) {
                System.out.print(pd);
            }
        }
    }

    public void sapXep() {
        Collections.sort(this.danhsach, new Comparator<Product>() {

            @Override
            public int compare(Product sv1, Product sv2) {
                if (sv1.getId() < sv2.getId()){
                    return -1;
                } else if (sv1.getId() > sv2.getId()){
                    return 1;
                } else
                    return 0;
            }
        });
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManage dssp = new ProductManage();
        int select = 0;
        do {
            System.out.printf("\nMENU--------\n");
            System.out.printf("Chon chuc nang\n");
            System.out.printf(
                    "1. Them. \n" +
                    "2. Sua. \n" +
                    "3. Xoa. \n" +
                    "4. Hien thi. \n" +
                    "5. Tim Kiem. \n" +
                    "6. Sap xep. \n" +
                    "0. Thoat khoi chuong trinh. \n");
                    select = Integer.parseInt(sc.nextLine());
                    if (select == 1){
                        System.out.printf("Nhap ID: "); int id =  Integer.parseInt(sc.nextLine());
                        System.out.printf("Nhap ten san pham: "); String sp = sc.nextLine();
                        System.out.printf("Nhap gia tien: "); double cost = Double.parseDouble(sc.nextLine());
                        Product pd = new Product(id,sp,cost);
                        dssp.addProduct(pd);
                    } else if (select == 2){

                    } else if (select == 3){
                        System.out.printf("Nhap id: ") ;
                        int id =  Integer.parseInt(sc.nextLine());
                        System.out.printf("Delete " + dssp.delete(id));
                    } else if (select == 4){
                        dssp.display();
                    } else if (select == 5){
                        System.out.printf("Nhap ten sp: ");
                    } else if (select == 6){
                        dssp.sapXep();
                    }
        } while (0 < select || select >= 6);
    }
}
