package _04_DesignPattern;

import java.util.ArrayList;
import java.util.List;

class Account {
    int id;
    int value;

    public Account() {
        id = -1;
        value = 0;
    }

    @Override
    public String toString() {
        return "[" + id + "] - [" + value + "]";
    }
}

class Bank {
    int liquidity;
    List<Account> clientAccounts;

    public Bank() {
        liquidity = 0;
        clientAccounts = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bank informations : \n");
        builder.append("Liquidity : ").append(liquidity).append("\n");
        for (Account clientAccount : clientAccounts) {
            builder.append(clientAccount).append("\n");
        }
        return builder.toString();
    }
}

public class Datas {
    public static void main(String[] args) {
        Account accountA = new Account();
        accountA.id = 0;
        accountA.value = 100;

        Account accountB = new Account();
        accountB.id = 1;
        accountB.value = 100;

        Bank bank = new Bank();
        bank.liquidity = 999;
        bank.clientAccounts.add(accountA);
        bank.clientAccounts.add(accountB);

        bank.liquidity -= 200;
        accountA.value += 400;

        System.out.println("Account : ");
        System.out.println(accountA);
        System.out.println(accountB);

        System.out.println(" ----- ");

        System.out.println("Bank : ");
        System.out.println(bank);
    }
}
