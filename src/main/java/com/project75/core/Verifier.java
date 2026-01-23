package com.project75.core;

import java.io.Serializable;

/**
 *
 * @author Aryan
 */
public class Verifier implements Serializable {
    private String UID;
    private String salt;
    private String hashedPassword;

    public String getHashedPassword() {
        return hashedPassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }


    public Verifier(String UID, String salt, String hashedPassword) {
        this.UID = UID;
        this.salt = salt;
        this.hashedPassword = hashedPassword;
    }
    
}
