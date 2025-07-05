package org.example.expiration;

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
        if(date.after(getExpiry()))
            return true;
        else return false;
    }
}
