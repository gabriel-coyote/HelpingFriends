package com.example.cs2365_assignment_3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int cartItems; //Amount of "carts" in the carts.txt
    static List<Integer> num_cartItems = new ArrayList<>();
    static List<String> rewardNumber_ofCart = new ArrayList<>();
    static List<Integer> cartItem_quantity = new ArrayList<>();


    private String rewardNumber;
    private double Price;  // For Elite Carts
    private String CartNumber;
    private int  cartNumber;



    //getters and setters
    public int getcartItems(){
        return this.cartItems;
    }
    public void setcartItems(int fname){
        cartItems= fname;
    }
    public String getrewardNumber(){
        return this.rewardNumber;
    }
    public void setrewardNumber(String fname){
        rewardNumber= fname;
    }


    public Double getPrice(){
        return this.Price;
    }
    public void setPrice(double fname){
        Price= fname;
    }
    public int getcartNumber(){
        return this.cartNumber;
    }
    public void setcartNumber(int fname){
        Price= fname;
    }

    /** NAME: Cart
     PARAMETERS: none
     PURPOSE: default constructor
     PRECONDITION: variables declared
     POSTCONDITION: all variables have defaults
     */
    public Cart()
    {
        this.cartItems= 0;
        this.cartNumber=0;
        this.rewardNumber= "rewardNumber";
        this.Price= 0.0;
        this.CartNumber = "NA";
    }


    /** NAME: Cart
     PARAMETERS: String fname, String lname, String rNum, String email
     PURPOSE: assign values to variables
     PRECONDITION: none
     POSTCONDITION: no return, just variables assigned
     */
    public Cart(int cItems, int cNumber, String rewardnumber, double price, String Cartnumber)
    {
        this.cartItems= cItems;
        this.cartNumber= cNumber;
        this.rewardNumber= rewardnumber;
        this.Price= price;
        this.CartNumber = Cartnumber;

    }


    /** NAME: toString
     PARAMETERS: none
     PURPOSE: return string
     PRECONDITION: none
     POSTCONDITION: returning string for object
     */
    public String toString()
    {
        return ("Number of Carts:\t\t\t\t" + cartNumber + "rewardNumber:" + rewardNumber + "\nNumber of Cart Items:\t\t\t" + cartItems  + "\nCart Number:\t\t\t" + CartNumber +  "\nAmount:\t\t\t" + Price);
    }
}
