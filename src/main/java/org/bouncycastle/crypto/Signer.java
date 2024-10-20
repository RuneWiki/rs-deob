package org.bouncycastle.crypto;

public interface Signer {

    void reset();

    void init(boolean arg0, CipherParameters arg1);

    void update(byte arg0);

    void update(byte[] arg0, int arg1, int arg2);

    boolean verifySignature(byte[] arg0);

    byte[] generateSignature() throws CryptoException, DataLengthException;
}
