package org.bouncycastle.crypto;

public interface AsymmetricBlockCipher {

    int getInputBlockSize();

    void init(boolean arg0, CipherParameters arg1);

    int getOutputBlockSize();

    byte[] processBlock(byte[] arg0, int arg1, int arg2) throws InvalidCipherTextException;
}
