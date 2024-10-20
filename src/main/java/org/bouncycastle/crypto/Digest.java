package org.bouncycastle.crypto;

public interface Digest {

    int getDigestSize();

    void update(byte[] arg0, int arg1, int arg2);

    void reset();

    void update(byte arg0);

    int doFinal(byte[] arg0, int arg1);

    String getAlgorithmName();
}
