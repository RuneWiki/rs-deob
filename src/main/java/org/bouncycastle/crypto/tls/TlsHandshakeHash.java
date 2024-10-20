package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    void init(TlsContext arg0);

    TlsHandshakeHash notifyPRFDetermined();

    void trackHashAlgorithm(short arg0);

    void sealHashAlgorithms();

    Digest forkPRFHash();

    TlsHandshakeHash stopTracking();

    byte[] getFinalHash(short arg0);
}
