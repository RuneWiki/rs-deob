package org.bouncycastle.crypto;

public interface Mac {

    void init(CipherParameters arg0) throws IllegalArgumentException;

    int getMacSize();

    void reset();

    void update(byte arg0) throws IllegalStateException;

    void update(byte[] arg0, int arg1, int arg2) throws DataLengthException, IllegalStateException;

    int doFinal(byte[] arg0, int arg1) throws DataLengthException, IllegalStateException;

    String getAlgorithmName();
}
