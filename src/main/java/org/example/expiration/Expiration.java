package org.example.expiration;

import java.util.Date;

public interface Expiration {
    public abstract Date getExpiry();
    public abstract boolean isExpired();
}
