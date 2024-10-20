package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    TlsHandshakeHash stopTracking();

    void init(TlsContext arg0);

    void trackHashAlgorithm(short arg0);

    void sealHashAlgorithms();

    TlsHandshakeHash notifyPRFDetermined();

    Digest forkPRFHash();

    byte[] getFinalHash(short arg0);
}
