package org.example.expiration;

import org.example.expiration.Expiration;

import java.util.Date;

public class ExpiringItem implements Expiration {
    Date expiryDate;

    public ExpiringItem(Date expiryDate){
        this.expiryDate = expiryDate;
    }
    public Date getExpiry(){
        return this.expiryDate;
    }

    public boolean isExpired(){
        Date date = new Date();
        System.out.println(date);
        if(date.after(expiryDate))
            return true;
        else return false;
    }
}
