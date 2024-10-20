package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    void trackHashAlgorithm(short arg0);

    TlsHandshakeHash notifyPRFDetermined();

    void sealHashAlgorithms();

    void init(TlsContext arg0);

    TlsHandshakeHash stopTracking();

    Digest forkPRFHash();

    byte[] getFinalHash(short arg0);
}
