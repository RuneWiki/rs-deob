package org.bouncycastle.crypto;

public interface Signer {

    void update(byte arg0);

    void reset();

    void update(byte[] arg0, int arg1, int arg2);

    byte[] generateSignature() throws CryptoException, DataLengthException;

    boolean verifySignature(byte[] arg0);

    void init(boolean arg0, CipherParameters arg1);
}
