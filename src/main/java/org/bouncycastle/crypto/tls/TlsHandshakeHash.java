package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    TlsHandshakeHash notifyPRFDetermined();

    TlsHandshakeHash stopTracking();

    void trackHashAlgorithm(short arg0);

    void sealHashAlgorithms();

    void init(TlsContext arg0);

    Digest forkPRFHash();

    byte[] getFinalHash(short arg0);
}
