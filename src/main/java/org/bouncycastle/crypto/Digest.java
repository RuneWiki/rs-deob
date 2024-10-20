package org.bouncycastle.crypto;

public interface Digest {

    void reset();

    void update(byte[] arg0, int arg1, int arg2);

    void update(byte arg0);

    int getDigestSize();

    int doFinal(byte[] arg0, int arg1);

    String getAlgorithmName();
}
