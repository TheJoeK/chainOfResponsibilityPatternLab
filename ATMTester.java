abstract class Handler
{
    Handler successor;
    abstract public String dispense(int amount);
}

class Handler500 extends Handler
{
}

class Handler100 extends Handler
{
}

class Handler50 extends Handler
{
}

class Handler10 extends Handler
{
}

class Handler5 extends Handler
{
}

class Handler1 extends Handler
{
}

class ATM
{
    Handler handler;
    public ATM(Handler handler)
    {
        this.handler = handler;
    }

    public string dispense(int amount)
    {
        return handler.dispense();
    }
}

public class ATMTester
{
    public static void main(String[] args)
    {
	    ATM atm;

    	/// TODO - create an ATM object with the appropriate handlers and store it in the variable "atm"

    	System.out.println(atm.dispense(1234)); // should display: 2 bills of $500 + 2 bills of $100 + 3 bills of $10 + 4 bills of $1

    	System.out.println(atm.dispense(1235)); // should display: 2 bills of $500 + 2 bills of $100 + 3 bills of $10 + 1 bills of $5
    }
}
