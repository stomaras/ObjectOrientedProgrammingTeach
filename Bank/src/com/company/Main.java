package com.company;

public class Main {
    private static boolean isAddBranch;
    private static boolean isAddCustomer;
    private static boolean isAddCustomerTransaction;





    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("Alpha Bank");
        bank.addBranch("Gyzi");
        bank.addCustomer("Gyzi", "Tom", 25.00);
        bank.addCustomer("Gyzi", "Chris", 20.00);

        bank.addCustomerTransaction("Gyzi", "Tom", 10.00);
        bank.addCustomerTransaction("Gyzi", "Chris", 12.00);

        bank.listCustomers("Gyzi",true);



    }


}
