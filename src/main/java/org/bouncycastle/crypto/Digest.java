package org.bouncycastle.crypto;

public interface Digest {

    void reset();

    int getDigestSize();

    void update(byte arg0);

    void update(byte[] arg0, int arg1, int arg2);

    int doFinal(byte[] arg0, int arg1);

    String getAlgorithmName();
}
