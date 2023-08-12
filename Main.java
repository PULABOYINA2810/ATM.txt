import java.util.*;
class ATM
{
    int id=2810;
    double balance=2000;
    double withdrawlAmount=0,depositamount=0,transaction=0,transferamount=0;
     Scanner sc=new Scanner(System.in);
     List<String> obj=new ArrayList();
    void login()
    {
        System.out.println("enter your id");
        int n=sc.nextInt();
        if(n==id)
        {
            System.out.println("Login successfully");
            menu();
        }
        else
        {
            System.out.println("you entered wrong! please try again");
            login();
        }
    }
    void menu()
    {
        int ch;
        
            System.out.println("\nSelect your choice:\n1.View balance \t\t2.Withdraw ");
            System.out.println("3.Deposit \t\t4.Transfer \n5.Transaction history\t\t6.Quit\n");
            do {
            System.out.print("Enter choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                     checkBalance();
                    break;
                case 2:
                    Withdrawl();
                    break;
                case 3:
                    Deposit();
                    break;
                case 4:
                    Transfer();
                    break;
                case 5:
                    Transactionhistory();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        } while (ch!=6);
    }
    void Withdrawl()
    {
       System.out.println("Enter withdraw Amount:");
        withdrawlAmount = sc.nextDouble();
        if(withdrawlAmount>balance)
        {
            System.out.println("Money is insufficient");
            obj.add("Withdrawn Failed:"+withdrawlAmount);
        }
        else{
        System.out.println("Withdrawn successfully");
        balance=balance-withdrawlAmount;
        System.out.println("Balance After withdrawn:" + balance);
        obj.add("Debbited Amount is:"+withdrawlAmount);
    }
    }
    void Deposit()
    {
       System.out.println("enter deposit amount");
       depositamount=sc.nextDouble();
       balance=balance+depositamount;
       System.out.println("Balance After Deposited :" +balance);
       obj.add("Credited Amount is:"+depositamount);
    }
    void  checkBalance()
    {
        System.out.println("Amount Available is:"+balance);
    }
    void Transfer()
    {
        System.out.println("Enter Transfer Amount");
        transferamount=sc.nextInt();
        if(transferamount>balance)
        {
            System.out.println("Money is Insufficient");
            obj.add("Transaction Failed");
        }
        else{
            System.out.println("Money Transferred Successfully");
            balance=balance-transferamount;
            System.out.println("Balance After Transferred Successfully:"+balance);
            obj.add("Transferred Amount is :"+transferamount);
        }
    }
    void Transactionhistory()
    {
        Iterator itr=obj.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println("Balance Remained: " +balance);
    }
}
  class Main
    {
        public static void main (String[] args)
        {
        
                ATM obj=new ATM();
                obj.login();
}
        
    }