package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    void sealHashAlgorithms();

    TlsHandshakeHash notifyPRFDetermined();

    void trackHashAlgorithm(short arg0);

    Digest forkPRFHash();

    TlsHandshakeHash stopTracking();

    void init(TlsContext arg0);

    byte[] getFinalHash(short arg0);
}
