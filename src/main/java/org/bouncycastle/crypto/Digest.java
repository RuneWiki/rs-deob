package org.bouncycastle.crypto;

public interface Digest {

    int doFinal(byte[] arg0, int arg1);

    int getDigestSize();

    void update(byte arg0);

    String getAlgorithmName();

    void update(byte[] arg0, int arg1, int arg2);

    void reset();
}
