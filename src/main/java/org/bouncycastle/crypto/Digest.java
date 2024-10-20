package org.bouncycastle.crypto;

public interface Digest {

    void update(byte arg0);

    String getAlgorithmName();

    int doFinal(byte[] arg0, int arg1);

    void update(byte[] arg0, int arg1, int arg2);

    void reset();

    int getDigestSize();
}
