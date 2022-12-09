package FinalModule.model;


public abstract class Account {
    private int id;
    private String CodeAccount;
    private String AccountName;
    private String Date;

    public Account(int id, String codeAccount, String accountName, String date) {
        this.id = id;
        this.CodeAccount = codeAccount;
        this.AccountName = accountName;
        this.Date = date;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public String getCodeAccount() {
        return CodeAccount;
    }

    public String getAccountName() {
        return AccountName;
    }

    public String getDate() {
        return Date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodeAccount(String codeAccount) {
        CodeAccount = codeAccount;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,",id,CodeAccount,AccountName,Date);
    }
}
