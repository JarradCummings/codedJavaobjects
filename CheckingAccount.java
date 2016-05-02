/*
Cummings,Jarrad
CSC210
*/

public class CheckingAccount extends BankAccount
{
      private double fee = .15;
      private String AccountNumber = getAccountNumber()+"-10";
      
      
      public CheckingAccount (String name, double amount)
         {
         super(name,amount);
         setAccountNumber(AccountNumber);
         }
      public boolean withdraw(double amount)
         {
            double finalAmount = amount+fee;
            super.withdraw(finalAmount);
            boolean completed = true;
            return completed;
         }
     } 

