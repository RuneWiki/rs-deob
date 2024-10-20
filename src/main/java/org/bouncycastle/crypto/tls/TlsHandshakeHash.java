package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    TlsHandshakeHash stopTracking();

    TlsHandshakeHash notifyPRFDetermined();

    void trackHashAlgorithm(short arg0);

    void sealHashAlgorithms();

    Digest forkPRFHash();

    void init(TlsContext arg0);

    byte[] getFinalHash(short arg0);
}
