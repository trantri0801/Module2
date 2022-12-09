package FinalModule.model;

public class AccountTietKiem extends Account {
    private int Money;
    private String DateGui;
    private String LaiSuat;
    private int KyHan;

    public AccountTietKiem(int id, String codeAccount, String accountName, String date, int money, String dateGui, String laiSuat, int kyHan) {
        super(id, codeAccount, accountName, date);
        this.Money = money;
        this.DateGui = dateGui;
        this.LaiSuat = laiSuat;
        this.KyHan = kyHan;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public String getDateGui() {
        return DateGui;
    }

    public void setDateGui(String dateGui) {
        DateGui = dateGui;
    }

    public String getLaiSuat() {
        return LaiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        LaiSuat = laiSuat;
    }

    public int getKyHan() {
        return KyHan;
    }

    public void setKyHan(int kyHan) {
        KyHan = kyHan;
    }

    @Override
    public String toString() {
        return super.toString()+ Money+","+DateGui + ","+ LaiSuat+","+ KyHan+","+getClass().getSimpleName();
    }
}
