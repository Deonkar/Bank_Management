import java.util.*;

public class adv_bankapp {

    private int account_number;
    private String name;
    private double bank_balance;
    private static String bank_name;
    private double total_bank_balance;
    private int choice_options;
    private String employee1;
    private int id1;
    private String employee2;
    private int id2;

    void Employee() {
        this.id1 = 1;
        this.employee1 = "ram";
        this.id2 = 2;
        this.employee2 = "raju";
    }

    public void customer(int ac, String n, double bb, String bn, double totalbb, int ch) {
        account_number = ac;
        name = n;
        bank_balance = bb;
        bank_name = bn;
        total_bank_balance = totalbb;
        choice_options = ch;
    }

    void showInfo() {
        System.out.println("Name:" + name);
        System.out.println("Account Number:" + account_number);
        System.out.println("Bank Balance:" + bank_balance);
        //System.out.println("Bank name:" + bank_name);
        //System.out.println("Total Bank Balance:" + total_bank_balance);
    }

    void addInfo() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = scr.next();
        System.out.println("Enter Your Account Number:");
        int acc_number = scr.nextInt();
        System.out.println("Amount to be added:");
        double bankbal = scr.nextInt();
        bank_balance=bankbal+bank_balance;
        System.out.println("Bank Balance:"+bank_balance);
       // System.out.println("Bank name:");
      //  System.out.println("Total Bank Balance:");
    }

    void withdraw() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the amount u want to withdraw");
        double amt = scr.nextDouble();
        if (amt > bank_balance) {
            System.out.println("Insufficient Funds");
        } else {
            bank_balance = bank_balance - amt;
            System.out.println("Balance Left:" + bank_balance);
        }

    }

    void deposite() {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the amount u want to deposite:");
        double amt = scr.nextDouble();
        bank_balance = bank_balance + amt;
        System.out.println("Bank Balance:" + bank_balance);
    }

    void options() {
        System.out.println("Please Select a option:");
        System.out.println("1.Show Account Details");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposite");
        System.out.println("4.addInfo");
        System.out.println("5.Employee");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                showInfo();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                deposite();
                break;
            case 4:
                addInfo();
                break;
            case 5:
                Employee();
                Scanner scr = new Scanner(System.in);
                System.out.println("Enter Your Unique Employee id:");
                int Unique = scr.nextInt();
                if (Unique == id1 || Unique == id2) {
                    total_bank_balance = total_bank_balance + 1000;
                    System.out.println("Bank Balance Of SBI bank is:" + total_bank_balance);

                } else {
                    System.out.println("Not an employee");
                }
                break;
        }
    }

    public static void main(String[] args) {

        adv_bankapp c1 = new adv_bankapp();

        c1.options();

    }
}
