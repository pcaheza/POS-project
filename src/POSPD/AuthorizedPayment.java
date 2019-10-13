package POSPD;

/**
 * AuthorizedPayment is about allowing merchants to accept credit card and electronic check payments through authorized.net website and over an Internet Protocol connection.
 */
public abstract class AuthorizedPayment extends Payment {

    /**
     * this will authorize the payment.
     */
    private String authorizationCode;

    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
    }

    /**
     * this will check if the payment is authorized.
     */
    public abstract Boolean isAuthorized();

    /**
     * this function will check if the payment is made in cash.
     */
    public abstract Boolean countAsCash();

}