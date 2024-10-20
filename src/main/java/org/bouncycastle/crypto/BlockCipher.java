package org.bouncycastle.crypto;

public interface BlockCipher {

    int getBlockSize();

    String getAlgorithmName();

    void init(boolean arg0, CipherParameters arg1) throws IllegalArgumentException;

    int processBlock(byte[] arg0, int arg1, byte[] arg2, int arg3) throws DataLengthException, IllegalStateException;

    void reset();
}
