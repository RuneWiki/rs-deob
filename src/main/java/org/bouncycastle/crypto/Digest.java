package org.bouncycastle.crypto;

public interface Digest {

    void update(byte[] arg0, int arg1, int arg2);

    int getDigestSize();

    void update(byte arg0);

    void reset();

    String getAlgorithmName();

    int doFinal(byte[] arg0, int arg1);
}
