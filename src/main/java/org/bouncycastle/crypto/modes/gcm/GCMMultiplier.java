package org.bouncycastle.crypto.modes.gcm;

public interface GCMMultiplier {

    void init(byte[] arg0);

    void multiplyH(byte[] arg0);
}
