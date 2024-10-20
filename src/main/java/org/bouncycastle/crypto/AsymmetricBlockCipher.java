package org.bouncycastle.crypto;

public interface AsymmetricBlockCipher {

    byte[] processBlock(byte[] arg0, int arg1, int arg2) throws InvalidCipherTextException;

    int getInputBlockSize();

    int getOutputBlockSize();

    void init(boolean arg0, CipherParameters arg1);
}
