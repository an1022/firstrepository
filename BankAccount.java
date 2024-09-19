public class BankAccount{
    //instance variables
	private int AccountID;//for more sensitive bank account data
	public String OwnerName;
    private double Balance;//for datas that would be okay to be public
	//add more as you need
    //don't scroll down to the answer until you have come up with your own answer!!






    //answer: (there are many possible answers, but here's one example)
    //to make things consistent, we will all use the same sample instance variables for now
    //private String accountNumber;
	//public String name;
	//private double balance;



	//constructor 1
    //maybe we skip default constructors this time, because how can you make an account
    //at a bank, without providing any info?

    //what would the mimumum info be to make an account? (from the list of 3 above, pick 2 for now)
    //just for consistency, so that your solution works with the test code 
	public BankAccount(int AccountNumber, String Owner){ 
		AccountID = AccountNumber;
		OwnerName = Owner;
        Balance = 0.0;
	}
	
    //constructor 2
    //maybe this time the user gives us even MORE data than the minimum,
    //such as maybe,,, 
    //an initial deposit?
    //THINK – why is it okay to have two methods with the same name?
    //how will Java be able to differentiate which constructor version we want to use when we call one?
    //HINT: (what is different about the method signature?)
	public BankAccount(int AccountNumber, String Owner, double InitialBalance){
		AccountID = AccountNumber;
		OwnerName = Owner;
        Balance = InitialBalance;

	}


    //next, think of what methods we need. once you've done that and shared it with your LA, 
    //scroll down to fill in the methods I thought we needed
    //even if your answer is different, it can still be right
    //lets go with my methods so that there's consistency for the testing data


    //if anyone could just do BankAccountName.balance = anyvalue,
    //then people could give themselves free money!
    //or be silly and deposit negative money!
    //that's why, they should only be able to use our method to alter the money 
    //we will protect the data by using conditional logic in our deposit method
    public boolean depositMoney(double amount){
        if (amount <0){
            return false;
        }
        else {
        this.balance = balance + amount;
        return true;
        }
		//if the amount to deposit is negative, is it TRUE or FALSE that we can deposit, and should we change the bank balance?
        //if the amount is positive, is it TRUE or FALSE that we can deposit, and should we change the bank balance?
	}

    //similar to above
    //we use our method to limit access, and ensure
    //that changes to the object's data are valid
	public boolean withdrawMoney(double amount){
        if ((this.balance - amount) < 0){
            return false;
        }
        else {
        this.balance = balance - amount;
        return true;
        }
		//add some logic! 
        //in what cases can we not withdraw the requested amount?
	}
    
    //withdraw money returns true if the account had enough to be withdrawn
    //only if we can withdraw the money should we deposit it in the other account, right?
    public boolean transferMoney(BankAccount to, double amount){
		//hmm, how do we call a method from THIS instance of Bank account?
        //is there a method we can use to check if we can withdraw the money, and withdraw it if we can?
        //is there a method we can use to deposit the money in the other account?
        //how do we call a method on object "to"?
	}
    
    //what if we want to know the account number of the account?
    //the data should be private so they need to call a method to get it
    public String getAccountNumber(){ 
		return this.AccountID;
	}
    //same thing here, but for balance!
	public double getBalance(){ 
		return this.Balance;
	}

    @Override
    //^ think – why do we need this?
	public String toString(){
		return <string representing the object and its data>;
	}

    //when are two bank accounts equal? what piece of data is unique to each bank account?
	public boolean equals(BankAccount other){
		if(this.<uniqueData>.equals(other.<uniqueData>)){
			return true;
		}
		return false;
	}

    //test your class here!
    public static void main(String [] args){
        BankAccount rushd = new BankAccount(<Data with 2 inputs>);
        BankAccount jhonny = new BankAccount(<Data with 2 inputs>);
        BankAccount secondConstructorExample = new BankAccount(<Data, but with 3 inputs>);

        //example of how our conditional logic handles incorrect usage
        if(rushd.depositMoney(-99)){
            System.out.println("successfully deposited negative money :/");
        }
        else System.out.println("unable to deposit.");
        //feel free to test the other methods as well!
        
        //
        System.out.println(rushd); //pre deposit. notice how toString is called automatically?
        rushd.depositMoney(999);
        System.out.println(rushd);//post deposit, should have mo money now

    }

}