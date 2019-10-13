package POSPD;

/**
 *   check is a form of online payment where money is electronically withdrawn from the payer's checking account, transferred over the ACH network, and deposited into the store checking account.
 */
public class Check extends AuthorizedPayment {

    /**
     * this will specify the  routing number of the customer.
     */
    private String routingNumber;
    /**
     * this indicate the account number of the customer.
     */
    private String accountNumber;
    /**
     * this specify the number of check the customer has given to store.
     */
    private String checkNumber;

    public String getRoutingNumber() {
        return this.routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCheckNumber() {
        return this.checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    /**
     * this is a constructor which is having amount and accountNumber as paremeter
     * @param amount
     * @param accountNumber
     */
    public Check(String amount, String accountNumber) {
        // TODO - implement Check.Check
        throw new UnsupportedOperationException();
    }

    /**
     * this method is checking if the check is authorized.
     */
    public Boolean isAuthorized() {
        // TODO - implement Check.isAuthorized
        throw new UnsupportedOperationException();
    }

    public String toString() {
        // TODO - implement Check.toString
        throw new UnsupportedOperationException();
    }

    /**
     * this a default constructor for check
     */
    public Check() {
        // TODO - implement Check.Check
        throw new UnsupportedOperationException();
    }

	@Override
	public Boolean countAsCash() {
		// TODO Auto-generated method stub
		return null;
	}

}