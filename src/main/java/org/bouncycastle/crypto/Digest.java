package org.bouncycastle.crypto;

public interface Digest {

    String getAlgorithmName();

    int getDigestSize();

    void update(byte arg0);

    void reset();

    int doFinal(byte[] arg0, int arg1);

    void update(byte[] arg0, int arg1, int arg2);
}
