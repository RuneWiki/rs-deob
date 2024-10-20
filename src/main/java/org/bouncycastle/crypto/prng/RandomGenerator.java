package org.bouncycastle.crypto.prng;

public interface RandomGenerator {

    void nextBytes(byte[] arg0);

    void addSeedMaterial(long arg0);

    void nextBytes(byte[] arg0, int arg1, int arg2);

    void addSeedMaterial(byte[] arg0);
}
