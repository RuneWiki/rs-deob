package org.bouncycastle.crypto;

public interface Signer {

    boolean verifySignature(byte[] arg0);

    void reset();

    void update(byte[] arg0, int arg1, int arg2);

    byte[] generateSignature() throws CryptoException, DataLengthException;

    void init(boolean arg0, CipherParameters arg1);

    void update(byte arg0);
}
