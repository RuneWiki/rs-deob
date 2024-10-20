package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    void trackHashAlgorithm(short arg0);

    byte[] getFinalHash(short arg0);

    TlsHandshakeHash stopTracking();

    void sealHashAlgorithms();

    TlsHandshakeHash notifyPRFDetermined();

    Digest forkPRFHash();

    void init(TlsContext arg0);
}
