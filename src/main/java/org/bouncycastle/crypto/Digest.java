package org.bouncycastle.crypto;

public interface Digest {

    String getAlgorithmName();

    int getDigestSize();

    void reset();

    void update(byte[] arg0, int arg1, int arg2);

    void update(byte arg0);

    int doFinal(byte[] arg0, int arg1);
}
