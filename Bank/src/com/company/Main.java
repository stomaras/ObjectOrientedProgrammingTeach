package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("Greece Bank");
        if(bank.addBranch("Alpha")){
            System.out.println("Alpha branch created");
        }
        bank.addCustomer("Alpha","Tom", 30.00);
        bank.addCustomer("Alpha", "Chris", 20.00);

        bank.addBranch("Peiraus");
        bank.addCustomer("Peiraus","kostas", 2.00);

        bank.addCustomerTransaction("Alpha","Tom",44.22);
        bank.addCustomerTransaction("Alpha","Tom",4.22);
        bank.addCustomerTransaction("Alpha","Chris",41.22);

        bank.listCustomers("Alpha", true);
        bank.listCustomers("Peirus", true);
    }


}
