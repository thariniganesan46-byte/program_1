#import java.io.*
#import java.util.Scanner
public class ATM{
Public Static void main(string[]args)
{
Scanner sc = new Scanner(System.in);
int pin = 1234;
int balance = 20000;
System.out.println("Enter the pin");
int p= sc.next();
if(p.equal(pin))
{
System.out.println("1.check balance");
System.out.println("2.withdraw money");
System.out.println("3.deposite money");
System.out.println("Enter your choice");
int choice = sc.nextInt();
 if (choice == 1) {
 System.out.println("Balance = " + balance);
 }
 else if (choice == 2) {
 System.out.print("Enter amount: ");
 int amount = sc.nextInt();
 if (amount <= balance && amount % 100 == 0) {
 balance = balance - amount;
 System.out.println("Withdrawal Successful");
 System.out.println("Balance = " + balance);
 } else {
 System.out.println("Invalid Withdrawal");
 }
 }
 else if (choice == 3) {
 System.out.print("Enter amount: ");
 int amount = sc.nextInt();
 if (amount % 100 == 0 && amount < 40000) {
 balance = balance + amount;
 System.out.println("Deposit Successfulluy");
 System.out.println("Balance = " + balance);
 } else {
 System.out.println("Invalid Deposit");
 }
 }
 else {
 System.out.println("Invalid Choice");
 }
} else {
 System.out.println("Wrong PIN");
 }

1 sc.close();
    }
}
