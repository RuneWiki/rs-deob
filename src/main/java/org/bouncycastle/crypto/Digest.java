package org.bouncycastle.crypto;

public interface Digest {

    int doFinal(byte[] arg0, int arg1);

    void reset();

    void update(byte arg0);

    void update(byte[] arg0, int arg1, int arg2);

    int getDigestSize();

    String getAlgorithmName();
}
