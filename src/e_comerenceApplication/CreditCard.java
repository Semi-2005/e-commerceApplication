
package e_comerenceApplication;



/**
 *
 * @author mejde
 */
public class CreditCard {
    private String creditCardNumber;
    private String creditCardUser;
    private String securityCode;
    private String expirationDateOfCard;

    public CreditCard(String creditCardNumber, String creditCardUser, String securityCode, String expirationDateOfCard) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securityCode = securityCode;
        this.expirationDateOfCard = expirationDateOfCard;
    }
    
    
    /**
     * @return the creditCardNumber
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /**
     * @param creditCardNumber the creditCardNumber to set
     */
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    /**
     * @return the creditCardUser
     */
    public String getCreditCardUser() {
        return creditCardUser;
    }

    /**
     * @param creditCardUser the creditCardUser to set
     */
    public void setCreditCardUser(String creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    /**
     * @return the securityCode
     */
    public String getSecurityCode() {
        return securityCode;
    }

    /**
     * @param securityCode the securityCode to set
     */
    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * @return the expirationDateOfCard
     */
    public String getExpirationDateOfCard() {
        return expirationDateOfCard;
    }

    /**
     * @param expirationDateOfCard the expirationDateOfCard to set
     */
    public void setExpirationDateOfCard(String expirationDateOfCard) {
        this.expirationDateOfCard = expirationDateOfCard;
    }

    
}
