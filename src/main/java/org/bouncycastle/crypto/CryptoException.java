package org.bouncycastle.crypto;

public class CryptoException extends Exception {

    public Throwable cause;

    public Throwable getCause() {
        return this.cause;
    }

    public CryptoException(String arg0) {
        super(arg0);
    }

    public CryptoException(String arg0, Throwable arg1) {
        super(arg0);
        this.cause = arg1;
    }

    public CryptoException() {
    }
}
