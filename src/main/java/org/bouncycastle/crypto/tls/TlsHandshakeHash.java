package org.bouncycastle.crypto.tls;

import org.bouncycastle.crypto.Digest;

public interface TlsHandshakeHash extends Digest {

    TlsHandshakeHash notifyPRFDetermined();

    byte[] getFinalHash(short arg0);

    void trackHashAlgorithm(short arg0);

    void sealHashAlgorithms();

    TlsHandshakeHash stopTracking();

    Digest forkPRFHash();

    void init(TlsContext arg0);
}
