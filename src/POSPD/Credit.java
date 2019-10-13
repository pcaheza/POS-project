package POSPD;

import java.time.LocalDate;

/**
 * Credit is one way to make an authorizedPayment by enable the person or customer cardholder to pay purchased sale item from store.
 */
public class Credit extends AuthorizedPayment {

    /**
     * this specify  the type of the card the customers are using to make payment.
     */
    private String cardType;
    /**
     * this specify the account number of the credit card the client is using to make payment.
     */
    private String acctNumber;
    /**
     * this is specify the expiration date of the credit card of the customer.
     */
    private LocalDate expireDate;

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getAcctNumber() {
        return this.acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public LocalDate getExpireDate() {
        return this.expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * this is a default constructor for credit.
     */
    public Credit() {
        // TODO - implement Credit.Credit
        throw new UnsupportedOperationException();
    }

    /**
     * this is a constructor which have cardType ,accNumber and expireDate as parameter.
     * @param cardType
     * @param acctNumber
     * @param expireDate
     */
    public Credit(String cardType, String acctNumber, String expireDate) {
        // TODO - implement Credit.Credit
        throw new UnsupportedOperationException();
    }

    public Boolean isAuthorized() {
        // TODO - implement Credit.isAuthorized
        throw new UnsupportedOperationException();
    }

    public String toString() {
        // TODO - implement Credit.toString
        throw new UnsupportedOperationException();
    }

	@Override
	public Boolean countAsCash() {
		// TODO Auto-generated method stub
		return null;
	}

}