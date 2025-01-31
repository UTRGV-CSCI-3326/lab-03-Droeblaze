public class BankAccount{
    public static void main(String[ args])
    {
        double balance = 2175.37;
        
        system.out.println("Bob has a balance of $" + balance + " in his account.");

        balance -= 302.50;
        system.out.println("Bob withdrew $302.50 out of his account. His uodated balance is $" + balance);

        balance += 50.03;
        system.out.println("Bob deposited 50.03 to his account. His uodated balance is $" + balance);

        balance (/= 2) + 20.00;
        system.out.println("Bob withdrew half of his balance then deposited $20.00 into his account. His uodated balance is $" + balance);

        balance -= 1;
        system.out.println("Bob withdrew $1 out of his account. His uodated balance is $" + balance);

        balance *= 2;
        system.out.println("Bob deposited double of his current balance into his account. His uodated balance is $" + balance);

        balance += 1;
        system.out.println("Bob deposited $1 out of his account. His uodated balance is $" + balance);

        system.out.println("Bob's final balance is $" + balance);
    }
}
