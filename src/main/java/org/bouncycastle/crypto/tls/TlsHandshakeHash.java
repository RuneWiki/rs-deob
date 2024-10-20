package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    TlsHandshakeHash notifyPRFDetermined();

    void init(TlsContext arg0);

    void trackHashAlgorithm(short arg0);

    void sealHashAlgorithms();

    TlsHandshakeHash stopTracking();

    Digest forkPRFHash();

    byte[] getFinalHash(short arg0);
}
