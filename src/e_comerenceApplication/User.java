
package e_comerenceApplication;


import java.util.ArrayList;

public class User {
    private String name;
    private  String surName;
    private String userName;
    private String phoneNumber;
    private String password;
    private String dateOfBirth;
    private String email;
    private String homeAdress;
    private String workAdress;
    private ArrayList<Product> productsOrdered;
    private ArrayList<Product> favoriteProducts;
    private ArrayList<Product> cartList;
    private CreditCard creditCard;
    private ArrayList<CreditCard> cardList;
    

    public User(String name, String surName, String userName, String phoneNumber, String password, String dateOfBirth, String email, String homeAdress, String workAdress, CreditCard creditCard) {
        this.name = name;
        this.surName = surName;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.homeAdress = homeAdress;
        this.workAdress = workAdress;
        this.creditCard = creditCard;
        this.productsOrdered = new ArrayList<>();
        this.favoriteProducts = new ArrayList<>();
        this.cartList = new ArrayList<>();
        this.cardList = new ArrayList<>();
        cardList.add(creditCard);
        
        
                }
        public void addToCart(Product product,int piece ){
        cartList.add(product);
        
        product.setProductStockİnformation(product.getProductStockİnformation()- piece); 
        
    }
        public void addOrderedProduct (Product product){
            productsOrdered.add(product);
            
        }
    
    public void addToFavoriteProductList(Product product){
            this.favoriteProducts.add(product);
            
            
           
    }
    
    public void removeToFavoriteProductList(Product product){
        this.favoriteProducts.remove(product);  
    }
    
    public ArrayList<Product> getFavoriteProductList(){
        return this.favoriteProducts;
    }
     
    
    public void removeToCartList(Product product){
        this.favoriteProducts.remove(product);  
    } 
    
    public void addCreditCardOnCardList(CreditCard card){
        cardList.add(card);
    }
    
           
    
    

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surName
     */
    public String getSurName() {
        return this.surName;
    }

    /**
     * @param surName the surName to set
     */
    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email the Email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the homeAdress
     */
    public String getHomeAdress() {
        return this.homeAdress;
    }

    /**
     * @param homeAdress the homeAdress to set
     */
    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    /**
     * @return the workAdress
     */
    public String getWorkAdress() {
        return this.workAdress;
    }

    /**
     * @param workAdress the workAdress to set
     */
    public void setWorkAdress(String workAdress) {
        this.workAdress = workAdress;
    }

    /**
     * @return the creditCard
     */
    public CreditCard getCreditCard() {
        return this.creditCard;
    }

    /**
     * @param creditCard the creditCard to set
     */
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    /**
     * @param favoriteProducts the favoriteProducts to set
     */
    public void setFavoriteProducts(ArrayList<Product> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }

    /**
     * @return the cartList
     */
    public ArrayList<Product> getCartList() {
        return this.cartList;
    }

    /**
     * @param cartList the cartList to set
     */
    public void setCartList(ArrayList<Product> cartList) {
        this.cartList = cartList;
    }

    /**
     * @return the productsOrdered
     */
    public ArrayList<Product> getProductsOrdered() {
        return this.productsOrdered;
    }

    
    

    /**
     * @return the cardList
     */
    public ArrayList<CreditCard> getCardList() {
        return cardList;
    }

    /**
     * @param cardList the cardList to set
     */
    public void setCardList(ArrayList<CreditCard> cardList) {
        this.cardList = cardList;
    }
    
}
