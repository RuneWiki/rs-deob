package org.bouncycastle.crypto;

public class InvalidCipherTextException extends CryptoException {

    public InvalidCipherTextException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public InvalidCipherTextException(String arg0) {
        super(arg0);
    }

    public InvalidCipherTextException() {
    }
}
