package ru.mirea.task21;


import java.util.Date;

public class Product {
    private int accountID;
    private ProductsType productType;
    private Date openDate;
    private Date closeDate;
    private float price;

    Product() {
        this.accountID = 212121;
        this.productType = ProductsType.Credit;
    }
    Product(int acc, ProductsType types, Date openDate, Date closeDate, int productPrice){
        this.accountID = acc;
        this.productType = types;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.price = productPrice;
    }
    public int getAccountID() {
        return this.accountID;
    }
    public void setAccountID(int acc) {
        this.accountID = acc;
    }
    public ProductsType getProductType() {
        return this.productType;
    }
    public void setProductType(ProductsType productType) {
        this.productType = productType;
    }
    public Date getOpenDate() {
        return this.openDate;
    }
    public void setOpenDate(Date date) {
        this.openDate = date;
    }
    public Date getCloseDate() {
        return this.closeDate;
    }
    public void setCloseDate(Date date) {
        this.closeDate = date;
    }
    public float getPrice() {
        return this.price;
    }
}
