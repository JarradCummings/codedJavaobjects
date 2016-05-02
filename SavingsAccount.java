/*
Cummings,Jarrad
CSC210
*/

public class SavingsAccount extends BankAccount
   {
      private double rate = .025;
      private static int SavingsNumber=0;
      private String AccountNumber=getAccountNumber();
      
      public SavingsAccount(String name,double amount)
         {
            super(name,amount);
            
            AccountNumber=super.getAccountNumber().concat("-"+SavingsNumber);
            
            SavingsNumber++;
            
         }
       public SavingsAccount(SavingsAccount oldAccount,double amount)
         {
            super(oldAccount,amount);
            
            SavingsNumber = oldAccount.SavingsNumber;
            
            AccountNumber=super.getAccountNumber();
            
            AccountNumber=AccountNumber.concat("-"+SavingsNumber);
            
         }
         
         public void postInterest()
         {
         
         deposit((getBalance()*rate)/12);
         
        } 
        
      public String getAccountNumber()
      {
      
      return AccountNumber;
   }    
    
  }
   