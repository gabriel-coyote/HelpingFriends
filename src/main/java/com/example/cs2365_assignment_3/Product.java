package com.example.cs2365_assignment_3;

public class Product {

    private String productName;
    private String productNumber;
    private String Description;
    private String eliteStatus;
    private double Price;  // For Elite Products
    private String imageFileName;         // For Regular Products
    private String email;
    private String phoneNum;
    private int  quantityProduct;



    //getters and setters
    public String getproductName(){
        return this.productName;
    }
    public void setproductName(String fname){
        productName= fname;
    }
    public String getproductNumber(){
        return this.productNumber;
    }
    public void setproductNumber(String fname){
        productNumber= fname;
    }
    public String getDescription(){
        return this.Description;
    }
    public void setDescription(String fname){
        Description= fname;
    }
    public Double getPrice(){
        return this.Price;
    }
    public void setPrice(double fname){
        Price= fname;
    }
    public int getquantityProduct(){
        return this.quantityProduct;
    }
    public void setquantityProduct(int fname){
        Price= fname;
    }

    /** NAME: Product
     PARAMETERS: none
     PURPOSE: default constructor
     PRECONDITION: variables declared
     POSTCONDITION: all variables have defaults
     */
    public Product()
    {
        this.productName= "productName";
        this.productNumber= "productNumber";
        this.Description= "NULL";
        this.imageFileName = "NA";
    }


    /** NAME: Product
     PARAMETERS: String fname, String lname, String rNum, String email
     PURPOSE: assign values to variables
     PRECONDITION: none
     POSTCONDITION: no return, just variables assigned
     */
    public Product(String fname, String lname, String rNum, String stars)
    {
        this.productName=fname;
        this.productNumber= lname;
        this.Description= rNum;
        this.imageFileName = stars;

    }


    /** NAME: toString
     PARAMETERS: none
     PURPOSE: return string
     PRECONDITION: none
     POSTCONDITION: returning string for object
     */
    public String toString()
    {
        return ("Name:\t\t\t\t" + productName + "ProductNumber" + productNumber + "\nDescription:\t\t\t" + Description   + "\nImageFileName:\t\t\t" + imageFileName );
    }
}
