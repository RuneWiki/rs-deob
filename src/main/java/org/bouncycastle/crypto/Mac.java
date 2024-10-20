package org.bouncycastle.crypto;

public interface Mac {

    String getAlgorithmName();

    void init(CipherParameters arg0) throws IllegalArgumentException;

    int getMacSize();

    void update(byte arg0) throws IllegalStateException;

    void update(byte[] arg0, int arg1, int arg2) throws DataLengthException, IllegalStateException;

    int doFinal(byte[] arg0, int arg1) throws DataLengthException, IllegalStateException;

    void reset();
}
