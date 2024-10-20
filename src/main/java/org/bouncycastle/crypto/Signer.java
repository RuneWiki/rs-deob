package org.bouncycastle.crypto;

public interface Signer {

    byte[] generateSignature() throws CryptoException, DataLengthException;

    void update(byte[] arg0, int arg1, int arg2);

    void reset();

    void update(byte arg0);

    boolean verifySignature(byte[] arg0);

    void init(boolean arg0, CipherParameters arg1);
}
