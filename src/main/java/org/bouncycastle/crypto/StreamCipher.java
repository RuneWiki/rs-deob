package org.bouncycastle.crypto;

public interface StreamCipher {

    void reset();

    void init(boolean arg0, CipherParameters arg1) throws IllegalArgumentException;

    byte returnByte(byte arg0);

    String getAlgorithmName();

    int processBytes(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws DataLengthException;
}
