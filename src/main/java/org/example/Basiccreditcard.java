package org.example;
import java.util.*;
import java.util.logging.*;

public class Basiccreditcard implements Cloneable{
    String name;
    long creditcardNumber;
    String expirationDate;
    public Basiccreditcard(String name, long creditcardNumber, String expirationDate){
        this.name=name;
        this.creditcardNumber=creditcardNumber;
        this.expirationDate=expirationDate;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String equally(Basiccreditcard s){
        if(creditcardNumber == s.creditcardNumber){
            return "true";
        }
        return "false";
    }
    public void compare(long credit){
        Logger l = Logger.getLogger("com.api.jar");
        if(creditcardNumber==credit){
            l.info("Both are same");
        }
        else{
            l.info("Both are not same");
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException{
        Logger l = Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);
        l.info("name:");
        String naMe = sc.nextLine();
        l.info("credit card number:");
        long creditcardnumber = sc.nextLong();
        sc.nextLine();
        l.info("Expiry Date:");
        String expirationdate = sc.nextLine();
        l.info("Enter the new person credit card number:");
        long c1 = sc.nextLong();
        l.info("checking whether two credit card numbers same or not");
        Basiccreditcard ba = new Basiccreditcard(naMe, creditcardnumber, expirationdate);
        ba.compare(c1);
        l.info("After cloning");
        Basiccreditcard ba1 = (Basiccreditcard) ba.clone();
        String k = ba.equally(ba1);
        l.info(k);
        sc.close();
    }
}