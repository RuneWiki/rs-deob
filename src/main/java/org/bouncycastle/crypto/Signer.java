package org.bouncycastle.crypto;

public interface Signer {

    void update(byte[] arg0, int arg1, int arg2);

    void init(boolean arg0, CipherParameters arg1);

    byte[] generateSignature() throws CryptoException, DataLengthException;

    void reset();

    boolean verifySignature(byte[] arg0);

    void update(byte arg0);
}
