package org.bouncycastle.crypto;

public interface AsymmetricBlockCipher {

    byte[] processBlock(byte[] arg0, int arg1, int arg2) throws InvalidCipherTextException;

    void init(boolean arg0, CipherParameters arg1);

    int getInputBlockSize();

    int getOutputBlockSize();
}
