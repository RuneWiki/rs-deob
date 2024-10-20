package org.bouncycastle.crypto;

public interface Mac {

    void init(CipherParameters arg0) throws IllegalArgumentException;

    String getAlgorithmName();

    void reset();

    int getMacSize();

    void update(byte[] arg0, int arg1, int arg2) throws DataLengthException, IllegalStateException;

    int doFinal(byte[] arg0, int arg1) throws DataLengthException, IllegalStateException;

    void update(byte arg0) throws IllegalStateException;
}
