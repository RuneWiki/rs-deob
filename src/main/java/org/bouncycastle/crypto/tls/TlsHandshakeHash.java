package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    void init(TlsContext arg0);

    TlsHandshakeHash notifyPRFDetermined();

    void trackHashAlgorithm(short arg0);

    Digest forkPRFHash();

    TlsHandshakeHash stopTracking();

    void sealHashAlgorithms();

    byte[] getFinalHash(short arg0);
}
