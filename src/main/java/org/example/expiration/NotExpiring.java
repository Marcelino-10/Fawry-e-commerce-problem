package org.example.expiration;

import org.example.expiration.Expiration;

import java.util.Date;

public class NotExpiring implements Expiration {
    public Date getExpiry(){
        return null;
    }

    public boolean isExpired(){
        return false;
    }
}
