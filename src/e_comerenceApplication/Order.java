
package e_comerenceApplication;


public class Order {
    private User user;
    private Product product;
    private CreditCard creditCard;

    public Order(User user, Product product, CreditCard creditCard) {
        this.user = user;
        this.product = product;
        this.creditCard = creditCard;
    }
    public void FinishOrder(){
        for(int i = 0;i<user.getCartList().size();i++){
            user.getCartList().get(i).setProductStartStock();
            user.addOrderedProduct(user.getCartList().get(i));
            
            
        }
        this.user.getCartList().clear();
    }
    public void addToCart(Product product,int quantity ){
        this.user.addToCart(product, quantity);
        
    }
    

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the creditCard
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * @param creditCard the creditCard to set
     */
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
    
    
}
