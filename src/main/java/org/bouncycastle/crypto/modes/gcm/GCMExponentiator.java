package org.bouncycastle.crypto.modes.gcm;

public interface GCMExponentiator {

    void init(byte[] arg0);

    void exponentiateX(long arg0, byte[] arg1);
}
