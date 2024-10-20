package org.bouncycastle.crypto;

public interface Digest {

    String getAlgorithmName();

    int getDigestSize();

    void update(byte arg0);

    void update(byte[] arg0, int arg1, int arg2);

    int doFinal(byte[] arg0, int arg1);

    void reset();
}
