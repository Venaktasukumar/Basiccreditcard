package org.example;
import java.util.*;
import java.util.logging.*;

class Basiccreditcard implements Cloneable{
    String name;
    int creditcardNumber;
    String expirationDate;
    public Basiccreditcard(String name, int creditcardNumber, String expirationDate){
        this.name=name;
        this.creditcardNumber=creditcardNumber;
        this.expirationDate=expirationDate;
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String equaal(Basiccreditcard s){
        if(creditcardNumber == s.creditcardNumber){
            return "true";
        }
        return "false";
    }
    public void compare(int credit){
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
        l.info("name1:");
        String naMe=sc.nextLine();
        l.info("no1:");
        int creditcardnumber=sc.nextInt();
        sc.nextLine();
        l.info("date1:");
        String expirationdate=sc.nextLine();
        l.info("Enter the new person credit card number:");
        int c1=sc.nextInt();
        Basiccreditcard ba=new Basiccreditcard(naMe,creditcardnumber,expirationdate);
        ba.compare(c1);
        Basiccreditcard ba1=(Basiccreditcard) ba.clone();
        String k=ba.equaal(ba1);
        l.info(k);
        sc.close();
    }
}