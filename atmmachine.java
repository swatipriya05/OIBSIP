/*
All currenccy is in IND Rs.

Account Number : Madhav , PIN : 5287

NOTE: Your initial balance is  50000;
*/

import java.util.Objects;
import java.util.Scanner;

public class atmmachine {
    public static void main(String[] args) {

        System.out.println("---ATM MACHINE---");
        String User_id;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User id");
        User_id = sc.nextLine();

        int balance=50000, withdraw, deposite,transfer;
        if (Objects.equals(User_id, "Madhav")) {
            System.out.println("User id correct");
            System.out.println("Enter password");
            int password = sc.nextInt();
            if (password == 5287) {
                System.out.println("Valid password");

                System.out.println("Enter your choice");
                System.out.println("Choose 1 for Deposite");  
                System.out.println("Choose 2 for Withdraw");  
                System.out.println("Choose 3 for Transfer money");  
                System.out.println("Choose 4 for EXIT");  
                System.out.print("Choose the operation you want to perform");

                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                    System.out.println("Enter amount to deposite: ");
                    deposite = sc.nextInt();
                    balance=balance+deposite;
                    break;

                    case 2:
                    System.out.println("Enter amount to withdraw: ");
                    withdraw = sc.nextInt();
                    if(withdraw<balance){
                        balance = balance-withdraw;
                        System.out.println("Successfully withdrawn!!!");
                    }
                    else{
                        System.out.println("Balance insufficient!");
                    
                    }
                    System.out.println("Current balance: "+balance);
                    System.out.println("");
                    break;

                    case 3:
                    System.out.println("Enter account number you want to transfer: ");
                    System.out.println("Enter bank name: ");
                    System.out.println("Enter beneficiary name: ");
                    String str=sc.nextLine();

                    System.out.println("Enter amount: ");
                    transfer = sc.nextInt();
                    if(transfer<balance){
                        balance = balance - transfer;
                        System.out.println("Transfer done!!");

                    }
                    else{
                        System.out.println("Balance insufficient!");
                    }
                    System.out.println("");
                    System.out.println("Current balance: "+balance);
                    break;

                    case 4:
                    System.out.println("EXIT!"); 



                }
            }

            
            else {
            System.out.println("Invalid password");
        }


    }
        else{
            System.out.println("Invalid user id");
        }


    }
}


