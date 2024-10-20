package org.bouncycastle.crypto.modes.gcm;

public interface GCMExponentiator {

    void exponentiateX(long arg0, byte[] arg1);

    void init(byte[] arg0);
}
