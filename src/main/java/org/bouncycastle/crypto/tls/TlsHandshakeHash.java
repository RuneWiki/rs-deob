package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    Digest forkPRFHash();

    TlsHandshakeHash notifyPRFDetermined();

    void init(TlsContext arg0);

    void sealHashAlgorithms();

    TlsHandshakeHash stopTracking();

    void trackHashAlgorithm(short arg0);

    byte[] getFinalHash(short arg0);
}
