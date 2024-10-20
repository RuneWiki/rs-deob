package org.bouncycastle.crypto;

public interface AsymmetricBlockCipher {

    int getOutputBlockSize();

    int getInputBlockSize();

    byte[] processBlock(byte[] arg0, int arg1, int arg2) throws InvalidCipherTextException;

    void init(boolean arg0, CipherParameters arg1);
}
