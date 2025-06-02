package e_comerenceApplication;


public class Product {
    private String productName;
    private String productColor;
    private String productCategory;
    private int productStockİnformation;
    private int productStartStock;
    private double weight;
    private String descriptionProduct;
    private String price;

    public Product(String productName, String productColor, String productCategory, int productStockİnformation, double weight, String descriptionProduct,String price) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStockİnformation = productStockİnformation;
        this.productStartStock = productStockİnformation;
        this.weight = weight;
        this.descriptionProduct = descriptionProduct;
        this.price = price;
    }
    public Product(){
        
    }
    public int getProductStartStock(){
        return this.productStartStock;
    }
    public void setProductStartStock(){
        this.productStartStock=productStockİnformation;
    }

    
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productColor
     */
    public String getProductColor() {
        return productColor;
    }

    /**
     * @param productColor the productColor to set
     */
    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    /**
     * @return the productCategory
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * @param productCategory the productCategory to set
     */
    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    /**
     * @return the productStockİnformation
     */
    public int getProductStockİnformation() {
        return productStockİnformation;
    }

    /**
     * @param productStockİnformation the productStockİnformation to set
     */
    public void setProductStockİnformation(int productStockİnformation) {
        this.productStockİnformation = productStockİnformation;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the descriptionProduct
     */
    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    /**
     * @param descriptionProduct the descriptionProduct to set
     */
    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }
    
    
    
}
