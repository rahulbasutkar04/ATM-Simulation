import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
public class OptionMenu extends Account {
    Scanner menuinput=new Scanner(System.in);
    DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
    HashMap<Integer,Integer> data=new HashMap<Integer, Integer>();

    public void getlogin() throws IOException{
        int x=1;
        do{
            try{
                data.put(952141,191904);
                data.put(989947,71976);
                System.out.println("Welcome to Atm Project");
                System.out.println("Enter Your Customer Number:");
                setCustomernumber(menuinput.nextInt());
                System.out.println("Enter Your Pin:");
                setPinNumber(menuinput.nextInt());


            }catch(Exception e)
            {
                System.out.println("\n"+"Invalid Character(s).Only Numbers."+"\n");
                x=2;
            }

            int cn=getCustomernumber();
            int pn=getPinNumber();
            if(data.containsKey(cn) && data.get(cn)==pn)
            {
                getAccountType();
            }
            else {
                System.out.println("Wrong Pin or Number");
            }
        }while(x==1);
    }

    public void getAccountType()
    {
        System.out.println("Selectt the account You want to access:");
        System.out.println("Type1:Checking Acoount");
        System.out.println("Type2:Saving Account");
        System.out.println("Type3:Exit");
        int selection=menuinput.nextInt();
        switch (selection)
        {
            case 1:
                getcheckng();
                break;

            case 2:
                getsaving();
                break;

            case 3:
                System.out.println("Thank you for using ATM");
                break;
            default:
                System.out.println("Invalid Choice");
                getAccountType();
        }




    }

    private void getsaving() {
        System.out.println("Saving Account");
        System.out.println("Type 1:View Blalance");
        System.out.println("Type 2:Withdraw Balance");
        System.out.println("Type 3:Deposit");
        System.out.println("Type 4:Exit");

        int selection=menuinput.nextInt();

        switch (selection)
        {
            case 1:
                System.out.println("Saving Account Balance:"+moneyFormat.format(getSavingbalance()));
                getAccountType();
                break;
            case 2:
                getsavingwithdrawinput();
                getAccountType();
                break;
            case 3:
                getsavingdepositinput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for Using ATM");
                getAccountType();
                break;
            default:
                System.out.println("Wrong Choice");
                getAccountType();

        }

    }

    public void getcheckng() {
        System.out.println("Checking Account");
        System.out.println("Type 1:View Blalance");
        System.out.println("Type 2:Withdraw Balance");
        System.out.println("Type 3:Deposit");
        System.out.println("Type 4:Exit");

        int selection=menuinput.nextInt();

        switch (selection)
        {
            case 1:
                System.out.println("Checking Account Balance:"+moneyFormat.format(getCheckingbalance()));
                getAccountType();
                break;
            case 2:
                getcheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getcheckingdepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank You for Using ATM");
                getAccountType();
                break;
            default:
                System.out.println("Wrong Choice");
                getAccountType();

        }

    }


}
