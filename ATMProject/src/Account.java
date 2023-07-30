import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int customernumber;
    private int pinNumber;
    private double checkingbalance=0;
    private double savingbalance=0;
    Scanner input=new Scanner(System.in);

    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

    public void setCustomernumber(int customernumber) {
        this.customernumber = customernumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }


    public int getCustomernumber() {
        return customernumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getCheckingbalance() {
        return checkingbalance;
    }

    public double getSavingbalance() {
        return savingbalance;
    }

    public double calcCheckingWithdraw(double amount)
    {
        checkingbalance=(checkingbalance-amount);
        return  checkingbalance;
    }

    public double calcSavingWithdraw(double amount)
    {
        savingbalance=(savingbalance-amount);
        return  savingbalance;
    }
    public double calcCheckingdeposit(double amount)
    {
        checkingbalance=(checkingbalance+amount);
        return  checkingbalance;
    }

    public double calcSavingdeposit(double amount)
    {
        savingbalance=(savingbalance+amount);
        return  savingbalance;
    }

    public void getcheckingWithdrawInput()
    {
        System.out.println("Checking Accoung balance:"+moneyFormat.format(checkingbalance));
        System.out.println("Amount you want to withdraw from account:");
        double amount=input.nextDouble();
        if((checkingbalance-amount)>=0)
        {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance:"+moneyFormat.format(checkingbalance));

        }
        else
        {
            System.out.println("Balance Cannot Be negative");
        }
    }

    public void  getcheckingdepositInput()
    {
        System.out.println("Checking Account Blance:"+moneyFormat.format(checkingbalance));
        System.out.println("Amount you want to deposit from checking account:");
        double amount=input.nextDouble();
        if((checkingbalance+amount)>=0)
        {
            calcCheckingdeposit(amount);
            System.out.println("New checking Account Balance:"+moneyFormat.format(checkingbalance));
        }

        else
        {
            System.out.println("Balance Cannot be negative");
        }





    }

    public void getsavingwithdrawinput()
    {
        System.out.println("Saving Account Balance:"+moneyFormat.format(savingbalance));
        System.out.println("Amount you want to withdraw from Saving Account:");
        double amount=input.nextDouble();
        if((savingbalance-amount)>=0)
        {
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance:"+moneyFormat.format(savingbalance));

        }
        else
        {
            System.out.println("Balance cannot be negative");
        }

    }

    public void getsavingdepositinput()
    {
        System.out.println("Saving Account Balance:"+moneyFormat.format(savingbalance));
        System.out.println("Amount you want to deposit from Saving Account:");
        double amount=input.nextDouble();
        if((savingbalance+amount)>=0)
        {
            calcSavingdeposit(amount);
            System.out.println("New Saving Account Balance:"+moneyFormat.format(savingbalance));

        }
        else
        {
            System.out.println("Balance cannot be negative");
        }

    }

}
