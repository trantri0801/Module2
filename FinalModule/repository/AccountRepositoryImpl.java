package FinalModule.repository;

import FinalModule.helper.FileHelper;
import FinalModule.model.Account;
import FinalModule.model.AccountPay;
import FinalModule.model.AccountTietKiem;
import FinalModule.util.Constant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountRepositoryImpl implements IAccountRepository {
    private static List<Account> accountList = new ArrayList<>();
    private static FileHelper fileHelper = new FileHelper();

    public AccountRepositoryImpl() {
        accountList = this.mapToAccount();
    }

    @Override
    public void addAccount(Account account) {
        int lastId = 0;
        if (accountList.size() > 0){
            lastId = accountList.get(accountList.size()-1).getId();
        }
        account.setId(lastId+1);
        accountList.add(account);
        fileHelper.write(Constant.FILE_PATH, Collections.singletonList(account), true);
    }

    public List findAll(){
        return accountList;
    }

    @Override
    public void removeAccount(int inputID) {
        for (int i = 0; i < accountList.size(); i++){
            if (accountList.get(i).getId() == inputID){
                accountList.remove(i);
                fileHelper.write(Constant.FILE_PATH,accountList,false);
            }
        }
    }

    public boolean checkAccountID(int inputID) {
        boolean check = false;
        for (int i = 0; i < accountList.size(); i++){
            if (accountList.get(i).getId() == inputID){
                check = true;
            }
        }
        return check;
    }

    public List findAccountByName(String inputName){
        List result = new ArrayList();
        for (int i = 0; i < accountList.size(); i++){
            if (accountList.get(i).getAccountName().contains(inputName)){
                result.add(accountList.get(i));
            }
        }
        System.out.println(result.toString());
        return result;
    }
    public List findAccountByID(int inputID){
        List result = new ArrayList();
        for (int i = 0; i < accountList.size(); i++){
            if (accountList.get(i).getId() == inputID){
                result.add(accountList.get(i));
            }
        }
        System.out.println(result.toString());
        return result;
    }
    public boolean checkAccountName(int inputID){
        boolean check = false;
        for (int i = 0; i < accountList.size(); i++){
            if (accountList.get(i).getId() == inputID){
                check = true;
            }
        }
        return check;
    }

    @Override
    public boolean checkAccountName(String inputName) {
        return false;
    }

    private List mapToAccount() {
        List result = new ArrayList();
        List<String> lines = fileHelper.read(Constant.FILE_PATH);

        for (String line : lines) {
            String tmp[] = line.split(",");
            int id = Integer.parseInt(tmp[0]);
            String CodeAccount = tmp[1];
            String AccountName = tmp[2];
            String Date = tmp[3];

            if (tmp[8].equals("AccountTietKiem")) {
                int Money = Integer.parseInt(tmp[4]);
                String DateGui = tmp[5];
                String LaiSuat = tmp[6];
                int KyHan = Integer.parseInt(tmp[7]);

                result.add(new AccountTietKiem(id,CodeAccount,AccountName,Date,Money,DateGui,LaiSuat,KyHan));
            } else {
                String SoThe= tmp[4];
                String MoneyAccount = tmp[5];

                result.add(new AccountPay(id,CodeAccount,AccountName,Date,SoThe,MoneyAccount));
            }
        }
        return result;
    }
}
