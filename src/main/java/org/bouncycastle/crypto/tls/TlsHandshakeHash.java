package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    byte[] getFinalHash(short arg0);

    TlsHandshakeHash notifyPRFDetermined();

    void trackHashAlgorithm(short arg0);

    void sealHashAlgorithms();

    void init(TlsContext arg0);

    Digest forkPRFHash();

    TlsHandshakeHash stopTracking();
}
