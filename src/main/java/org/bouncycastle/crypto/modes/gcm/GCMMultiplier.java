package org.bouncycastle.crypto.modes.gcm;

public interface GCMMultiplier {

    void multiplyH(byte[] arg0);

    void init(byte[] arg0);
}
