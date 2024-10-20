package org.bouncycastle.crypto;

public interface Digest {

    int getDigestSize();

    void update(byte arg0);

    String getAlgorithmName();

    void update(byte[] arg0, int arg1, int arg2);

    int doFinal(byte[] arg0, int arg1);

    void reset();
}
