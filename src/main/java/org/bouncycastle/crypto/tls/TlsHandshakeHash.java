package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    TlsHandshakeHash stopTracking();

    TlsHandshakeHash notifyPRFDetermined();

    void sealHashAlgorithms();

    void trackHashAlgorithm(short arg0);

    void init(TlsContext arg0);

    Digest forkPRFHash();

    byte[] getFinalHash(short arg0);
}
