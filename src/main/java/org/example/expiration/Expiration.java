package org.example.expiration;

import java.util.Date;

public interface Expiration {
    Date getExpiry();
    boolean isExpired();
}
