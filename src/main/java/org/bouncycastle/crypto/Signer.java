package org.bouncycastle.crypto;

public interface Signer {

    void update(byte arg0);

    void init(boolean arg0, CipherParameters arg1);

    void update(byte[] arg0, int arg1, int arg2);

    void reset();

    boolean verifySignature(byte[] arg0);

    byte[] generateSignature() throws CryptoException, DataLengthException;
}
