package FinalModule.model;

public class AccountPay extends Account{
    private String SoThe;
    private String MoneyAccount;

    public AccountPay(int id, String codeAccount, String accountName, String date, String soThe, String moneyAccount) {
        super(id, codeAccount, accountName, date);
        this.SoThe = soThe;
        this.MoneyAccount = moneyAccount;
    }

    public String getSoThe() {
        return SoThe;
    }

    public void setSoThe(String soThe) {
        SoThe = soThe;
    }

    public String getMoneyAccount() {
        return MoneyAccount;
    }

    public void setMoneyAccount(String moneyAccount) {
        MoneyAccount = moneyAccount;
    }

    @Override
    public String toString() {
        return super.toString()+ SoThe+","+MoneyAccount + ","+getClass().getSimpleName();
    }
}
