package org.bouncycastle.crypto;

public interface BlockCipher {

    String getAlgorithmName();

    int processBlock(byte[] arg0, int arg1, byte[] arg2, int arg3) throws DataLengthException, IllegalStateException;

    int getBlockSize();

    void reset();

    void init(boolean arg0, CipherParameters arg1) throws IllegalArgumentException;
}
