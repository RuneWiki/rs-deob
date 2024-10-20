package org.bouncycastle.crypto;

public interface Mac {

    void reset();

    String getAlgorithmName();

    void update(byte arg0) throws IllegalStateException;

    void init(CipherParameters arg0) throws IllegalArgumentException;

    int getMacSize();

    int doFinal(byte[] arg0, int arg1) throws DataLengthException, IllegalStateException;

    void update(byte[] arg0, int arg1, int arg2) throws DataLengthException, IllegalStateException;
}
